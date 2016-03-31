
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Tracking {

    private boolean isQualified;
    private boolean isProposalSent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The isQualified
     */
    public boolean isIsQualified() {
        return isQualified;
    }

    /**
     * 
     * @param isQualified
     *     The isQualified
     */
    public void setIsQualified(boolean isQualified) {
        this.isQualified = isQualified;
    }

    /**
     * 
     * @return
     *     The isProposalSent
     */
    public boolean isIsProposalSent() {
        return isProposalSent;
    }

    /**
     * 
     * @param isProposalSent
     *     The isProposalSent
     */
    public void setIsProposalSent(boolean isProposalSent) {
        this.isProposalSent = isProposalSent;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isQualified).append(isProposalSent).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tracking) == false) {
            return false;
        }
        Tracking rhs = ((Tracking) other);
        return new EqualsBuilder().append(isQualified, rhs.isQualified).append(isProposalSent, rhs.isProposalSent).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
