
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
public class Milestone {

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("sentDueSoonAlerts")
    @Expose
    private boolean sentDueSoonAlerts;
    @SerializedName("paid")
    @Expose
    private boolean paid;
    @SerializedName("paidDate")
    @Expose
    private Object paidDate;
    @SerializedName("complete")
    @Expose
    private boolean complete;
    @SerializedName("active")
    @Expose
    private boolean active;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("timeline")
    @Expose
    private String timeline;
    @SerializedName("specification")
    @Expose
    private Specification specification;
    @SerializedName("delivery")
    @Expose
    private Delivery delivery;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("duration")
    @Expose
    private long duration;
    @SerializedName("durationUnits")
    @Expose
    private String durationUnits;
    @SerializedName("todos")
    @Expose
    private List<Todo> todos = new ArrayList<Todo>();

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The sentDueSoonAlerts
     */
    public boolean isSentDueSoonAlerts() {
        return sentDueSoonAlerts;
    }

    /**
     * 
     * @param sentDueSoonAlerts
     *     The sentDueSoonAlerts
     */
    public void setSentDueSoonAlerts(boolean sentDueSoonAlerts) {
        this.sentDueSoonAlerts = sentDueSoonAlerts;
    }

    /**
     * 
     * @return
     *     The paid
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * 
     * @param paid
     *     The paid
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    /**
     * 
     * @return
     *     The paidDate
     */
    public Object getPaidDate() {
        return paidDate;
    }

    /**
     * 
     * @param paidDate
     *     The paidDate
     */
    public void setPaidDate(Object paidDate) {
        this.paidDate = paidDate;
    }

    /**
     * 
     * @return
     *     The complete
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * 
     * @param complete
     *     The complete
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    /**
     * 
     * @return
     *     The active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     The timeline
     */
    public String getTimeline() {
        return timeline;
    }

    /**
     * 
     * @param timeline
     *     The timeline
     */
    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    /**
     * 
     * @return
     *     The specification
     */
    public Specification getSpecification() {
        return specification;
    }

    /**
     * 
     * @param specification
     *     The specification
     */
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    /**
     * 
     * @return
     *     The delivery
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * 
     * @param delivery
     *     The delivery
     */
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The durationUnits
     */
    public String getDurationUnits() {
        return durationUnits;
    }

    /**
     * 
     * @param durationUnits
     *     The durationUnits
     */
    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    /**
     * 
     * @return
     *     The todos
     */
    public List<Todo> getTodos() {
        return todos;
    }

    /**
     * 
     * @param todos
     *     The todos
     */
    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Id).append(sentDueSoonAlerts).append(paid).append(paidDate).append(complete).append(active).append(startDate).append(endDate).append(timeline).append(specification).append(delivery).append(title).append(duration).append(durationUnits).append(todos).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Milestone) == false) {
            return false;
        }
        Milestone rhs = ((Milestone) other);
        return new EqualsBuilder().append(Id, rhs.Id).append(sentDueSoonAlerts, rhs.sentDueSoonAlerts).append(paid, rhs.paid).append(paidDate, rhs.paidDate).append(complete, rhs.complete).append(active, rhs.active).append(startDate, rhs.startDate).append(endDate, rhs.endDate).append(timeline, rhs.timeline).append(specification, rhs.specification).append(delivery, rhs.delivery).append(title, rhs.title).append(duration, rhs.duration).append(durationUnits, rhs.durationUnits).append(todos, rhs.todos).isEquals();
    }

}
