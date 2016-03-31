
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class PdfUrl {

    private String proposal;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The proposal
     */
    public String getProposal() {
        return proposal;
    }

    /**
     * 
     * @param proposal
     *     The proposal
     */
    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(proposal).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PdfUrl) == false) {
            return false;
        }
        PdfUrl rhs = ((PdfUrl) other);
        return new EqualsBuilder().append(proposal, rhs.proposal).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
