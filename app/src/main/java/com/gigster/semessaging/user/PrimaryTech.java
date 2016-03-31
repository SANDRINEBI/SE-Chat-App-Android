
package com.gigster.semessaging.user;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class PrimaryTech {

    private String name;
    private Object years;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The years
     */
    public Object getYears() {
        return years;
    }

    /**
     * 
     * @param years
     *     The years
     */
    public void setYears(Object years) {
        this.years = years;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(years).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryTech) == false) {
            return false;
        }
        PrimaryTech rhs = ((PrimaryTech) other);
        return new EqualsBuilder().append(name, rhs.name).append(years, rhs.years).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
