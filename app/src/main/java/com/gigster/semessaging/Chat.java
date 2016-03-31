package com.gigster.semessaging;

import android.util.Log;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

class Chat implements Serializable {
    private int urgency;
    private final String imageUri;
    private final String chatName;
    private String gigID;
    private ArrayList<ChatMessage> chat;

    public Chat(){
        imageUri = "https://pbs.twimg.com/profile_images/562466745340817408/_nIu8KHX.jpeg";
        chatName = "TestChatName";
        urgency = 2;
    }
    public Chat(String imgUri, String chatName, String gigID){
        this.urgency=0;
        this.imageUri=imgUri;
        this.chatName=chatName;
        this.gigID = gigID;
        this.chat = new ArrayList<ChatMessage>();
    }

    public int getUrgency(){
        return urgency;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getChatName() {
        return chatName;
    }

    public String getMostRecentMsg() {
        if(chat!=null && chat.size()>0){
            return chat.get(chat.size()-1).getText();
        }
        return "Default Recent Message";
    }

    public String getTimeSinceMessage(){
        if(chat!=null && chat.size()>0){
            Date d = new Date();
            long millis = d.getTime()-chat.get(chat.size()-1).getDate().getTime();
            long second = (millis / 1000) % 60;
            long minute = (millis / (1000 * 60)) % 60;
            long hour = (millis / (1000 * 60 * 60)) % 24;
            if (hour>0)
            {
                if(hour>2)
                    urgency=2;
                else
                    urgency=1;
                return String.valueOf(hour) + "h " + String.valueOf(minute) +"m";
            }
            else
            {
                urgency = 0;
                return String.valueOf(minute) + "m " + String.valueOf(second) +"s";
            }
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
}
