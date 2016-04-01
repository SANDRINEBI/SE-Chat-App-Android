
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PdfUrl {

    @SerializedName("proposalPdf")
    @Expose
    private String proposalPdf;

    /**
     * 
     * @return
     *     The proposalPdf
     */
    public String getProposalPdf() {
        return proposalPdf;
    }

    /**
     * 
     * @param proposalPdf
     *     The proposalPdf
     */
    public void setProposalPdf(String proposalPdf) {
        this.proposalPdf = proposalPdf;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(proposalPdf).toHashCode();
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
        return new EqualsBuilder().append(proposalPdf, rhs.proposalPdf).isEquals();
    }

}
