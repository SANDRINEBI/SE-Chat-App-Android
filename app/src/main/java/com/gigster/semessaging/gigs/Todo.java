
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Todo {

    private boolean complete;
    private String task;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The task
     */
    public String getTask() {
        return task;
    }

    /**
     * 
     * @param task
     *     The task
     */
    public void setTask(String task) {
        this.task = task;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(complete).append(task).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Todo) == false) {
            return false;
        }
        Todo rhs = ((Todo) other);
        return new EqualsBuilder().append(complete, rhs.complete).append(task, rhs.task).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
