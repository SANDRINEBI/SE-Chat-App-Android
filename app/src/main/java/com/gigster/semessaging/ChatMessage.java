package com.gigster.semessaging;

import java.io.Serializable;
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

    public ChatMessage(String text, Date date, boolean isMine){
        this.text=text;
        this.date=date;
        this.isMine=isMine;
    }

    public ChatMessage(HashMap map){
        firstName = (String) map.get("firstName");
        avatar = (String) map.get("avatar");
        text = EmojiParser.demojizedText((String) map.get("text"));
        type = (String) map.get("type");
        isWireFrame = (Boolean) map.get("isWireframe");
        showAuto = (Boolean) map.get("showAuto");
        isAuto = (Boolean) map.get("isAuto");
        toClient = (Boolean) map.get("toClient");
        isProposalReady = (Boolean) map.get("isProposalReady");
        timestamp = (Long) map.get("timestamp");
        date = new Date(timestamp*1000L);
        isMine = toClient;
    }

    public boolean isMine() {
        return isMine;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }
}
