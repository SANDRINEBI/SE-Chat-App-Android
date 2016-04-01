
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
public class Delivery {

    @SerializedName("approved")
    @Expose
    private boolean approved;
    @SerializedName("approvedBy")
    @Expose
    private Object approvedBy;
    @SerializedName("approvedDate")
    @Expose
    private Object approvedDate;
    @SerializedName("ready")
    @Expose
    private boolean ready;
    @SerializedName("readyBy")
    @Expose
    private Object readyBy;
    @SerializedName("readyDate")
    @Expose
    private Object readyDate;
    @SerializedName("rejected")
    @Expose
    private boolean rejected;
    @SerializedName("rejectedBy")
    @Expose
    private boolean rejectedBy;
    @SerializedName("rejectedDate")
    @Expose
    private Object rejectedDate;
    @SerializedName("rejectedReason")
    @Expose
    private Object rejectedReason;
    @SerializedName("revisions")
    @Expose
    private List<Object> revisions = new ArrayList<Object>();

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
     *     The rejected
     */
    public boolean isRejected() {
        return rejected;
    }

    /**
     * 
     * @param rejected
     *     The rejected
     */
    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }

    /**
     * 
     * @return
     *     The rejectedBy
     */
    public boolean isRejectedBy() {
        return rejectedBy;
    }

    /**
     * 
     * @param rejectedBy
     *     The rejectedBy
     */
    public void setRejectedBy(boolean rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    /**
     * 
     * @return
     *     The rejectedDate
     */
    public Object getRejectedDate() {
        return rejectedDate;
    }

    /**
     * 
     * @param rejectedDate
     *     The rejectedDate
     */
    public void setRejectedDate(Object rejectedDate) {
        this.rejectedDate = rejectedDate;
    }

    /**
     * 
     * @return
     *     The rejectedReason
     */
    public Object getRejectedReason() {
        return rejectedReason;
    }

    /**
     * 
     * @param rejectedReason
     *     The rejectedReason
     */
    public void setRejectedReason(Object rejectedReason) {
        this.rejectedReason = rejectedReason;
    }

    /**
     * 
     * @return
     *     The revisions
     */
    public List<Object> getRevisions() {
        return revisions;
    }

    /**
     * 
     * @param revisions
     *     The revisions
     */
    public void setRevisions(List<Object> revisions) {
        this.revisions = revisions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(approved).append(approvedBy).append(approvedDate).append(ready).append(readyBy).append(readyDate).append(rejected).append(rejectedBy).append(rejectedDate).append(rejectedReason).append(revisions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Delivery) == false) {
            return false;
        }
        Delivery rhs = ((Delivery) other);
        return new EqualsBuilder().append(approved, rhs.approved).append(approvedBy, rhs.approvedBy).append(approvedDate, rhs.approvedDate).append(ready, rhs.ready).append(readyBy, rhs.readyBy).append(readyDate, rhs.readyDate).append(rejected, rhs.rejected).append(rejectedBy, rhs.rejectedBy).append(rejectedDate, rhs.rejectedDate).append(rejectedReason, rhs.rejectedReason).append(revisions, rhs.revisions).isEquals();
    }

}
