package com.gigster.semessaging;

import android.util.Log;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

class Chat implements Serializable, Comparable<Chat> {
    private int urgency;
    private final String imageUri;
    private final String chatName;
    private String gigID;
    private String phoneNumber;
    private ArrayList<ChatMessage> chat;

    public Chat(){
        imageUri = "https://pbs.twimg.com/profile_images/562466745340817408/_nIu8KHX.jpeg";
        chatName = "TestChatName";
        urgency = 2;
        String number = null;
    }

    public Chat(String imgUri, String chatName, String gigID){
        this.urgency=0;
        this.imageUri=imgUri;
        this.chatName=chatName;
        this.gigID = gigID;
        this.chat = new ArrayList<ChatMessage>();
        this.phoneNumber = null;
    }

    public Chat(String imgUri, String chatName, String gigID, String number){
        this.urgency=0;
        this.imageUri=imgUri;
        this.chatName=chatName;
        this.gigID = gigID;
        this.chat = new ArrayList<ChatMessage>();
        this.phoneNumber = number;
    }

    public int getUrgency(){
        return urgency;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getChatName() {
        String name = chatName;
        if(name.length()>25)
            name = name.substring(0, 25) + "...";
        return name;
    }

    public String getMostRecentMsg() {
        if(chat!=null && chat.size()>0){
            String msg = chat.get(chat.size()-1).getText();
            if(msg.length()>30)
                msg = msg.substring(0, 30) + "...";
            return msg;
        }
        return "Loading Message...";
    }

    public long getMillisSinceLastMessage(){
        if(chat==null || chat.size()==0)
            return -1;
        Date d = new Date();
        long millis = d.getTime()-chat.get(chat.size()-1).getDate().getTime();
        return millis;
    }

    public String getTimeSinceMessage(){
        if(chat!=null && chat.size()>0){
            long millis = getMillisSinceLastMessage();
            long second = (millis / 1000) % 60;
            long minute = (millis / (1000 * 60)) % 60;
            long hour = (millis / (1000 * 60 * 60)) % 24;
            long day = (millis / (1000 * 60 * 60 * 24)) % 365;

            if(millis>1000*60*60*24)
                urgency=2;
            else if(millis>1000*60*60*5)
                urgency=1;
            else
                urgency=0;
            StringBuilder sb = new StringBuilder();
            if(day!=0)
                sb.append(day + "d ");
            if(hour!=0)
                sb.append(hour + "h ");
            if(minute!=0)
                sb.append(minute + "m ");
            if(second!=0)
                sb.append(second + "s");

            return sb.toString().trim();

        }
        return "Default Time Message";
    }

    public String getGigID() { return gigID;}

    public ArrayList<ChatMessage> getChat() {
        return chat;
    }

    @Override public boolean equals(Object obj){
        EqualsBuilder builder = new EqualsBuilder().append(this.getGigID(), ((Chat)obj).getGigID());
        return builder.isEquals();
    }

    public int compareTo(Chat c) {
        long selfTime = getMillisSinceLastMessage();
        long otherTime = c.getMillisSinceLastMessage();
        if(selfTime==-1)
            return 1;
        else if(otherTime==-1)
            return -1;
        return Long.valueOf(selfTime).compareTo(Long.valueOf(otherTime));
    }
}
