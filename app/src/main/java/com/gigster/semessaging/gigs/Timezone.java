
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Timezone {

    private String value;
    private String abbr;
    private int offset;
    private boolean isdst;
    private String text;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The abbr
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * 
     * @param abbr
     *     The abbr
     */
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    /**
     * 
     * @return
     *     The offset
     */
    public int getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The isdst
     */
    public boolean isIsdst() {
        return isdst;
    }

    /**
     * 
     * @param isdst
     *     The isdst
     */
    public void setIsdst(boolean isdst) {
        this.isdst = isdst;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(abbr).append(offset).append(isdst).append(text).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Timezone) == false) {
            return false;
        }
        Timezone rhs = ((Timezone) other);
        return new EqualsBuilder().append(value, rhs.value).append(abbr, rhs.abbr).append(offset, rhs.offset).append(isdst, rhs.isdst).append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
