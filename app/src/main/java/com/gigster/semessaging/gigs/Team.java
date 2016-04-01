
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
public class Team {

    @SerializedName("members")
    @Expose
    private List<Object> members = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The members
     */
    public List<Object> getMembers() {
        return members;
    }

    /**
     * 
     * @param members
     *     The members
     */
    public void setMembers(List<Object> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(members).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team) == false) {
            return false;
        }
        Team rhs = ((Team) other);
        return new EqualsBuilder().append(members, rhs.members).isEquals();
    }

}
