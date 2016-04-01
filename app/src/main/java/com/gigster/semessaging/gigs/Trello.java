
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Trello {

    @SerializedName("publishedMilestones")
    @Expose
    private List<Object> publishedMilestones = new ArrayList<Object>();
    @SerializedName("boards")
    @Expose
    private List<Object> boards = new ArrayList<Object>();

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publishedMilestones).append(boards).toHashCode();
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
        return new EqualsBuilder().append(publishedMilestones, rhs.publishedMilestones).append(boards, rhs.boards).isEquals();
    }

}
