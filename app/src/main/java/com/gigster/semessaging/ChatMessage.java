package com.gigster.semessaging;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class ChatMessage implements Serializable {

    private boolean isWireFrame;
    private boolean showAuto;
    private boolean isAuto;
    private boolean toClient;
    private boolean isProposalReady;
    private long timestamp;
    private String firstName;
    private String avatar;
    private String type;
    private final String text;
    private final Date date;
    private final boolean isMine;
    private final String gigID;
    private boolean read;
    private String myID;
    private String messageKey;
    private ArrayList<HashMap> readSnippets;

    public ChatMessage(String text, Date date, boolean isMine, String type, String gigID, String myID){
        this.text=text;
        this.date=date;
        this.isMine=isMine;
        this.toClient = isMine;
        this.timestamp = date.getTime();
        this.type = type;
        this.isWireFrame = false;
        this.isAuto = false;
        this.showAuto = false;
        this.gigID = gigID;
        this.read = false;
        this.myID=myID;
        this.messageKey = "";
        this.readSnippets = new ArrayList<>();
    }

    public ChatMessage(HashMap map, String gigID, String myID, String messageKey){
        if(map.containsKey("firstName"))
            firstName = (String) map.get("firstName");
        else
            firstName = "";
        if(map.containsKey("avatar"))
            avatar = (String) map.get("avatar");
        else
            avatar = "";

        if(map.containsKey("toClient"))
            toClient = Boolean.valueOf(map.get("toClient").toString());
        else
            toClient = false;

        type = (String) map.get("type");
        type = type.trim();
        if(type.equals("phonecall"))
            if(toClient)
                text = "You made a phone call";
            else
                text = "The client made a phone call";
        else if(type.equals("email"))
            if(toClient)
                text = "You sent an email";
            else
                text = "The client sent an email";
        else if(type.equals("text"))
            text = EmojiParser.demojizedText((String) map.get("text"));
        else
            text = type;

        if(map.containsKey("isWireframe"))
            isWireFrame = Boolean.valueOf(map.get("isWireframe").toString());
        else
            isWireFrame = false;
        if(map.containsKey("showAuto"))
            showAuto = Boolean.valueOf(map.get("showAuto").toString());
        else
            showAuto = false;
        if(map.containsKey("isAuto"))
            isAuto = Boolean.valueOf( map.get("isAuto").toString());
        else
            isAuto = false;
        if(map.containsKey("isProposalReady"))
            isProposalReady = Boolean.valueOf(map.get("isProposalReady").toString());
        else
            isProposalReady = false;

        timestamp = (Long) map.get("timestamp");
        date = new Date(timestamp);
        isMine = toClient;
        this.gigID=gigID;
        this.myID = myID;
        this.messageKey = messageKey;

        if(this.isMine || this.type.equals("typing"))
            this.read = true;
        else
            this.read = false;
        if(map.containsKey("read") && !this.isMine){
            readSnippets = (ArrayList<HashMap>) map.get("read");

            for(HashMap readEvent: readSnippets) {
                String readBy = (String) readEvent.get("id");
                if (readBy.equals(this.myID)) {
                    this.read = true;
                    break;
                }
            }
        }
        else{
            readSnippets = new ArrayList<>();
        }

    }

    public void readIt(){
        if(!read){
            HashMap myRead = new HashMap();
            myRead.put("id", myID);
            myRead.put("timestamp", new Date().getTime());
            readSnippets.add(myRead);
            read = true;
        }
    }

    public ArrayList<HashMap> getReadSnippets() {
        return readSnippets;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public String getMyID() {
        return myID;
    }

    public boolean isMine() {
        return isMine;
    }

    public String getGigID() {
        return gigID;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public boolean isRead() {
        return read;
    }

    public HashMap<String, Object> toMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("firstName", firstName);
        map.put("avatar", avatar);
        map.put("text", EmojiParser.emojiText(text));
        map.put("type",type);
        map.put("isWireframe",type);
        map.put("showAuto",showAuto);
        map.put("isAuto",isAuto);
        map.put("toClient",toClient);
        map.put("isProposalReady",isProposalReady);
        map.put("timestamp",timestamp);
        map.put("read",readSnippets);
        return map;
    }

    @Override public boolean equals(Object obj){
        EqualsBuilder builder = new EqualsBuilder().append(this.getTimestamp(), ((ChatMessage)obj).getTimestamp());
        return builder.isEquals();
    }

    public String toString(){
        return toMap().toString();
    }
}
