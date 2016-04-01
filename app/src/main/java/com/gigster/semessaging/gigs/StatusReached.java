
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class StatusReached {

    @SerializedName("unstarted")
    @Expose
    private long unstarted;
    @SerializedName("stale")
    @Expose
    private long stale;

    /**
     * 
     * @return
     *     The unstarted
     */
    public long getUnstarted() {
        return unstarted;
    }

    /**
     * 
     * @param unstarted
     *     The unstarted
     */
    public void setUnstarted(long unstarted) {
        this.unstarted = unstarted;
    }

    /**
     * 
     * @return
     *     The stale
     */
    public long getStale() {
        return stale;
    }

    /**
     * 
     * @param stale
     *     The stale
     */
    public void setStale(long stale) {
        this.stale = stale;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unstarted).append(stale).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatusReached) == false) {
            return false;
        }
        StatusReached rhs = ((StatusReached) other);
        return new EqualsBuilder().append(unstarted, rhs.unstarted).append(stale, rhs.stale).isEquals();
    }

}
