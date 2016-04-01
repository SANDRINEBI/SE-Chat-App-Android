
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Calculator {

    @SerializedName("quoting")
    @Expose
    private String quoting;
    @SerializedName("hours")
    @Expose
    private long hours;
    @SerializedName("devs")
    @Expose
    private long devs;
    @SerializedName("polishLevel")
    @Expose
    private String polishLevel;
    @SerializedName("features")
    @Expose
    private List<String> features = new ArrayList<String>();
    @SerializedName("predevTasks")
    @Expose
    private List<String> predevTasks = new ArrayList<String>();
    @SerializedName("postdevTasks")
    @Expose
    private List<String> postdevTasks = new ArrayList<String>();
    @SerializedName("qualifiers")
    @Expose
    private List<String> qualifiers = new ArrayList<String>();

    /**
     * 
     * @return
     *     The quoting
     */
    public String getQuoting() {
        return quoting;
    }

    /**
     * 
     * @param quoting
     *     The quoting
     */
    public void setQuoting(String quoting) {
        this.quoting = quoting;
    }

    /**
     * 
     * @return
     *     The hours
     */
    public long getHours() {
        return hours;
    }

    /**
     * 
     * @param hours
     *     The hours
     */
    public void setHours(long hours) {
        this.hours = hours;
    }

    /**
     * 
     * @return
     *     The devs
     */
    public long getDevs() {
        return devs;
    }

    /**
     * 
     * @param devs
     *     The devs
     */
    public void setDevs(long devs) {
        this.devs = devs;
    }

    /**
     * 
     * @return
     *     The polishLevel
     */
    public String getPolishLevel() {
        return polishLevel;
    }

    /**
     * 
     * @param polishLevel
     *     The polishLevel
     */
    public void setPolishLevel(String polishLevel) {
        this.polishLevel = polishLevel;
    }

    /**
     * 
     * @return
     *     The features
     */
    public List<String> getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(List<String> features) {
        this.features = features;
    }

    /**
     * 
     * @return
     *     The predevTasks
     */
    public List<String> getPredevTasks() {
        return predevTasks;
    }

    /**
     * 
     * @param predevTasks
     *     The predevTasks
     */
    public void setPredevTasks(List<String> predevTasks) {
        this.predevTasks = predevTasks;
    }

    /**
     * 
     * @return
     *     The postdevTasks
     */
    public List<String> getPostdevTasks() {
        return postdevTasks;
    }

    /**
     * 
     * @param postdevTasks
     *     The postdevTasks
     */
    public void setPostdevTasks(List<String> postdevTasks) {
        this.postdevTasks = postdevTasks;
    }

    /**
     * 
     * @return
     *     The qualifiers
     */
    public List<String> getQualifiers() {
        return qualifiers;
    }

    /**
     * 
     * @param qualifiers
     *     The qualifiers
     */
    public void setQualifiers(List<String> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(quoting).append(hours).append(devs).append(polishLevel).append(features).append(predevTasks).append(postdevTasks).append(qualifiers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Calculator) == false) {
            return false;
        }
        Calculator rhs = ((Calculator) other);
        return new EqualsBuilder().append(quoting, rhs.quoting).append(hours, rhs.hours).append(devs, rhs.devs).append(polishLevel, rhs.polishLevel).append(features, rhs.features).append(predevTasks, rhs.predevTasks).append(postdevTasks, rhs.postdevTasks).append(qualifiers, rhs.qualifiers).isEquals();
    }

}
