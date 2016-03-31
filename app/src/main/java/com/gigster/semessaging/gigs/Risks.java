
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Risks {

    private List<Object> team = new ArrayList<Object>();
    private List<Object> project = new ArrayList<Object>();
    private List<Object> customer = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The team
     */
    public List<Object> getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The team
     */
    public void setTeam(List<Object> team) {
        this.team = team;
    }

    /**
     * 
     * @return
     *     The project
     */
    public List<Object> getProject() {
        return project;
    }

    /**
     * 
     * @param project
     *     The project
     */
    public void setProject(List<Object> project) {
        this.project = project;
    }

    /**
     * 
     * @return
     *     The customer
     */
    public List<Object> getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer
     *     The customer
     */
    public void setCustomer(List<Object> customer) {
        this.customer = customer;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(team).append(project).append(customer).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Risks) == false) {
            return false;
        }
        Risks rhs = ((Risks) other);
        return new EqualsBuilder().append(team, rhs.team).append(project, rhs.project).append(customer, rhs.customer).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
