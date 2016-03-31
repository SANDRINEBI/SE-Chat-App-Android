
package com.gigster.semessaging.gigs;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Poster {
    @SerializedName("img_url")
    private String imgURL;

    private String Id;
    private String provider;
    private String name;
    private String budget;
    private String durationPref;
    private String email;
    private String hashedPassword;
    private String salt;
    private String fact;
    private String phone;
    private Timezone timezone;
    private int V;
    private String signupGig;
    private String referral;
    private Object slackId;
    private List<Object> notifyOnLogin = new ArrayList<Object>();
    private boolean hideMilestonesTutorial;
    private boolean receiveKarmaNotifications;
    private List<Object> workSamples = new ArrayList<Object>();
    private boolean acceptChats;
    private List<Object> availabilityHistory = new ArrayList<Object>();
    private boolean available;
    private List<Object> seAvailableSlots = new ArrayList<Object>();
    private boolean delightApproved;
    private boolean delightRequested;
    private boolean architectApproved;
    private boolean architectRequested;
    private boolean codeReviewerApproved;
    private boolean codeReviewerRequested;
    private boolean qaApproved;
    private boolean qaRequested;
    private boolean writerApproved;
    private boolean writerRequested;
    private boolean designerApproved;
    private boolean designerRequested;
    private boolean seApproved;
    private boolean seRequested;
    private boolean pmApproved;
    private boolean pmRequested;
    private boolean gigsterApproved;
    private boolean gigsterRequested;
    private String type;
    private String role;
    private List<Object> votes = new ArrayList<Object>();
    private int numRatings;
    private int rating;
    private List<Object> karmaHistory = new ArrayList<Object>();
    private KarmaDimensions karmaDimensions;
    private int karma;
    private List<Object> bestProjects = new ArrayList<Object>();
    private List<Object> techs = new ArrayList<Object>();
    private List<Object> platforms = new ArrayList<Object>();
    private List<Object> skills = new ArrayList<Object>();
    private ProfileLinks profileLinks;
    private City city;
    private String lastActionTime;
    private List<Object> interviews = new ArrayList<Object>();
    private String updated;
    private String created;
    private boolean accepted;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 
     * @param provider
     *     The provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
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

    /**
     * 
     * @return
     *     The budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * 
     * @param budget
     *     The budget
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * 
     * @return
     *     The durationPref
     */
    public String getDurationPref() {
        return durationPref;
    }

    /**
     * 
     * @param durationPref
     *     The durationPref
     */
    public void setDurationPref(String durationPref) {
        this.durationPref = durationPref;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The hashedPassword
     */
    public String getHashedPassword() {
        return hashedPassword;
    }

    /**
     * 
     * @param hashedPassword
     *     The hashedPassword
     */
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    /**
     * 
     * @return
     *     The salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 
     * @param salt
     *     The salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 
     * @return
     *     The fact
     */
    public String getFact() {
        return fact;
    }

    /**
     * 
     * @param fact
     *     The fact
     */
    public void setFact(String fact) {
        this.fact = fact;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    public Timezone getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    /**
     * 
     * @return
     *     The V
     */
    public int getV() {
        return V;
    }

    /**
     * 
     * @param V
     *     The __v
     */
    public void setV(int V) {
        this.V = V;
    }

    /**
     * 
     * @return
     *     The signupGig
     */
    public String getSignupGig() {
        return signupGig;
    }

    /**
     * 
     * @param signupGig
     *     The signupGig
     */
    public void setSignupGig(String signupGig) {
        this.signupGig = signupGig;
    }

    /**
     * 
     * @return
     *     The referral
     */
    public String getReferral() {
        return referral;
    }

    /**
     * 
     * @param referral
     *     The referral
     */
    public void setReferral(String referral) {
        this.referral = referral;
    }

    /**
     * 
     * @return
     *     The slackId
     */
    public Object getSlackId() {
        return slackId;
    }

    /**
     * 
     * @param slackId
     *     The slackId
     */
    public void setSlackId(Object slackId) {
        this.slackId = slackId;
    }

    /**
     * 
     * @return
     *     The notifyOnLogin
     */
    public List<Object> getNotifyOnLogin() {
        return notifyOnLogin;
    }

    /**
     * 
     * @param notifyOnLogin
     *     The notifyOnLogin
     */
    public void setNotifyOnLogin(List<Object> notifyOnLogin) {
        this.notifyOnLogin = notifyOnLogin;
    }

    /**
     * 
     * @return
     *     The hideMilestonesTutorial
     */
    public boolean isHideMilestonesTutorial() {
        return hideMilestonesTutorial;
    }

    /**
     * 
     * @param hideMilestonesTutorial
     *     The hideMilestonesTutorial
     */
    public void setHideMilestonesTutorial(boolean hideMilestonesTutorial) {
        this.hideMilestonesTutorial = hideMilestonesTutorial;
    }

    /**
     * 
     * @return
     *     The receiveKarmaNotifications
     */
    public boolean isReceiveKarmaNotifications() {
        return receiveKarmaNotifications;
    }

    /**
     * 
     * @param receiveKarmaNotifications
     *     The receiveKarmaNotifications
     */
    public void setReceiveKarmaNotifications(boolean receiveKarmaNotifications) {
        this.receiveKarmaNotifications = receiveKarmaNotifications;
    }

    /**
     * 
     * @return
     *     The workSamples
     */
    public List<Object> getWorkSamples() {
        return workSamples;
    }

    /**
     * 
     * @param workSamples
     *     The workSamples
     */
    public void setWorkSamples(List<Object> workSamples) {
        this.workSamples = workSamples;
    }

    /**
     * 
     * @return
     *     The acceptChats
     */
    public boolean isAcceptChats() {
        return acceptChats;
    }

    /**
     * 
     * @param acceptChats
     *     The acceptChats
     */
    public void setAcceptChats(boolean acceptChats) {
        this.acceptChats = acceptChats;
    }

    /**
     * 
     * @return
     *     The availabilityHistory
     */
    public List<Object> getAvailabilityHistory() {
        return availabilityHistory;
    }

    /**
     * 
     * @param availabilityHistory
     *     The availabilityHistory
     */
    public void setAvailabilityHistory(List<Object> availabilityHistory) {
        this.availabilityHistory = availabilityHistory;
    }

    /**
     * 
     * @return
     *     The available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * 
     * @return
     *     The seAvailableSlots
     */
    public List<Object> getSeAvailableSlots() {
        return seAvailableSlots;
    }

    /**
     * 
     * @param seAvailableSlots
     *     The seAvailableSlots
     */
    public void setSeAvailableSlots(List<Object> seAvailableSlots) {
        this.seAvailableSlots = seAvailableSlots;
    }

    /**
     * 
     * @return
     *     The delightApproved
     */
    public boolean isDelightApproved() {
        return delightApproved;
    }

    /**
     * 
     * @param delightApproved
     *     The delightApproved
     */
    public void setDelightApproved(boolean delightApproved) {
        this.delightApproved = delightApproved;
    }

    /**
     * 
     * @return
     *     The delightRequested
     */
    public boolean isDelightRequested() {
        return delightRequested;
    }

    /**
     * 
     * @param delightRequested
     *     The delightRequested
     */
    public void setDelightRequested(boolean delightRequested) {
        this.delightRequested = delightRequested;
    }

    /**
     * 
     * @return
     *     The architectApproved
     */
    public boolean isArchitectApproved() {
        return architectApproved;
    }

    /**
     * 
     * @param architectApproved
     *     The architectApproved
     */
    public void setArchitectApproved(boolean architectApproved) {
        this.architectApproved = architectApproved;
    }

    /**
     * 
     * @return
     *     The architectRequested
     */
    public boolean isArchitectRequested() {
        return architectRequested;
    }

    /**
     * 
     * @param architectRequested
     *     The architectRequested
     */
    public void setArchitectRequested(boolean architectRequested) {
        this.architectRequested = architectRequested;
    }

    /**
     * 
     * @return
     *     The codeReviewerApproved
     */
    public boolean isCodeReviewerApproved() {
        return codeReviewerApproved;
    }

    /**
     * 
     * @param codeReviewerApproved
     *     The codeReviewerApproved
     */
    public void setCodeReviewerApproved(boolean codeReviewerApproved) {
        this.codeReviewerApproved = codeReviewerApproved;
    }

    /**
     * 
     * @return
     *     The codeReviewerRequested
     */
    public boolean isCodeReviewerRequested() {
        return codeReviewerRequested;
    }

    /**
     * 
     * @param codeReviewerRequested
     *     The codeReviewerRequested
     */
    public void setCodeReviewerRequested(boolean codeReviewerRequested) {
        this.codeReviewerRequested = codeReviewerRequested;
    }

    /**
     * 
     * @return
     *     The qaApproved
     */
    public boolean isQaApproved() {
        return qaApproved;
    }

    /**
     * 
     * @param qaApproved
     *     The qaApproved
     */
    public void setQaApproved(boolean qaApproved) {
        this.qaApproved = qaApproved;
    }

    /**
     * 
     * @return
     *     The qaRequested
     */
    public boolean isQaRequested() {
        return qaRequested;
    }

    /**
     * 
     * @param qaRequested
     *     The qaRequested
     */
    public void setQaRequested(boolean qaRequested) {
        this.qaRequested = qaRequested;
    }

    /**
     * 
     * @return
     *     The writerApproved
     */
    public boolean isWriterApproved() {
        return writerApproved;
    }

    /**
     * 
     * @param writerApproved
     *     The writerApproved
     */
    public void setWriterApproved(boolean writerApproved) {
        this.writerApproved = writerApproved;
    }

    /**
     * 
     * @return
     *     The writerRequested
     */
    public boolean isWriterRequested() {
        return writerRequested;
    }

    /**
     * 
     * @param writerRequested
     *     The writerRequested
     */
    public void setWriterRequested(boolean writerRequested) {
        this.writerRequested = writerRequested;
    }

    /**
     * 
     * @return
     *     The designerApproved
     */
    public boolean isDesignerApproved() {
        return designerApproved;
    }

    /**
     * 
     * @param designerApproved
     *     The designerApproved
     */
    public void setDesignerApproved(boolean designerApproved) {
        this.designerApproved = designerApproved;
    }

    /**
     * 
     * @return
     *     The designerRequested
     */
    public boolean isDesignerRequested() {
        return designerRequested;
    }

    /**
     * 
     * @param designerRequested
     *     The designerRequested
     */
    public void setDesignerRequested(boolean designerRequested) {
        this.designerRequested = designerRequested;
    }

    /**
     * 
     * @return
     *     The seApproved
     */
    public boolean isSeApproved() {
        return seApproved;
    }

    /**
     * 
     * @param seApproved
     *     The seApproved
     */
    public void setSeApproved(boolean seApproved) {
        this.seApproved = seApproved;
    }

    /**
     * 
     * @return
     *     The seRequested
     */
    public boolean isSeRequested() {
        return seRequested;
    }

    /**
     * 
     * @param seRequested
     *     The seRequested
     */
    public void setSeRequested(boolean seRequested) {
        this.seRequested = seRequested;
    }

    /**
     * 
     * @return
     *     The pmApproved
     */
    public boolean isPmApproved() {
        return pmApproved;
    }

    /**
     * 
     * @param pmApproved
     *     The pmApproved
     */
    public void setPmApproved(boolean pmApproved) {
        this.pmApproved = pmApproved;
    }

    /**
     * 
     * @return
     *     The pmRequested
     */
    public boolean isPmRequested() {
        return pmRequested;
    }

    /**
     * 
     * @param pmRequested
     *     The pmRequested
     */
    public void setPmRequested(boolean pmRequested) {
        this.pmRequested = pmRequested;
    }

    /**
     * 
     * @return
     *     The gigsterApproved
     */
    public boolean isGigsterApproved() {
        return gigsterApproved;
    }

    /**
     * 
     * @param gigsterApproved
     *     The gigsterApproved
     */
    public void setGigsterApproved(boolean gigsterApproved) {
        this.gigsterApproved = gigsterApproved;
    }

    /**
     * 
     * @return
     *     The gigsterRequested
     */
    public boolean isGigsterRequested() {
        return gigsterRequested;
    }

    /**
     * 
     * @param gigsterRequested
     *     The gigsterRequested
     */
    public void setGigsterRequested(boolean gigsterRequested) {
        this.gigsterRequested = gigsterRequested;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The role
     */
    public String getRole() {
        return role;
    }

    /**
     * 
     * @param role
     *     The role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 
     * @return
     *     The votes
     */
    public List<Object> getVotes() {
        return votes;
    }

    /**
     * 
     * @param votes
     *     The votes
     */
    public void setVotes(List<Object> votes) {
        this.votes = votes;
    }

    /**
     * 
     * @return
     *     The numRatings
     */
    public int getNumRatings() {
        return numRatings;
    }

    /**
     * 
     * @param numRatings
     *     The numRatings
     */
    public void setNumRatings(int numRatings) {
        this.numRatings = numRatings;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The karmaHistory
     */
    public List<Object> getKarmaHistory() {
        return karmaHistory;
    }

    /**
     * 
     * @param karmaHistory
     *     The karmaHistory
     */
    public void setKarmaHistory(List<Object> karmaHistory) {
        this.karmaHistory = karmaHistory;
    }

    /**
     * 
     * @return
     *     The karmaDimensions
     */
    public KarmaDimensions getKarmaDimensions() {
        return karmaDimensions;
    }

    /**
     * 
     * @param karmaDimensions
     *     The karmaDimensions
     */
    public void setKarmaDimensions(KarmaDimensions karmaDimensions) {
        this.karmaDimensions = karmaDimensions;
    }

    /**
     * 
     * @return
     *     The karma
     */
    public int getKarma() {
        return karma;
    }

    /**
     * 
     * @param karma
     *     The karma
     */
    public void setKarma(int karma) {
        this.karma = karma;
    }

    /**
     * 
     * @return
     *     The bestProjects
     */
    public List<Object> getBestProjects() {
        return bestProjects;
    }

    /**
     * 
     * @param bestProjects
     *     The bestProjects
     */
    public void setBestProjects(List<Object> bestProjects) {
        this.bestProjects = bestProjects;
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
     *     The platforms
     */
    public List<Object> getPlatforms() {
        return platforms;
    }

    /**
     * 
     * @param platforms
     *     The platforms
     */
    public void setPlatforms(List<Object> platforms) {
        this.platforms = platforms;
    }

    /**
     * 
     * @return
     *     The skills
     */
    public List<Object> getSkills() {
        return skills;
    }

    /**
     * 
     * @param skills
     *     The skills
     */
    public void setSkills(List<Object> skills) {
        this.skills = skills;
    }

    /**
     * 
     * @return
     *     The profileLinks
     */
    public ProfileLinks getProfileLinks() {
        return profileLinks;
    }

    /**
     * 
     * @param profileLinks
     *     The profileLinks
     */
    public void setProfileLinks(ProfileLinks profileLinks) {
        this.profileLinks = profileLinks;
    }

    /**
     * 
     * @return
     *     The city
     */
    public City getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The lastActionTime
     */
    public String getLastActionTime() {
        return lastActionTime;
    }

    /**
     * 
     * @param lastActionTime
     *     The lastActionTime
     */
    public void setLastActionTime(String lastActionTime) {
        this.lastActionTime = lastActionTime;
    }

    /**
     * 
     * @return
     *     The interviews
     */
    public List<Object> getInterviews() {
        return interviews;
    }

    /**
     * 
     * @param interviews
     *     The interviews
     */
    public void setInterviews(List<Object> interviews) {
        this.interviews = interviews;
    }

    /**
     * 
     * @return
     *     The updated
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated
     *     The updated
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The accepted
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * 
     * @param accepted
     *     The accepted
     */
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getImgURL() {
        return imgURL;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Id).append(provider).append(name).append(budget).append(durationPref).append(email).append(hashedPassword).append(salt).append(fact).append(phone).append(timezone).append(V).append(signupGig).append(referral).append(slackId).append(notifyOnLogin).append(hideMilestonesTutorial).append(receiveKarmaNotifications).append(workSamples).append(acceptChats).append(availabilityHistory).append(available).append(seAvailableSlots).append(delightApproved).append(delightRequested).append(architectApproved).append(architectRequested).append(codeReviewerApproved).append(codeReviewerRequested).append(qaApproved).append(qaRequested).append(writerApproved).append(writerRequested).append(designerApproved).append(designerRequested).append(seApproved).append(seRequested).append(pmApproved).append(pmRequested).append(gigsterApproved).append(gigsterRequested).append(type).append(role).append(votes).append(numRatings).append(rating).append(karmaHistory).append(karmaDimensions).append(karma).append(bestProjects).append(techs).append(platforms).append(skills).append(profileLinks).append(city).append(lastActionTime).append(interviews).append(updated).append(created).append(accepted).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Poster) == false) {
            return false;
        }
        Poster rhs = ((Poster) other);
        return new EqualsBuilder().append(Id, rhs.Id).append(provider, rhs.provider).append(name, rhs.name).append(budget, rhs.budget).append(durationPref, rhs.durationPref).append(email, rhs.email).append(hashedPassword, rhs.hashedPassword).append(salt, rhs.salt).append(fact, rhs.fact).append(phone, rhs.phone).append(timezone, rhs.timezone).append(V, rhs.V).append(signupGig, rhs.signupGig).append(referral, rhs.referral).append(slackId, rhs.slackId).append(notifyOnLogin, rhs.notifyOnLogin).append(hideMilestonesTutorial, rhs.hideMilestonesTutorial).append(receiveKarmaNotifications, rhs.receiveKarmaNotifications).append(workSamples, rhs.workSamples).append(acceptChats, rhs.acceptChats).append(availabilityHistory, rhs.availabilityHistory).append(available, rhs.available).append(seAvailableSlots, rhs.seAvailableSlots).append(delightApproved, rhs.delightApproved).append(delightRequested, rhs.delightRequested).append(architectApproved, rhs.architectApproved).append(architectRequested, rhs.architectRequested).append(codeReviewerApproved, rhs.codeReviewerApproved).append(codeReviewerRequested, rhs.codeReviewerRequested).append(qaApproved, rhs.qaApproved).append(qaRequested, rhs.qaRequested).append(writerApproved, rhs.writerApproved).append(writerRequested, rhs.writerRequested).append(designerApproved, rhs.designerApproved).append(designerRequested, rhs.designerRequested).append(seApproved, rhs.seApproved).append(seRequested, rhs.seRequested).append(pmApproved, rhs.pmApproved).append(pmRequested, rhs.pmRequested).append(gigsterApproved, rhs.gigsterApproved).append(gigsterRequested, rhs.gigsterRequested).append(type, rhs.type).append(role, rhs.role).append(votes, rhs.votes).append(numRatings, rhs.numRatings).append(rating, rhs.rating).append(karmaHistory, rhs.karmaHistory).append(karmaDimensions, rhs.karmaDimensions).append(karma, rhs.karma).append(bestProjects, rhs.bestProjects).append(techs, rhs.techs).append(platforms, rhs.platforms).append(skills, rhs.skills).append(profileLinks, rhs.profileLinks).append(city, rhs.city).append(lastActionTime, rhs.lastActionTime).append(interviews, rhs.interviews).append(updated, rhs.updated).append(created, rhs.created).append(accepted, rhs.accepted).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
