
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Tracking {

    @SerializedName("isQualified")
    @Expose
    private boolean isQualified;
    @SerializedName("isProposalSent")
    @Expose
    private boolean isProposalSent;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isQualified).append(isProposalSent).toHashCode();
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
        return new EqualsBuilder().append(isQualified, rhs.isQualified).append(isProposalSent, rhs.isProposalSent).isEquals();
    }

}
