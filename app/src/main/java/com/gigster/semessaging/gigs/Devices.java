
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
public class Devices {

    @SerializedName("gcm")
    @Expose
    private List<Object> gcm = new ArrayList<Object>();
    @SerializedName("apns")
    @Expose
    private List<Object> apns = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The gcm
     */
    public List<Object> getGcm() {
        return gcm;
    }

    /**
     * 
     * @param gcm
     *     The gcm
     */
    public void setGcm(List<Object> gcm) {
        this.gcm = gcm;
    }

    /**
     * 
     * @return
     *     The apns
     */
    public List<Object> getApns() {
        return apns;
    }

    /**
     * 
     * @param apns
     *     The apns
     */
    public void setApns(List<Object> apns) {
        this.apns = apns;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(gcm).append(apns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Devices) == false) {
            return false;
        }
        Devices rhs = ((Devices) other);
        return new EqualsBuilder().append(gcm, rhs.gcm).append(apns, rhs.apns).isEquals();
    }

}
