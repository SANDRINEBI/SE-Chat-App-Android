
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Todo {

    @SerializedName("task")
    @Expose
    private String task;
    @SerializedName("complete")
    @Expose
    private boolean complete;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(task).append(complete).toHashCode();
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
        return new EqualsBuilder().append(task, rhs.task).append(complete, rhs.complete).isEquals();
    }

}
