
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class StatusReached {

    private long stale;
    private long ready;
    private long unstarted;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The stale
     */
    public long getStale() {
        return stale;
    }

    /**
     * 
     * @param stale
     *     The stale
     */
    public void setStale(long stale) {
        this.stale = stale;
    }

    /**
     * 
     * @return
     *     The ready
     */
    public long getReady() {
        return ready;
    }

    /**
     * 
     * @param ready
     *     The ready
     */
    public void setReady(long ready) {
        this.ready = ready;
    }

    /**
     * 
     * @return
     *     The unstarted
     */
    public long getUnstarted() {
        return unstarted;
    }

    /**
     * 
     * @param unstarted
     *     The unstarted
     */
    public void setUnstarted(int unstarted) {
        this.unstarted = unstarted;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stale).append(ready).append(unstarted).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatusReached) == false) {
            return false;
        }
        StatusReached rhs = ((StatusReached) other);
        return new EqualsBuilder().append(stale, rhs.stale).append(ready, rhs.ready).append(unstarted, rhs.unstarted).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
