
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Tools {

    private Trello trello;
    private Slack slack;
    private Github github;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trello).append(slack).append(github).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(trello, rhs.trello).append(slack, rhs.slack).append(github, rhs.github).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
