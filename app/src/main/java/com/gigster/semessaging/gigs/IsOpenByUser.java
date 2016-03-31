
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class IsOpenByUser {

    private boolean _55a8169a239fa903006172ef;
    private boolean _54612d874b4db002005e60fe;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _55a8169a239fa903006172ef
     */
    public boolean is55a8169a239fa903006172ef() {
        return _55a8169a239fa903006172ef;
    }

    /**
     * 
     * @param _55a8169a239fa903006172ef
     *     The 55a8169a239fa903006172ef
     */
    public void set55a8169a239fa903006172ef(boolean _55a8169a239fa903006172ef) {
        this._55a8169a239fa903006172ef = _55a8169a239fa903006172ef;
    }

    /**
     * 
     * @return
     *     The _54612d874b4db002005e60fe
     */
    public boolean is54612d874b4db002005e60fe() {
        return _54612d874b4db002005e60fe;
    }

    /**
     * 
     * @param _54612d874b4db002005e60fe
     *     The 54612d874b4db002005e60fe
     */
    public void set54612d874b4db002005e60fe(boolean _54612d874b4db002005e60fe) {
        this._54612d874b4db002005e60fe = _54612d874b4db002005e60fe;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_55a8169a239fa903006172ef).append(_54612d874b4db002005e60fe).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IsOpenByUser) == false) {
            return false;
        }
        IsOpenByUser rhs = ((IsOpenByUser) other);
        return new EqualsBuilder().append(_55a8169a239fa903006172ef, rhs._55a8169a239fa903006172ef).append(_54612d874b4db002005e60fe, rhs._54612d874b4db002005e60fe).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
