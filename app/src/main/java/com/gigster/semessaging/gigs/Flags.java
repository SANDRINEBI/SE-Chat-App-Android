
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Flags {

    @SerializedName("showPayButton")
    @Expose
    private boolean showPayButton;
    @SerializedName("isEnterprise")
    @Expose
    private boolean isEnterprise;
    @SerializedName("isCodeReview")
    @Expose
    private boolean isCodeReview;
    @SerializedName("isHardDeadline")
    @Expose
    private boolean isHardDeadline;
    @SerializedName("isRepeat")
    @Expose
    private boolean isRepeat;
    @SerializedName("isRush")
    @Expose
    private boolean isRush;
    @SerializedName("isVIP")
    @Expose
    private boolean isVIP;

    /**
     * 
     * @return
     *     The showPayButton
     */
    public boolean isShowPayButton() {
        return showPayButton;
    }

    /**
     * 
     * @param showPayButton
     *     The showPayButton
     */
    public void setShowPayButton(boolean showPayButton) {
        this.showPayButton = showPayButton;
    }

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(showPayButton).append(isEnterprise).append(isCodeReview).append(isHardDeadline).append(isRepeat).append(isRush).append(isVIP).toHashCode();
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
        return new EqualsBuilder().append(showPayButton, rhs.showPayButton).append(isEnterprise, rhs.isEnterprise).append(isCodeReview, rhs.isCodeReview).append(isHardDeadline, rhs.isHardDeadline).append(isRepeat, rhs.isRepeat).append(isRush, rhs.isRush).append(isVIP, rhs.isVIP).isEquals();
    }

}
