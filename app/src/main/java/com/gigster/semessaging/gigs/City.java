
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class City {

    private Centroid centroid;
    private String country;
    private String admin1;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(centroid).append(country).append(admin1).append(name).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(centroid, rhs.centroid).append(country, rhs.country).append(admin1, rhs.admin1).append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
