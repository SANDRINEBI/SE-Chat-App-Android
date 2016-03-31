
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Github {

    private List<Object> repos = new ArrayList<Object>();
    private Team team;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The repos
     */
    public List<Object> getRepos() {
        return repos;
    }

    /**
     * 
     * @param repos
     *     The repos
     */
    public void setRepos(List<Object> repos) {
        this.repos = repos;
    }

    /**
     * 
     * @return
     *     The team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The team
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(repos).append(team).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Github) == false) {
            return false;
        }
        Github rhs = ((Github) other);
        return new EqualsBuilder().append(repos, rhs.repos).append(team, rhs.team).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
