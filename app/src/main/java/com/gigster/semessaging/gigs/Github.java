
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
public class Github {

    @SerializedName("repos")
    @Expose
    private List<Object> repos = new ArrayList<Object>();
    @SerializedName("team")
    @Expose
    private Team team;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(repos).append(team).toHashCode();
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
        return new EqualsBuilder().append(repos, rhs.repos).append(team, rhs.team).isEquals();
    }

}
