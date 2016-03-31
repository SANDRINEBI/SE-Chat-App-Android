
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class KarmaDimensions {

    private int speed;
    private int responsiveness;
    private int referrals;
    private int reliability;
    private int awesomeness;
    private int questionAnswering;
    private int ux;
    private int codeQuality;
    private int components;
    private int customerSatisfaction;
    private int productQuality;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * 
     * @return
     *     The responsiveness
     */
    public int getResponsiveness() {
        return responsiveness;
    }

    /**
     * 
     * @param responsiveness
     *     The responsiveness
     */
    public void setResponsiveness(int responsiveness) {
        this.responsiveness = responsiveness;
    }

    /**
     * 
     * @return
     *     The referrals
     */
    public int getReferrals() {
        return referrals;
    }

    /**
     * 
     * @param referrals
     *     The referrals
     */
    public void setReferrals(int referrals) {
        this.referrals = referrals;
    }

    /**
     * 
     * @return
     *     The reliability
     */
    public int getReliability() {
        return reliability;
    }

    /**
     * 
     * @param reliability
     *     The reliability
     */
    public void setReliability(int reliability) {
        this.reliability = reliability;
    }

    /**
     * 
     * @return
     *     The awesomeness
     */
    public int getAwesomeness() {
        return awesomeness;
    }

    /**
     * 
     * @param awesomeness
     *     The awesomeness
     */
    public void setAwesomeness(int awesomeness) {
        this.awesomeness = awesomeness;
    }

    /**
     * 
     * @return
     *     The questionAnswering
     */
    public int getQuestionAnswering() {
        return questionAnswering;
    }

    /**
     * 
     * @param questionAnswering
     *     The questionAnswering
     */
    public void setQuestionAnswering(int questionAnswering) {
        this.questionAnswering = questionAnswering;
    }

    /**
     * 
     * @return
     *     The ux
     */
    public int getUx() {
        return ux;
    }

    /**
     * 
     * @param ux
     *     The ux
     */
    public void setUx(int ux) {
        this.ux = ux;
    }

    /**
     * 
     * @return
     *     The codeQuality
     */
    public int getCodeQuality() {
        return codeQuality;
    }

    /**
     * 
     * @param codeQuality
     *     The codeQuality
     */
    public void setCodeQuality(int codeQuality) {
        this.codeQuality = codeQuality;
    }

    /**
     * 
     * @return
     *     The components
     */
    public int getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(int components) {
        this.components = components;
    }

    /**
     * 
     * @return
     *     The customerSatisfaction
     */
    public int getCustomerSatisfaction() {
        return customerSatisfaction;
    }

    /**
     * 
     * @param customerSatisfaction
     *     The customerSatisfaction
     */
    public void setCustomerSatisfaction(int customerSatisfaction) {
        this.customerSatisfaction = customerSatisfaction;
    }

    /**
     * 
     * @return
     *     The productQuality
     */
    public int getProductQuality() {
        return productQuality;
    }

    /**
     * 
     * @param productQuality
     *     The productQuality
     */
    public void setProductQuality(int productQuality) {
        this.productQuality = productQuality;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(speed).append(responsiveness).append(referrals).append(reliability).append(awesomeness).append(questionAnswering).append(ux).append(codeQuality).append(components).append(customerSatisfaction).append(productQuality).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(speed, rhs.speed).append(responsiveness, rhs.responsiveness).append(referrals, rhs.referrals).append(reliability, rhs.reliability).append(awesomeness, rhs.awesomeness).append(questionAnswering, rhs.questionAnswering).append(ux, rhs.ux).append(codeQuality, rhs.codeQuality).append(components, rhs.components).append(customerSatisfaction, rhs.customerSatisfaction).append(productQuality, rhs.productQuality).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
