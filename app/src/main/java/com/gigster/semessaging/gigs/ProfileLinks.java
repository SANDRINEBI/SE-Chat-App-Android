
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ProfileLinks {

    @SerializedName("linkedin")
    @Expose
    private String linkedin;
    @SerializedName("personal")
    @Expose
    private String personal;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("github")
    @Expose
    private String github;

    /**
     * 
     * @return
     *     The linkedin
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * 
     * @param linkedin
     *     The linkedin
     */
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    /**
     * 
     * @return
     *     The personal
     */
    public String getPersonal() {
        return personal;
    }

    /**
     * 
     * @param personal
     *     The personal
     */
    public void setPersonal(String personal) {
        this.personal = personal;
    }

    /**
     * 
     * @return
     *     The twitter
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * 
     * @param twitter
     *     The twitter
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * 
     * @return
     *     The github
     */
    public String getGithub() {
        return github;
    }

    /**
     * 
     * @param github
     *     The github
     */
    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linkedin).append(personal).append(twitter).append(github).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfileLinks) == false) {
            return false;
        }
        ProfileLinks rhs = ((ProfileLinks) other);
        return new EqualsBuilder().append(linkedin, rhs.linkedin).append(personal, rhs.personal).append(twitter, rhs.twitter).append(github, rhs.github).isEquals();
    }

}
