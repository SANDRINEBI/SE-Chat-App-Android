
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Quote {

    @SerializedName("high")
    @Expose
    private long high;
    @SerializedName("low")
    @Expose
    private long low;

    /**
     * 
     * @return
     *     The high
     */
    public long getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    public void setHigh(long high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The low
     */
    public long getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    public void setLow(long low) {
        this.low = low;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(high).append(low).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Quote) == false) {
            return false;
        }
        Quote rhs = ((Quote) other);
        return new EqualsBuilder().append(high, rhs.high).append(low, rhs.low).isEquals();
    }

}
