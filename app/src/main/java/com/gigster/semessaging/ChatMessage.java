package com.gigster.semessaging;

import java.util.Date;

class ChatMessage {
    private final String text;
    private final Date date;
    private final boolean isMine;

    public ChatMessage(String text, Date date, boolean isMine){
        this.text=text;
        this.date=date;
        this.isMine=isMine;
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
