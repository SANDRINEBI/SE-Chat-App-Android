package com.gigster.semessaging;

import java.io.Serializable;

class Chat implements Serializable {
    private int urgency;
    private final String imageUri;
    private final String chatName;
    private String mostRecentMsg;

    public Chat(){
        imageUri = "https://pbs.twimg.com/profile_images/562466745340817408/_nIu8KHX.jpeg";
        chatName = "TestChatName";
        mostRecentMsg = "This is a test message";
        urgency = 2;
    }
    public Chat(String imgUri, String chatName, String mostRecentMsg, int urgency){
        this.urgency=urgency;
        this.imageUri=imgUri;
        this.chatName=chatName;
        this.mostRecentMsg=mostRecentMsg;
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
        return mostRecentMsg;
    }

    public String getTimeSinceMessage(){
        return "5m 20s";
    }
}
