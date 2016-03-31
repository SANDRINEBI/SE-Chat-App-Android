
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Organization {

    private Object approvedDate;
    private boolean approved;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
        return new HashCodeBuilder().append(approvedDate).append(approved).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Organization) == false) {
            return false;
        }
        Organization rhs = ((Organization) other);
        return new EqualsBuilder().append(approvedDate, rhs.approvedDate).append(approved, rhs.approved).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
