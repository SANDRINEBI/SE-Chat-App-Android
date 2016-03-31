
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Trello {

    private List<Object> publishedMilestones = new ArrayList<Object>();
    private List<Object> boards = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The publishedMilestones
     */
    public List<Object> getPublishedMilestones() {
        return publishedMilestones;
    }

    /**
     * 
     * @param publishedMilestones
     *     The publishedMilestones
     */
    public void setPublishedMilestones(List<Object> publishedMilestones) {
        this.publishedMilestones = publishedMilestones;
    }

    /**
     * 
     * @return
     *     The boards
     */
    public List<Object> getBoards() {
        return boards;
    }

    /**
     * 
     * @param boards
     *     The boards
     */
    public void setBoards(List<Object> boards) {
        this.boards = boards;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publishedMilestones).append(boards).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trello) == false) {
            return false;
        }
        Trello rhs = ((Trello) other);
        return new EqualsBuilder().append(publishedMilestones, rhs.publishedMilestones).append(boards, rhs.boards).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
