
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class City {

    @SerializedName("centroid")
    @Expose
    private Centroid centroid;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("admin1")
    @Expose
    private String admin1;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The centroid
     */
    public Centroid getCentroid() {
        return centroid;
    }

    /**
     * 
     * @param centroid
     *     The centroid
     */
    public void setCentroid(Centroid centroid) {
        this.centroid = centroid;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The admin1
     */
    public String getAdmin1() {
        return admin1;
    }

    /**
     * 
     * @param admin1
     *     The admin1
     */
    public void setAdmin1(String admin1) {
        this.admin1 = admin1;
    }

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(centroid).append(country).append(admin1).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof City) == false) {
            return false;
        }
        City rhs = ((City) other);
        return new EqualsBuilder().append(centroid, rhs.centroid).append(country, rhs.country).append(admin1, rhs.admin1).append(name, rhs.name).isEquals();
    }

}
