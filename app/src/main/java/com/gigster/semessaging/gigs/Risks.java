
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
public class Risks {

    @SerializedName("team")
    @Expose
    private List<Object> team = new ArrayList<Object>();
    @SerializedName("project")
    @Expose
    private List<Object> project = new ArrayList<Object>();
    @SerializedName("customer")
    @Expose
    private List<Object> customer = new ArrayList<Object>();

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(team).append(project).append(customer).toHashCode();
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
        return new EqualsBuilder().append(team, rhs.team).append(project, rhs.project).append(customer, rhs.customer).isEquals();
    }

}
