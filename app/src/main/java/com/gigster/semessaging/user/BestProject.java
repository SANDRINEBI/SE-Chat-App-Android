
package com.gigster.semessaging.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class BestProject {

    private String url;
    private String description;
    private List<Object> techs = new ArrayList<Object>();
    private String monthYear;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The techs
     */
    public List<Object> getTechs() {
        return techs;
    }

    /**
     * 
     * @param techs
     *     The techs
     */
    public void setTechs(List<Object> techs) {
        this.techs = techs;
    }

    /**
     * 
     * @return
     *     The monthYear
     */
    public String getMonthYear() {
        return monthYear;
    }

    /**
     * 
     * @param monthYear
     *     The monthYear
     */
    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(url).append(description).append(techs).append(monthYear).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BestProject) == false) {
            return false;
        }
        BestProject rhs = ((BestProject) other);
        return new EqualsBuilder().append(url, rhs.url).append(description, rhs.description).append(techs, rhs.techs).append(monthYear, rhs.monthYear).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
