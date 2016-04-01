
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Meta {

    @SerializedName("chats")
    @Expose
    private long chats;
    @SerializedName("chatsCharacterCount")
    @Expose
    private long chatsCharacterCount;
    @SerializedName("chatsClient")
    @Expose
    private long chatsClient;
    @SerializedName("chatsClientCharacterCount")
    @Expose
    private long chatsClientCharacterCount;
    @SerializedName("chatsPOC")
    @Expose
    private long chatsPOC;
    @SerializedName("chatsPOCCharacterCount")
    @Expose
    private long chatsPOCCharacterCount;
    @SerializedName("chatsPOCOnline")
    @Expose
    private long chatsPOCOnline;
    @SerializedName("chatsPOCOffline")
    @Expose
    private long chatsPOCOffline;
    @SerializedName("emails")
    @Expose
    private long emails;
    @SerializedName("emailsClient")
    @Expose
    private long emailsClient;
    @SerializedName("emailsPOC")
    @Expose
    private long emailsPOC;
    @SerializedName("phoneCalls")
    @Expose
    private long phoneCalls;
    @SerializedName("responseTime")
    @Expose
    private long responseTime;

    /**
     * 
     * @return
     *     The chats
     */
    public long getChats() {
        return chats;
    }

    /**
     * 
     * @param chats
     *     The chats
     */
    public void setChats(long chats) {
        this.chats = chats;
    }

    /**
     * 
     * @return
     *     The chatsCharacterCount
     */
    public long getChatsCharacterCount() {
        return chatsCharacterCount;
    }

    /**
     * 
     * @param chatsCharacterCount
     *     The chatsCharacterCount
     */
    public void setChatsCharacterCount(long chatsCharacterCount) {
        this.chatsCharacterCount = chatsCharacterCount;
    }

    /**
     * 
     * @return
     *     The chatsClient
     */
    public long getChatsClient() {
        return chatsClient;
    }

    /**
     * 
     * @param chatsClient
     *     The chatsClient
     */
    public void setChatsClient(long chatsClient) {
        this.chatsClient = chatsClient;
    }

    /**
     * 
     * @return
     *     The chatsClientCharacterCount
     */
    public long getChatsClientCharacterCount() {
        return chatsClientCharacterCount;
    }

    /**
     * 
     * @param chatsClientCharacterCount
     *     The chatsClientCharacterCount
     */
    public void setChatsClientCharacterCount(long chatsClientCharacterCount) {
        this.chatsClientCharacterCount = chatsClientCharacterCount;
    }

    /**
     * 
     * @return
     *     The chatsPOC
     */
    public long getChatsPOC() {
        return chatsPOC;
    }

    /**
     * 
     * @param chatsPOC
     *     The chatsPOC
     */
    public void setChatsPOC(long chatsPOC) {
        this.chatsPOC = chatsPOC;
    }

    /**
     * 
     * @return
     *     The chatsPOCCharacterCount
     */
    public long getChatsPOCCharacterCount() {
        return chatsPOCCharacterCount;
    }

    /**
     * 
     * @param chatsPOCCharacterCount
     *     The chatsPOCCharacterCount
     */
    public void setChatsPOCCharacterCount(long chatsPOCCharacterCount) {
        this.chatsPOCCharacterCount = chatsPOCCharacterCount;
    }

    /**
     * 
     * @return
     *     The chatsPOCOnline
     */
    public long getChatsPOCOnline() {
        return chatsPOCOnline;
    }

    /**
     * 
     * @param chatsPOCOnline
     *     The chatsPOCOnline
     */
    public void setChatsPOCOnline(long chatsPOCOnline) {
        this.chatsPOCOnline = chatsPOCOnline;
    }

    /**
     * 
     * @return
     *     The chatsPOCOffline
     */
    public long getChatsPOCOffline() {
        return chatsPOCOffline;
    }

    /**
     * 
     * @param chatsPOCOffline
     *     The chatsPOCOffline
     */
    public void setChatsPOCOffline(long chatsPOCOffline) {
        this.chatsPOCOffline = chatsPOCOffline;
    }

    /**
     * 
     * @return
     *     The emails
     */
    public long getEmails() {
        return emails;
    }

    /**
     * 
     * @param emails
     *     The emails
     */
    public void setEmails(long emails) {
        this.emails = emails;
    }

    /**
     * 
     * @return
     *     The emailsClient
     */
    public long getEmailsClient() {
        return emailsClient;
    }

    /**
     * 
     * @param emailsClient
     *     The emailsClient
     */
    public void setEmailsClient(long emailsClient) {
        this.emailsClient = emailsClient;
    }

    /**
     * 
     * @return
     *     The emailsPOC
     */
    public long getEmailsPOC() {
        return emailsPOC;
    }

    /**
     * 
     * @param emailsPOC
     *     The emailsPOC
     */
    public void setEmailsPOC(long emailsPOC) {
        this.emailsPOC = emailsPOC;
    }

    /**
     * 
     * @return
     *     The phoneCalls
     */
    public long getPhoneCalls() {
        return phoneCalls;
    }

    /**
     * 
     * @param phoneCalls
     *     The phoneCalls
     */
    public void setPhoneCalls(long phoneCalls) {
        this.phoneCalls = phoneCalls;
    }

    /**
     * 
     * @return
     *     The responseTime
     */
    public long getResponseTime() {
        return responseTime;
    }

    /**
     * 
     * @param responseTime
     *     The responseTime
     */
    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(chats).append(chatsCharacterCount).append(chatsClient).append(chatsClientCharacterCount).append(chatsPOC).append(chatsPOCCharacterCount).append(chatsPOCOnline).append(chatsPOCOffline).append(emails).append(emailsClient).append(emailsPOC).append(phoneCalls).append(responseTime).toHashCode();
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
        return new EqualsBuilder().append(chats, rhs.chats).append(chatsCharacterCount, rhs.chatsCharacterCount).append(chatsClient, rhs.chatsClient).append(chatsClientCharacterCount, rhs.chatsClientCharacterCount).append(chatsPOC, rhs.chatsPOC).append(chatsPOCCharacterCount, rhs.chatsPOCCharacterCount).append(chatsPOCOnline, rhs.chatsPOCOnline).append(chatsPOCOffline, rhs.chatsPOCOffline).append(emails, rhs.emails).append(emailsClient, rhs.emailsClient).append(emailsPOC, rhs.emailsPOC).append(phoneCalls, rhs.phoneCalls).append(responseTime, rhs.responseTime).isEquals();
    }

}
