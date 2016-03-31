
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Milestone {

    private String Id;
    private boolean sentDueSoonAlerts;
    private boolean paid;
    private Object paidDate;
    private boolean complete;
    private boolean active;
    private String startDate;
    private String endDate;
    private Object timeline;
    private Specification specification;
    private Delivery delivery;
    private String title;
    private int duration;
    private String durationUnits;
    private List<Todo> todos = new ArrayList<Todo>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public Object getTimeline() {
        return timeline;
    }

    /**
     * 
     * @param timeline
     *     The timeline
     */
    public void setTimeline(Object timeline) {
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
    public int getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(int duration) {
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Id).append(sentDueSoonAlerts).append(paid).append(paidDate).append(complete).append(active).append(startDate).append(endDate).append(timeline).append(specification).append(delivery).append(title).append(duration).append(durationUnits).append(todos).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(Id, rhs.Id).append(sentDueSoonAlerts, rhs.sentDueSoonAlerts).append(paid, rhs.paid).append(paidDate, rhs.paidDate).append(complete, rhs.complete).append(active, rhs.active).append(startDate, rhs.startDate).append(endDate, rhs.endDate).append(timeline, rhs.timeline).append(specification, rhs.specification).append(delivery, rhs.delivery).append(title, rhs.title).append(duration, rhs.duration).append(durationUnits, rhs.durationUnits).append(todos, rhs.todos).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
