
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class MilestonesSpecification {

    private boolean finalized;
    private Object finalizedDate;
    private Object finalizedBy;
    private boolean ready;
    private Object readyDate;
    private Object readyBy;
    private boolean approved;
    private Object approvedDate;
    private Object approvedBy;
    private List<Object> team = new ArrayList<Object>();
    private List<Object> revisions = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(finalized).append(finalizedDate).append(finalizedBy).append(ready).append(readyDate).append(readyBy).append(approved).append(approvedDate).append(approvedBy).append(team).append(revisions).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(finalized, rhs.finalized).append(finalizedDate, rhs.finalizedDate).append(finalizedBy, rhs.finalizedBy).append(ready, rhs.ready).append(readyDate, rhs.readyDate).append(readyBy, rhs.readyBy).append(approved, rhs.approved).append(approvedDate, rhs.approvedDate).append(approvedBy, rhs.approvedBy).append(team, rhs.team).append(revisions, rhs.revisions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
