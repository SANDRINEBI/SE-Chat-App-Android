
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
public class MilestonesSpecification {

    @SerializedName("finalized")
    @Expose
    private boolean finalized;
    @SerializedName("finalizedDate")
    @Expose
    private Object finalizedDate;
    @SerializedName("finalizedBy")
    @Expose
    private Object finalizedBy;
    @SerializedName("ready")
    @Expose
    private boolean ready;
    @SerializedName("readyDate")
    @Expose
    private Object readyDate;
    @SerializedName("readyBy")
    @Expose
    private Object readyBy;
    @SerializedName("approved")
    @Expose
    private boolean approved;
    @SerializedName("approvedDate")
    @Expose
    private Object approvedDate;
    @SerializedName("approvedBy")
    @Expose
    private Object approvedBy;
    @SerializedName("team")
    @Expose
    private List<Object> team = new ArrayList<Object>();
    @SerializedName("revisions")
    @Expose
    private List<Object> revisions = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The finalized
     */
    public boolean isFinalized() {
        return finalized;
    }

    /**
     * 
     * @param finalized
     *     The finalized
     */
    public void setFinalized(boolean finalized) {
        this.finalized = finalized;
    }

    /**
     * 
     * @return
     *     The finalizedDate
     */
    public Object getFinalizedDate() {
        return finalizedDate;
    }

    /**
     * 
     * @param finalizedDate
     *     The finalizedDate
     */
    public void setFinalizedDate(Object finalizedDate) {
        this.finalizedDate = finalizedDate;
    }

    /**
     * 
     * @return
     *     The finalizedBy
     */
    public Object getFinalizedBy() {
        return finalizedBy;
    }

    /**
     * 
     * @param finalizedBy
     *     The finalizedBy
     */
    public void setFinalizedBy(Object finalizedBy) {
        this.finalizedBy = finalizedBy;
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
     *     The team
     */
    public List<Object> getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The team
     */
    public void setTeam(List<Object> team) {
        this.team = team;
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
        return new HashCodeBuilder().append(finalized).append(finalizedDate).append(finalizedBy).append(ready).append(readyDate).append(readyBy).append(approved).append(approvedDate).append(approvedBy).append(team).append(revisions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MilestonesSpecification) == false) {
            return false;
        }
        MilestonesSpecification rhs = ((MilestonesSpecification) other);
        return new EqualsBuilder().append(finalized, rhs.finalized).append(finalizedDate, rhs.finalizedDate).append(finalizedBy, rhs.finalizedBy).append(ready, rhs.ready).append(readyDate, rhs.readyDate).append(readyBy, rhs.readyBy).append(approved, rhs.approved).append(approvedDate, rhs.approvedDate).append(approvedBy, rhs.approvedBy).append(team, rhs.team).append(revisions, rhs.revisions).isEquals();
    }

}
