
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Meta {

    private int chats;
    private int chatsCharacterCount;
    private int chatsClient;
    private int chatsClientCharacterCount;
    private int chatsPOC;
    private int chatsPOCCharacterCount;
    private int chatsPOCOnline;
    private int chatsPOCOffline;
    private int emails;
    private int emailsClient;
    private int emailsPOC;
    private int phoneCalls;
    private int responseTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The chats
     */
    public int getChats() {
        return chats;
    }

    /**
     * 
     * @param chats
     *     The chats
     */
    public void setChats(int chats) {
        this.chats = chats;
    }

    /**
     * 
     * @return
     *     The chatsCharacterCount
     */
    public int getChatsCharacterCount() {
        return chatsCharacterCount;
    }

    /**
     * 
     * @param chatsCharacterCount
     *     The chatsCharacterCount
     */
    public void setChatsCharacterCount(int chatsCharacterCount) {
        this.chatsCharacterCount = chatsCharacterCount;
    }

    /**
     * 
     * @return
     *     The chatsClient
     */
    public int getChatsClient() {
        return chatsClient;
    }

    /**
     * 
     * @param chatsClient
     *     The chatsClient
     */
    public void setChatsClient(int chatsClient) {
        this.chatsClient = chatsClient;
    }

    /**
     * 
     * @return
     *     The chatsClientCharacterCount
     */
    public int getChatsClientCharacterCount() {
        return chatsClientCharacterCount;
    }

    /**
     * 
     * @param chatsClientCharacterCount
     *     The chatsClientCharacterCount
     */
    public void setChatsClientCharacterCount(int chatsClientCharacterCount) {
        this.chatsClientCharacterCount = chatsClientCharacterCount;
    }

    /**
     * 
     * @return
     *     The chatsPOC
     */
    public int getChatsPOC() {
        return chatsPOC;
    }

    /**
     * 
     * @param chatsPOC
     *     The chatsPOC
     */
    public void setChatsPOC(int chatsPOC) {
        this.chatsPOC = chatsPOC;
    }

    /**
     * 
     * @return
     *     The chatsPOCCharacterCount
     */
    public int getChatsPOCCharacterCount() {
        return chatsPOCCharacterCount;
    }

    /**
     * 
     * @param chatsPOCCharacterCount
     *     The chatsPOCCharacterCount
     */
    public void setChatsPOCCharacterCount(int chatsPOCCharacterCount) {
        this.chatsPOCCharacterCount = chatsPOCCharacterCount;
    }

    /**
     * 
     * @return
     *     The chatsPOCOnline
     */
    public int getChatsPOCOnline() {
        return chatsPOCOnline;
    }

    /**
     * 
     * @param chatsPOCOnline
     *     The chatsPOCOnline
     */
    public void setChatsPOCOnline(int chatsPOCOnline) {
        this.chatsPOCOnline = chatsPOCOnline;
    }

    /**
     * 
     * @return
     *     The chatsPOCOffline
     */
    public int getChatsPOCOffline() {
        return chatsPOCOffline;
    }

    /**
     * 
     * @param chatsPOCOffline
     *     The chatsPOCOffline
     */
    public void setChatsPOCOffline(int chatsPOCOffline) {
        this.chatsPOCOffline = chatsPOCOffline;
    }

    /**
     * 
     * @return
     *     The emails
     */
    public int getEmails() {
        return emails;
    }

    /**
     * 
     * @param emails
     *     The emails
     */
    public void setEmails(int emails) {
        this.emails = emails;
    }

    /**
     * 
     * @return
     *     The emailsClient
     */
    public int getEmailsClient() {
        return emailsClient;
    }

    /**
     * 
     * @param emailsClient
     *     The emailsClient
     */
    public void setEmailsClient(int emailsClient) {
        this.emailsClient = emailsClient;
    }

    /**
     * 
     * @return
     *     The emailsPOC
     */
    public int getEmailsPOC() {
        return emailsPOC;
    }

    /**
     * 
     * @param emailsPOC
     *     The emailsPOC
     */
    public void setEmailsPOC(int emailsPOC) {
        this.emailsPOC = emailsPOC;
    }

    /**
     * 
     * @return
     *     The phoneCalls
     */
    public int getPhoneCalls() {
        return phoneCalls;
    }

    /**
     * 
     * @param phoneCalls
     *     The phoneCalls
     */
    public void setPhoneCalls(int phoneCalls) {
        this.phoneCalls = phoneCalls;
    }

    /**
     * 
     * @return
     *     The responseTime
     */
    public int getResponseTime() {
        return responseTime;
    }

    /**
     * 
     * @param responseTime
     *     The responseTime
     */
    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(chats).append(chatsCharacterCount).append(chatsClient).append(chatsClientCharacterCount).append(chatsPOC).append(chatsPOCCharacterCount).append(chatsPOCOnline).append(chatsPOCOffline).append(emails).append(emailsClient).append(emailsPOC).append(phoneCalls).append(responseTime).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return new EqualsBuilder().append(chats, rhs.chats).append(chatsCharacterCount, rhs.chatsCharacterCount).append(chatsClient, rhs.chatsClient).append(chatsClientCharacterCount, rhs.chatsClientCharacterCount).append(chatsPOC, rhs.chatsPOC).append(chatsPOCCharacterCount, rhs.chatsPOCCharacterCount).append(chatsPOCOnline, rhs.chatsPOCOnline).append(chatsPOCOffline, rhs.chatsPOCOffline).append(emails, rhs.emails).append(emailsClient, rhs.emailsClient).append(emailsPOC, rhs.emailsPOC).append(phoneCalls, rhs.phoneCalls).append(responseTime, rhs.responseTime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
