
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class KarmaDimensions {

    @SerializedName("speed")
    @Expose
    private long speed;
    @SerializedName("responsiveness")
    @Expose
    private long responsiveness;
    @SerializedName("referrals")
    @Expose
    private long referrals;
    @SerializedName("reliability")
    @Expose
    private long reliability;
    @SerializedName("awesomeness")
    @Expose
    private long awesomeness;
    @SerializedName("questionAnswering")
    @Expose
    private long questionAnswering;
    @SerializedName("ux")
    @Expose
    private long ux;
    @SerializedName("codeQuality")
    @Expose
    private long codeQuality;
    @SerializedName("components")
    @Expose
    private long components;
    @SerializedName("customerSatisfaction")
    @Expose
    private long customerSatisfaction;
    @SerializedName("productQuality")
    @Expose
    private long productQuality;

    /**
     * 
     * @return
     *     The speed
     */
    public long getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    public void setSpeed(long speed) {
        this.speed = speed;
    }

    /**
     * 
     * @return
     *     The responsiveness
     */
    public long getResponsiveness() {
        return responsiveness;
    }

    /**
     * 
     * @param responsiveness
     *     The responsiveness
     */
    public void setResponsiveness(long responsiveness) {
        this.responsiveness = responsiveness;
    }

    /**
     * 
     * @return
     *     The referrals
     */
    public long getReferrals() {
        return referrals;
    }

    /**
     * 
     * @param referrals
     *     The referrals
     */
    public void setReferrals(long referrals) {
        this.referrals = referrals;
    }

    /**
     * 
     * @return
     *     The reliability
     */
    public long getReliability() {
        return reliability;
    }

    /**
     * 
     * @param reliability
     *     The reliability
     */
    public void setReliability(long reliability) {
        this.reliability = reliability;
    }

    /**
     * 
     * @return
     *     The awesomeness
     */
    public long getAwesomeness() {
        return awesomeness;
    }

    /**
     * 
     * @param awesomeness
     *     The awesomeness
     */
    public void setAwesomeness(long awesomeness) {
        this.awesomeness = awesomeness;
    }

    /**
     * 
     * @return
     *     The questionAnswering
     */
    public long getQuestionAnswering() {
        return questionAnswering;
    }

    /**
     * 
     * @param questionAnswering
     *     The questionAnswering
     */
    public void setQuestionAnswering(long questionAnswering) {
        this.questionAnswering = questionAnswering;
    }

    /**
     * 
     * @return
     *     The ux
     */
    public long getUx() {
        return ux;
    }

    /**
     * 
     * @param ux
     *     The ux
     */
    public void setUx(long ux) {
        this.ux = ux;
    }

    /**
     * 
     * @return
     *     The codeQuality
     */
    public long getCodeQuality() {
        return codeQuality;
    }

    /**
     * 
     * @param codeQuality
     *     The codeQuality
     */
    public void setCodeQuality(long codeQuality) {
        this.codeQuality = codeQuality;
    }

    /**
     * 
     * @return
     *     The components
     */
    public long getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(long components) {
        this.components = components;
    }

    /**
     * 
     * @return
     *     The customerSatisfaction
     */
    public long getCustomerSatisfaction() {
        return customerSatisfaction;
    }

    /**
     * 
     * @param customerSatisfaction
     *     The customerSatisfaction
     */
    public void setCustomerSatisfaction(long customerSatisfaction) {
        this.customerSatisfaction = customerSatisfaction;
    }

    /**
     * 
     * @return
     *     The productQuality
     */
    public long getProductQuality() {
        return productQuality;
    }

    /**
     * 
     * @param productQuality
     *     The productQuality
     */
    public void setProductQuality(long productQuality) {
        this.productQuality = productQuality;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(speed).append(responsiveness).append(referrals).append(reliability).append(awesomeness).append(questionAnswering).append(ux).append(codeQuality).append(components).append(customerSatisfaction).append(productQuality).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KarmaDimensions) == false) {
            return false;
        }
        KarmaDimensions rhs = ((KarmaDimensions) other);
        return new EqualsBuilder().append(speed, rhs.speed).append(responsiveness, rhs.responsiveness).append(referrals, rhs.referrals).append(reliability, rhs.reliability).append(awesomeness, rhs.awesomeness).append(questionAnswering, rhs.questionAnswering).append(ux, rhs.ux).append(codeQuality, rhs.codeQuality).append(components, rhs.components).append(customerSatisfaction, rhs.customerSatisfaction).append(productQuality, rhs.productQuality).isEquals();
    }

}
