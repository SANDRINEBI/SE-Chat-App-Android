
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Flags {

    private boolean isEnterprise;
    private boolean isCodeReview;
    private boolean isHardDeadline;
    private boolean isRepeat;
    private boolean isRush;
    private boolean isVIP;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The isEnterprise
     */
    public boolean isIsEnterprise() {
        return isEnterprise;
    }

    /**
     * 
     * @param isEnterprise
     *     The isEnterprise
     */
    public void setIsEnterprise(boolean isEnterprise) {
        this.isEnterprise = isEnterprise;
    }

    /**
     * 
     * @return
     *     The isCodeReview
     */
    public boolean isIsCodeReview() {
        return isCodeReview;
    }

    /**
     * 
     * @param isCodeReview
     *     The isCodeReview
     */
    public void setIsCodeReview(boolean isCodeReview) {
        this.isCodeReview = isCodeReview;
    }

    /**
     * 
     * @return
     *     The isHardDeadline
     */
    public boolean isIsHardDeadline() {
        return isHardDeadline;
    }

    /**
     * 
     * @param isHardDeadline
     *     The isHardDeadline
     */
    public void setIsHardDeadline(boolean isHardDeadline) {
        this.isHardDeadline = isHardDeadline;
    }

    /**
     * 
     * @return
     *     The isRepeat
     */
    public boolean isIsRepeat() {
        return isRepeat;
    }

    /**
     * 
     * @param isRepeat
     *     The isRepeat
     */
    public void setIsRepeat(boolean isRepeat) {
        this.isRepeat = isRepeat;
    }

    /**
     * 
     * @return
     *     The isRush
     */
    public boolean isIsRush() {
        return isRush;
    }

    /**
     * 
     * @param isRush
     *     The isRush
     */
    public void setIsRush(boolean isRush) {
        this.isRush = isRush;
    }

    /**
     * 
     * @return
     *     The isVIP
     */
    public boolean isIsVIP() {
        return isVIP;
    }

    /**
     * 
     * @param isVIP
     *     The isVIP
     */
    public void setIsVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isEnterprise).append(isCodeReview).append(isHardDeadline).append(isRepeat).append(isRush).append(isVIP).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flags) == false) {
            return false;
        }
        Flags rhs = ((Flags) other);
        return new EqualsBuilder().append(isEnterprise, rhs.isEnterprise).append(isCodeReview, rhs.isCodeReview).append(isHardDeadline, rhs.isHardDeadline).append(isRepeat, rhs.isRepeat).append(isRush, rhs.isRush).append(isVIP, rhs.isVIP).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
