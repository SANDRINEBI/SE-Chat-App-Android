
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class ProfileLinks {

    private String linkedin;
    private String personal;
    private String twitter;
    private String github;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linkedin).append(personal).append(twitter).append(github).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(linkedin, rhs.linkedin).append(personal, rhs.personal).append(twitter, rhs.twitter).append(github, rhs.github).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
