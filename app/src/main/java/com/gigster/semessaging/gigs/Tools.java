
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Tools {

    @SerializedName("trello")
    @Expose
    private Trello trello;
    @SerializedName("slack")
    @Expose
    private Slack slack;
    @SerializedName("github")
    @Expose
    private Github github;

    /**
     * 
     * @return
     *     The trello
     */
    public Trello getTrello() {
        return trello;
    }

    /**
     * 
     * @param trello
     *     The trello
     */
    public void setTrello(Trello trello) {
        this.trello = trello;
    }

    /**
     * 
     * @return
     *     The slack
     */
    public Slack getSlack() {
        return slack;
    }

    /**
     * 
     * @param slack
     *     The slack
     */
    public void setSlack(Slack slack) {
        this.slack = slack;
    }

    /**
     * 
     * @return
     *     The github
     */
    public Github getGithub() {
        return github;
    }

    /**
     * 
     * @param github
     *     The github
     */
    public void setGithub(Github github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trello).append(slack).append(github).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tools) == false) {
            return false;
        }
        Tools rhs = ((Tools) other);
        return new EqualsBuilder().append(trello, rhs.trello).append(slack, rhs.slack).append(github, rhs.github).isEquals();
    }

}
