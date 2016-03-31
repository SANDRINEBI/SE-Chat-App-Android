
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Specification {

    private Object readyDate;
    private Object readyBy;
    private boolean ready;
    private Object approvedDate;
    private Object approvedBy;
    private boolean approved;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The readyDate
     */
    public Object getReadyDate() {
        return readyDate;
    }

    /**
     * 
     * @param readyDate
     *     The readyDate
     */
    public void setReadyDate(Object readyDate) {
        this.readyDate = readyDate;
    }

    /**
     * 
     * @return
     *     The readyBy
     */
    public Object getReadyBy() {
        return readyBy;
    }

    /**
     * 
     * @param readyBy
     *     The readyBy
     */
    public void setReadyBy(Object readyBy) {
        this.readyBy = readyBy;
    }

    /**
     * 
     * @return
     *     The ready
     */
    public boolean isReady() {
        return ready;
    }

    /**
     * 
     * @param ready
     *     The ready
     */
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    /**
     * 
     * @return
     *     The approvedDate
     */
    public Object getApprovedDate() {
        return approvedDate;
    }

    /**
     * 
     * @param approvedDate
     *     The approvedDate
     */
    public void setApprovedDate(Object approvedDate) {
        this.approvedDate = approvedDate;
    }

    /**
     * 
     * @return
     *     The approvedBy
     */
    public Object getApprovedBy() {
        return approvedBy;
    }

    /**
     * 
     * @param approvedBy
     *     The approvedBy
     */
    public void setApprovedBy(Object approvedBy) {
        this.approvedBy = approvedBy;
    }

    /**
     * 
     * @return
     *     The approved
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * 
     * @param approved
     *     The approved
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(readyDate).append(readyBy).append(ready).append(approvedDate).append(approvedBy).append(approved).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Specification) == false) {
            return false;
        }
        Specification rhs = ((Specification) other);
        return new EqualsBuilder().append(readyDate, rhs.readyDate).append(readyBy, rhs.readyBy).append(ready, rhs.ready).append(approvedDate, rhs.approvedDate).append(approvedBy, rhs.approvedBy).append(approved, rhs.approved).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
