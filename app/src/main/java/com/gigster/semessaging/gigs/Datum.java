
package com.gigster.semessaging.gigs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joda.time.DateTime;

@Generated("org.jsonschema2pojo")
public class Datum implements Comparable<Datum>{

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("canonical")
    @Expose
    private String canonical;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("duration")
    @Expose
    private long duration;
    @SerializedName("durationUnits")
    @Expose
    private String durationUnits;
    @SerializedName("dollarAmount")
    @Expose
    private long dollarAmount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("salesEngineerGuess")
    @Expose
    private String salesEngineerGuess;
    @SerializedName("emailLater")
    @Expose
    private boolean emailLater;
    @SerializedName("organizationSize")
    @Expose
    private String organizationSize;
    @SerializedName("poster")
    @Expose
    private Poster poster;
    @SerializedName("__v")
    @Expose
    private long V;
    @SerializedName("stale")
    @Expose
    private boolean stale;
    @SerializedName("organization")
    @Expose
    private Organization organization;
    @SerializedName("tracking")
    @Expose
    private Tracking tracking;
    @SerializedName("flags")
    @Expose
    private Flags flags;
    @SerializedName("qualified")
    @Expose
    private Object qualified;
    @SerializedName("engaged")
    @Expose
    private String engaged;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("designPolish")
    @Expose
    private Object designPolish;
    @SerializedName("checkedForMissedChatEmail")
    @Expose
    private boolean checkedForMissedChatEmail;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = new ArrayList<Doc>();
    @SerializedName("payMilestones")
    @Expose
    private long payMilestones;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("tools")
    @Expose
    private Tools tools;
    @SerializedName("risks")
    @Expose
    private Risks risks;
    @SerializedName("reviews")
    @Expose
    private List<Object> reviews = new ArrayList<Object>();
    @SerializedName("requiredTeamSize")
    @Expose
    private long requiredTeamSize;
    @SerializedName("team")
    @Expose
    private List<Object> team = new ArrayList<Object>();
    @SerializedName("colleagues")
    @Expose
    private List<Object> colleagues = new ArrayList<Object>();
    @SerializedName("qualityReviews")
    @Expose
    private List<Object> qualityReviews = new ArrayList<Object>();
    @SerializedName("specReviews")
    @Expose
    private List<Object> specReviews = new ArrayList<Object>();
    @SerializedName("nps")
    @Expose
    private long nps;
    @SerializedName("customerLike")
    @Expose
    private List<Object> customerLike = new ArrayList<Object>();
    @SerializedName("customerDislike")
    @Expose
    private List<Object> customerDislike = new ArrayList<Object>();
    @SerializedName("customerLikelyToRecommend")
    @Expose
    private List<Object> customerLikelyToRecommend = new ArrayList<Object>();
    @SerializedName("customerSatisfactions")
    @Expose
    private List<Object> customerSatisfactions = new ArrayList<Object>();
    @SerializedName("pmStatus")
    @Expose
    private String pmStatus;
    @SerializedName("statusReached")
    @Expose
    private StatusReached statusReached;
    @SerializedName("staleReason")
    @Expose
    private String staleReason;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("paymentMade")
    @Expose
    private long paymentMade;
    @SerializedName("paymentReceived")
    @Expose
    private long paymentReceived;
    @SerializedName("terms")
    @Expose
    private List<Object> terms = new ArrayList<Object>();
    @SerializedName("progressUpdates")
    @Expose
    private List<Object> progressUpdates = new ArrayList<Object>();
    @SerializedName("milestonesSpecification")
    @Expose
    private MilestonesSpecification milestonesSpecification;
    @SerializedName("currentMilestoneIndex")
    @Expose
    private long currentMilestoneIndex;
    @SerializedName("milestones")
    @Expose
    private List<Milestone> milestones = new ArrayList<Milestone>();
    @SerializedName("qualifiers")
    @Expose
    private List<Object> qualifiers = new ArrayList<Object>();
    @SerializedName("postDevTasks")
    @Expose
    private List<Object> postDevTasks = new ArrayList<Object>();
    @SerializedName("preDevTasks")
    @Expose
    private List<Object> preDevTasks = new ArrayList<Object>();
    @SerializedName("whiteboard")
    @Expose
    private List<Object> whiteboard = new ArrayList<Object>();
    @SerializedName("features")
    @Expose
    private List<Object> features = new ArrayList<Object>();
    @SerializedName("keyFeatures")
    @Expose
    private List<Object> keyFeatures = new ArrayList<Object>();
    @SerializedName("polishLevel")
    @Expose
    private PolishLevel polishLevel;
    @SerializedName("templates")
    @Expose
    private List<Object> templates = new ArrayList<Object>();
    @SerializedName("skills")
    @Expose
    private List<Object> skills = new ArrayList<Object>();
    @SerializedName("projectTypes")
    @Expose
    private List<Object> projectTypes = new ArrayList<Object>();
    @SerializedName("techs")
    @Expose
    private List<Object> techs = new ArrayList<Object>();
    @SerializedName("platforms")
    @Expose
    private List<String> platforms = new ArrayList<String>();
    @SerializedName("margin")
    @Expose
    private double margin;
    @SerializedName("cost")
    @Expose
    private double cost;
    @SerializedName("costingType")
    @Expose
    private String costingType;
    @SerializedName("hoursEstimate")
    @Expose
    private double hoursEstimate;
    @SerializedName("chatPrice")
    @Expose
    private double chatPrice;
    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("firstMessage")
    @Expose
    private Object firstMessage;
    @SerializedName("lastContactChannel")
    @Expose
    private Object lastContactChannel;
    @SerializedName("lastContactByGigster")
    @Expose
    private String lastContactByGigster;
    @SerializedName("lastContactByClient")
    @Expose
    private String lastContactByClient;
    @SerializedName("lastEmailBy")
    @Expose
    private Object lastEmailBy;
    @SerializedName("lastEmailTime")
    @Expose
    private Object lastEmailTime;
    @SerializedName("lastChatBy")
    @Expose
    private String lastChatBy;
    @SerializedName("lastMissedChatEmailToPoc")
    @Expose
    private String lastMissedChatEmailToPoc;
    @SerializedName("lastMissedChatEmailToClient")
    @Expose
    private String lastMissedChatEmailToClient;
    @SerializedName("lastChatEmail")
    @Expose
    private String lastChatEmail;
    @SerializedName("lastChatTime")
    @Expose
    private String lastChatTime;
    @SerializedName("clientOwnsCode")
    @Expose
    private boolean clientOwnsCode;
    @SerializedName("gigsterEsign")
    @Expose
    private Object gigsterEsign;
    @SerializedName("boughtNDA")
    @Expose
    private boolean boughtNDA;
    @SerializedName("clientNDASign")
    @Expose
    private String clientNDASign;
    @SerializedName("clientEsign")
    @Expose
    private Object clientEsign;
    @SerializedName("internalType")
    @Expose
    private Object internalType;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("lastUpdate")
    @Expose
    private String lastUpdate;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("howDidTheCustomerFindUs")
    @Expose
    private String howDidTheCustomerFindUs;
    @SerializedName("pdfUrl")
    @Expose
    private PdfUrl pdfUrl;
    @SerializedName("salesEngineer")
    @Expose
    private String salesEngineer;
    @SerializedName("seNotes")
    @Expose
    private String seNotes;
    @SerializedName("info")
    @Expose
    private String info;
    @SerializedName("timeline")
    @Expose
    private String timeline;
    @SerializedName("customerPersonality")
    @Expose
    private String customerPersonality;
    @SerializedName("legalEntity")
    @Expose
    private Object legalEntity;
    @SerializedName("startDate")
    @Expose
    private Object startDate;
    @SerializedName("projectManager")
    @Expose
    private String projectManager;
    @SerializedName("lastHealthReportDate")
    @Expose
    private String lastHealthReportDate;
    @SerializedName("quote")
    @Expose
    private Quote quote;
    @SerializedName("calculator")
    @Expose
    private Calculator calculator;
    @SerializedName("gdriveUrl")
    @Expose
    private String gdriveUrl;
    @SerializedName("trelloUrl")
    @Expose
    private String trelloUrl;
    @SerializedName("githubUrl")
    @Expose
    private String githubUrl;
    @SerializedName("buildUrl")
    @Expose
    private String buildUrl;
    @SerializedName("dropboxUrl")
    @Expose
    private String dropboxUrl;
    @SerializedName("numberOfFeatures")
    @Expose
    private long numberOfFeatures;
    @SerializedName("maxStartDate")
    @Expose
    private String maxStartDate;
    @SerializedName("techStack")
    @Expose
    private String techStack;

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
     *     The canonical
     */
    public String getCanonical() {
        return canonical;
    }

    /**
     * 
     * @param canonical
     *     The canonical
     */
    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The durationUnits
     */
    public String getDurationUnits() {
        return durationUnits;
    }

    /**
     * 
     * @param durationUnits
     *     The durationUnits
     */
    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    /**
     * 
     * @return
     *     The dollarAmount
     */
    public long getDollarAmount() {
        return dollarAmount;
    }

    /**
     * 
     * @param dollarAmount
     *     The dollarAmount
     */
    public void setDollarAmount(long dollarAmount) {
        this.dollarAmount = dollarAmount;
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
     *     The salesEngineerGuess
     */
    public String getSalesEngineerGuess() {
        return salesEngineerGuess;
    }

    /**
     * 
     * @param salesEngineerGuess
     *     The salesEngineerGuess
     */
    public void setSalesEngineerGuess(String salesEngineerGuess) {
        this.salesEngineerGuess = salesEngineerGuess;
    }

    /**
     * 
     * @return
     *     The emailLater
     */
    public boolean isEmailLater() {
        return emailLater;
    }

    /**
     * 
     * @param emailLater
     *     The emailLater
     */
    public void setEmailLater(boolean emailLater) {
        this.emailLater = emailLater;
    }

    /**
     * 
     * @return
     *     The organizationSize
     */
    public String getOrganizationSize() {
        return organizationSize;
    }

    /**
     * 
     * @param organizationSize
     *     The organizationSize
     */
    public void setOrganizationSize(String organizationSize) {
        this.organizationSize = organizationSize;
    }

    /**
     * 
     * @return
     *     The poster
     */
    public Poster getPoster() {
        return poster;
    }

    /**
     * 
     * @param poster
     *     The poster
     */
    public void setPoster(Poster poster) {
        this.poster = poster;
    }

    /**
     * 
     * @return
     *     The V
     */
    public long getV() {
        return V;
    }

    /**
     * 
     * @param V
     *     The __v
     */
    public void setV(long V) {
        this.V = V;
    }

    /**
     * 
     * @return
     *     The stale
     */
    public boolean isStale() {
        return stale;
    }

    /**
     * 
     * @param stale
     *     The stale
     */
    public void setStale(boolean stale) {
        this.stale = stale;
    }

    /**
     * 
     * @return
     *     The organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * 
     * @param organization
     *     The organization
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * 
     * @return
     *     The tracking
     */
    public Tracking getTracking() {
        return tracking;
    }

    /**
     * 
     * @param tracking
     *     The tracking
     */
    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }

    /**
     * 
     * @return
     *     The flags
     */
    public Flags getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    /**
     * 
     * @return
     *     The qualified
     */
    public Object getQualified() {
        return qualified;
    }

    /**
     * 
     * @param qualified
     *     The qualified
     */
    public void setQualified(Object qualified) {
        this.qualified = qualified;
    }

    /**
     * 
     * @return
     *     The engaged
     */
    public String getEngaged() {
        return engaged;
    }

    /**
     * 
     * @param engaged
     *     The engaged
     */
    public void setEngaged(String engaged) {
        this.engaged = engaged;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The designPolish
     */
    public Object getDesignPolish() {
        return designPolish;
    }

    /**
     * 
     * @param designPolish
     *     The designPolish
     */
    public void setDesignPolish(Object designPolish) {
        this.designPolish = designPolish;
    }

    /**
     * 
     * @return
     *     The checkedForMissedChatEmail
     */
    public boolean isCheckedForMissedChatEmail() {
        return checkedForMissedChatEmail;
    }

    /**
     * 
     * @param checkedForMissedChatEmail
     *     The checkedForMissedChatEmail
     */
    public void setCheckedForMissedChatEmail(boolean checkedForMissedChatEmail) {
        this.checkedForMissedChatEmail = checkedForMissedChatEmail;
    }

    /**
     * 
     * @return
     *     The docs
     */
    public List<Doc> getDocs() {
        return docs;
    }

    /**
     * 
     * @param docs
     *     The docs
     */
    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    /**
     * 
     * @return
     *     The payMilestones
     */
    public long getPayMilestones() {
        return payMilestones;
    }

    /**
     * 
     * @param payMilestones
     *     The payMilestones
     */
    public void setPayMilestones(long payMilestones) {
        this.payMilestones = payMilestones;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The tools
     */
    public Tools getTools() {
        return tools;
    }

    /**
     * 
     * @param tools
     *     The tools
     */
    public void setTools(Tools tools) {
        this.tools = tools;
    }

    /**
     * 
     * @return
     *     The risks
     */
    public Risks getRisks() {
        return risks;
    }

    /**
     * 
     * @param risks
     *     The risks
     */
    public void setRisks(Risks risks) {
        this.risks = risks;
    }

    /**
     * 
     * @return
     *     The reviews
     */
    public List<Object> getReviews() {
        return reviews;
    }

    /**
     * 
     * @param reviews
     *     The reviews
     */
    public void setReviews(List<Object> reviews) {
        this.reviews = reviews;
    }

    /**
     * 
     * @return
     *     The requiredTeamSize
     */
    public long getRequiredTeamSize() {
        return requiredTeamSize;
    }

    /**
     * 
     * @param requiredTeamSize
     *     The requiredTeamSize
     */
    public void setRequiredTeamSize(long requiredTeamSize) {
        this.requiredTeamSize = requiredTeamSize;
    }

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
     *     The colleagues
     */
    public List<Object> getColleagues() {
        return colleagues;
    }

    /**
     * 
     * @param colleagues
     *     The colleagues
     */
    public void setColleagues(List<Object> colleagues) {
        this.colleagues = colleagues;
    }

    /**
     * 
     * @return
     *     The qualityReviews
     */
    public List<Object> getQualityReviews() {
        return qualityReviews;
    }

    /**
     * 
     * @param qualityReviews
     *     The qualityReviews
     */
    public void setQualityReviews(List<Object> qualityReviews) {
        this.qualityReviews = qualityReviews;
    }

    /**
     * 
     * @return
     *     The specReviews
     */
    public List<Object> getSpecReviews() {
        return specReviews;
    }

    /**
     * 
     * @param specReviews
     *     The specReviews
     */
    public void setSpecReviews(List<Object> specReviews) {
        this.specReviews = specReviews;
    }

    /**
     * 
     * @return
     *     The nps
     */
    public long getNps() {
        return nps;
    }

    /**
     * 
     * @param nps
     *     The nps
     */
    public void setNps(long nps) {
        this.nps = nps;
    }

    /**
     * 
     * @return
     *     The customerLike
     */
    public List<Object> getCustomerLike() {
        return customerLike;
    }

    /**
     * 
     * @param customerLike
     *     The customerLike
     */
    public void setCustomerLike(List<Object> customerLike) {
        this.customerLike = customerLike;
    }

    /**
     * 
     * @return
     *     The customerDislike
     */
    public List<Object> getCustomerDislike() {
        return customerDislike;
    }

    /**
     * 
     * @param customerDislike
     *     The customerDislike
     */
    public void setCustomerDislike(List<Object> customerDislike) {
        this.customerDislike = customerDislike;
    }

    /**
     * 
     * @return
     *     The customerLikelyToRecommend
     */
    public List<Object> getCustomerLikelyToRecommend() {
        return customerLikelyToRecommend;
    }

    /**
     * 
     * @param customerLikelyToRecommend
     *     The customerLikelyToRecommend
     */
    public void setCustomerLikelyToRecommend(List<Object> customerLikelyToRecommend) {
        this.customerLikelyToRecommend = customerLikelyToRecommend;
    }

    /**
     * 
     * @return
     *     The customerSatisfactions
     */
    public List<Object> getCustomerSatisfactions() {
        return customerSatisfactions;
    }

    /**
     * 
     * @param customerSatisfactions
     *     The customerSatisfactions
     */
    public void setCustomerSatisfactions(List<Object> customerSatisfactions) {
        this.customerSatisfactions = customerSatisfactions;
    }

    /**
     * 
     * @return
     *     The pmStatus
     */
    public String getPmStatus() {
        return pmStatus;
    }

    /**
     * 
     * @param pmStatus
     *     The pmStatus
     */
    public void setPmStatus(String pmStatus) {
        this.pmStatus = pmStatus;
    }

    /**
     * 
     * @return
     *     The statusReached
     */
    public StatusReached getStatusReached() {
        return statusReached;
    }

    /**
     * 
     * @param statusReached
     *     The statusReached
     */
    public void setStatusReached(StatusReached statusReached) {
        this.statusReached = statusReached;
    }

    /**
     * 
     * @return
     *     The staleReason
     */
    public String getStaleReason() {
        return staleReason;
    }

    /**
     * 
     * @param staleReason
     *     The staleReason
     */
    public void setStaleReason(String staleReason) {
        this.staleReason = staleReason;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The paymentMade
     */
    public long getPaymentMade() {
        return paymentMade;
    }

    /**
     * 
     * @param paymentMade
     *     The paymentMade
     */
    public void setPaymentMade(long paymentMade) {
        this.paymentMade = paymentMade;
    }

    /**
     * 
     * @return
     *     The paymentReceived
     */
    public long getPaymentReceived() {
        return paymentReceived;
    }

    /**
     * 
     * @param paymentReceived
     *     The paymentReceived
     */
    public void setPaymentReceived(long paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    /**
     * 
     * @return
     *     The terms
     */
    public List<Object> getTerms() {
        return terms;
    }

    /**
     * 
     * @param terms
     *     The terms
     */
    public void setTerms(List<Object> terms) {
        this.terms = terms;
    }

    /**
     * 
     * @return
     *     The progressUpdates
     */
    public List<Object> getProgressUpdates() {
        return progressUpdates;
    }

    /**
     * 
     * @param progressUpdates
     *     The progressUpdates
     */
    public void setProgressUpdates(List<Object> progressUpdates) {
        this.progressUpdates = progressUpdates;
    }

    /**
     * 
     * @return
     *     The milestonesSpecification
     */
    public MilestonesSpecification getMilestonesSpecification() {
        return milestonesSpecification;
    }

    /**
     * 
     * @param milestonesSpecification
     *     The milestonesSpecification
     */
    public void setMilestonesSpecification(MilestonesSpecification milestonesSpecification) {
        this.milestonesSpecification = milestonesSpecification;
    }

    /**
     * 
     * @return
     *     The currentMilestoneIndex
     */
    public long getCurrentMilestoneIndex() {
        return currentMilestoneIndex;
    }

    /**
     * 
     * @param currentMilestoneIndex
     *     The currentMilestoneIndex
     */
    public void setCurrentMilestoneIndex(long currentMilestoneIndex) {
        this.currentMilestoneIndex = currentMilestoneIndex;
    }

    /**
     * 
     * @return
     *     The milestones
     */
    public List<Milestone> getMilestones() {
        return milestones;
    }

    /**
     * 
     * @param milestones
     *     The milestones
     */
    public void setMilestones(List<Milestone> milestones) {
        this.milestones = milestones;
    }

    /**
     * 
     * @return
     *     The qualifiers
     */
    public List<Object> getQualifiers() {
        return qualifiers;
    }

    /**
     * 
     * @param qualifiers
     *     The qualifiers
     */
    public void setQualifiers(List<Object> qualifiers) {
        this.qualifiers = qualifiers;
    }

    /**
     * 
     * @return
     *     The postDevTasks
     */
    public List<Object> getPostDevTasks() {
        return postDevTasks;
    }

    /**
     * 
     * @param postDevTasks
     *     The postDevTasks
     */
    public void setPostDevTasks(List<Object> postDevTasks) {
        this.postDevTasks = postDevTasks;
    }

    /**
     * 
     * @return
     *     The preDevTasks
     */
    public List<Object> getPreDevTasks() {
        return preDevTasks;
    }

    /**
     * 
     * @param preDevTasks
     *     The preDevTasks
     */
    public void setPreDevTasks(List<Object> preDevTasks) {
        this.preDevTasks = preDevTasks;
    }

    /**
     * 
     * @return
     *     The whiteboard
     */
    public List<Object> getWhiteboard() {
        return whiteboard;
    }

    /**
     * 
     * @param whiteboard
     *     The whiteboard
     */
    public void setWhiteboard(List<Object> whiteboard) {
        this.whiteboard = whiteboard;
    }

    /**
     * 
     * @return
     *     The features
     */
    public List<Object> getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    /**
     * 
     * @return
     *     The keyFeatures
     */
    public List<Object> getKeyFeatures() {
        return keyFeatures;
    }

    /**
     * 
     * @param keyFeatures
     *     The keyFeatures
     */
    public void setKeyFeatures(List<Object> keyFeatures) {
        this.keyFeatures = keyFeatures;
    }

    /**
     * 
     * @return
     *     The polishLevel
     */
    public PolishLevel getPolishLevel() {
        return polishLevel;
    }

    /**
     * 
     * @param polishLevel
     *     The polishLevel
     */
    public void setPolishLevel(PolishLevel polishLevel) {
        this.polishLevel = polishLevel;
    }

    /**
     * 
     * @return
     *     The templates
     */
    public List<Object> getTemplates() {
        return templates;
    }

    /**
     * 
     * @param templates
     *     The templates
     */
    public void setTemplates(List<Object> templates) {
        this.templates = templates;
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
     *     The projectTypes
     */
    public List<Object> getProjectTypes() {
        return projectTypes;
    }

    /**
     * 
     * @param projectTypes
     *     The projectTypes
     */
    public void setProjectTypes(List<Object> projectTypes) {
        this.projectTypes = projectTypes;
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
    public List<String> getPlatforms() {
        return platforms;
    }

    /**
     * 
     * @param platforms
     *     The platforms
     */
    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    /**
     * 
     * @return
     *     The margin
     */
    public double getMargin() {
        return margin;
    }

    /**
     * 
     * @param margin
     *     The margin
     */
    public void setMargin(long margin) {
        this.margin = margin;
    }

    /**
     * 
     * @return
     *     The cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * 
     * @param cost
     *     The cost
     */
    public void setCost(long cost) {
        this.cost = cost;
    }

    /**
     * 
     * @return
     *     The costingType
     */
    public String getCostingType() {
        return costingType;
    }

    /**
     * 
     * @param costingType
     *     The costingType
     */
    public void setCostingType(String costingType) {
        this.costingType = costingType;
    }

    /**
     * 
     * @return
     *     The hoursEstimate
     */
    public double getHoursEstimate() {
        return hoursEstimate;
    }

    /**
     * 
     * @param hoursEstimate
     *     The hoursEstimate
     */
    public void setHoursEstimate(long hoursEstimate) {
        this.hoursEstimate = hoursEstimate;
    }

    /**
     * 
     * @return
     *     The chatPrice
     */
    public double getChatPrice() {
        return chatPrice;
    }

    /**
     * 
     * @param chatPrice
     *     The chatPrice
     */
    public void setChatPrice(long chatPrice) {
        this.chatPrice = chatPrice;
    }

    /**
     * 
     * @return
     *     The price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The firstMessage
     */
    public Object getFirstMessage() {
        return firstMessage;
    }

    /**
     * 
     * @param firstMessage
     *     The firstMessage
     */
    public void setFirstMessage(Object firstMessage) {
        this.firstMessage = firstMessage;
    }

    /**
     * 
     * @return
     *     The lastContactChannel
     */
    public Object getLastContactChannel() {
        return lastContactChannel;
    }

    /**
     * 
     * @param lastContactChannel
     *     The lastContactChannel
     */
    public void setLastContactChannel(Object lastContactChannel) {
        this.lastContactChannel = lastContactChannel;
    }

    /**
     * 
     * @return
     *     The lastContactByGigster
     */
    public String getLastContactByGigster() {
        return lastContactByGigster;
    }

    /**
     * 
     * @param lastContactByGigster
     *     The lastContactByGigster
     */
    public void setLastContactByGigster(String lastContactByGigster) {
        this.lastContactByGigster = lastContactByGigster;
    }

    /**
     * 
     * @return
     *     The lastContactByClient
     */
    public String getLastContactByClient() {
        return lastContactByClient;
    }

    /**
     * 
     * @param lastContactByClient
     *     The lastContactByClient
     */
    public void setLastContactByClient(String lastContactByClient) {
        this.lastContactByClient = lastContactByClient;
    }

    /**
     * 
     * @return
     *     The lastEmailBy
     */
    public Object getLastEmailBy() {
        return lastEmailBy;
    }

    /**
     * 
     * @param lastEmailBy
     *     The lastEmailBy
     */
    public void setLastEmailBy(Object lastEmailBy) {
        this.lastEmailBy = lastEmailBy;
    }

    /**
     * 
     * @return
     *     The lastEmailTime
     */
    public Object getLastEmailTime() {
        return lastEmailTime;
    }

    /**
     * 
     * @param lastEmailTime
     *     The lastEmailTime
     */
    public void setLastEmailTime(Object lastEmailTime) {
        this.lastEmailTime = lastEmailTime;
    }

    /**
     * 
     * @return
     *     The lastChatBy
     */
    public String getLastChatBy() {
        return lastChatBy;
    }

    /**
     * 
     * @param lastChatBy
     *     The lastChatBy
     */
    public void setLastChatBy(String lastChatBy) {
        this.lastChatBy = lastChatBy;
    }

    /**
     * 
     * @return
     *     The lastMissedChatEmailToPoc
     */
    public String getLastMissedChatEmailToPoc() {
        return lastMissedChatEmailToPoc;
    }

    /**
     * 
     * @param lastMissedChatEmailToPoc
     *     The lastMissedChatEmailToPoc
     */
    public void setLastMissedChatEmailToPoc(String lastMissedChatEmailToPoc) {
        this.lastMissedChatEmailToPoc = lastMissedChatEmailToPoc;
    }

    /**
     * 
     * @return
     *     The lastMissedChatEmailToClient
     */
    public String getLastMissedChatEmailToClient() {
        return lastMissedChatEmailToClient;
    }

    /**
     * 
     * @param lastMissedChatEmailToClient
     *     The lastMissedChatEmailToClient
     */
    public void setLastMissedChatEmailToClient(String lastMissedChatEmailToClient) {
        this.lastMissedChatEmailToClient = lastMissedChatEmailToClient;
    }

    /**
     * 
     * @return
     *     The lastChatEmail
     */
    public String getLastChatEmail() {
        return lastChatEmail;
    }

    /**
     * 
     * @param lastChatEmail
     *     The lastChatEmail
     */
    public void setLastChatEmail(String lastChatEmail) {
        this.lastChatEmail = lastChatEmail;
    }

    /**
     * 
     * @return
     *     The lastChatTime
     */
    public DateTime getLastChatTime() {
        DateTime d = new DateTime(lastChatTime);
        return d;
    }

    /**
     * 
     * @param lastChatTime
     *     The lastChatTime
     */
    public void setLastChatTime(String lastChatTime) {
        this.lastChatTime = lastChatTime;
    }

    /**
     * 
     * @return
     *     The clientOwnsCode
     */
    public boolean isClientOwnsCode() {
        return clientOwnsCode;
    }

    /**
     * 
     * @param clientOwnsCode
     *     The clientOwnsCode
     */
    public void setClientOwnsCode(boolean clientOwnsCode) {
        this.clientOwnsCode = clientOwnsCode;
    }

    /**
     * 
     * @return
     *     The gigsterEsign
     */
    public Object getGigsterEsign() {
        return gigsterEsign;
    }

    /**
     * 
     * @param gigsterEsign
     *     The gigsterEsign
     */
    public void setGigsterEsign(Object gigsterEsign) {
        this.gigsterEsign = gigsterEsign;
    }

    /**
     * 
     * @return
     *     The boughtNDA
     */
    public boolean isBoughtNDA() {
        return boughtNDA;
    }

    /**
     * 
     * @param boughtNDA
     *     The boughtNDA
     */
    public void setBoughtNDA(boolean boughtNDA) {
        this.boughtNDA = boughtNDA;
    }

    /**
     * 
     * @return
     *     The clientNDASign
     */
    public String getClientNDASign() {
        return clientNDASign;
    }

    /**
     * 
     * @param clientNDASign
     *     The clientNDASign
     */
    public void setClientNDASign(String clientNDASign) {
        this.clientNDASign = clientNDASign;
    }

    /**
     * 
     * @return
     *     The clientEsign
     */
    public Object getClientEsign() {
        return clientEsign;
    }

    /**
     * 
     * @param clientEsign
     *     The clientEsign
     */
    public void setClientEsign(Object clientEsign) {
        this.clientEsign = clientEsign;
    }

    /**
     * 
     * @return
     *     The internalType
     */
    public Object getInternalType() {
        return internalType;
    }

    /**
     * 
     * @param internalType
     *     The internalType
     */
    public void setInternalType(Object internalType) {
        this.internalType = internalType;
    }

    /**
     * 
     * @return
     *     The type
     */
    public Object getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Object type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The lastUpdate
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 
     * @param lastUpdate
     *     The lastUpdate
     */
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
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
     *     The howDidTheCustomerFindUs
     */
    public String getHowDidTheCustomerFindUs() {
        return howDidTheCustomerFindUs;
    }

    /**
     * 
     * @param howDidTheCustomerFindUs
     *     The howDidTheCustomerFindUs
     */
    public void setHowDidTheCustomerFindUs(String howDidTheCustomerFindUs) {
        this.howDidTheCustomerFindUs = howDidTheCustomerFindUs;
    }

    /**
     * 
     * @return
     *     The pdfUrl
     */
    public PdfUrl getPdfUrl() {
        return pdfUrl;
    }

    /**
     * 
     * @param pdfUrl
     *     The pdfUrl
     */
    public void setPdfUrl(PdfUrl pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    /**
     * 
     * @return
     *     The salesEngineer
     */
    public String getSalesEngineer() {
        return salesEngineer;
    }

    /**
     * 
     * @param salesEngineer
     *     The salesEngineer
     */
    public void setSalesEngineer(String salesEngineer) {
        this.salesEngineer = salesEngineer;
    }

    /**
     * 
     * @return
     *     The seNotes
     */
    public String getSeNotes() {
        return seNotes;
    }

    /**
     * 
     * @param seNotes
     *     The seNotes
     */
    public void setSeNotes(String seNotes) {
        this.seNotes = seNotes;
    }

    /**
     * 
     * @return
     *     The info
     */
    public String getInfo() {
        return info;
    }

    /**
     * 
     * @param info
     *     The info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 
     * @return
     *     The timeline
     */
    public String getTimeline() {
        return timeline;
    }

    /**
     * 
     * @param timeline
     *     The timeline
     */
    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    /**
     * 
     * @return
     *     The customerPersonality
     */
    public String getCustomerPersonality() {
        return customerPersonality;
    }

    /**
     * 
     * @param customerPersonality
     *     The customerPersonality
     */
    public void setCustomerPersonality(String customerPersonality) {
        this.customerPersonality = customerPersonality;
    }

    /**
     * 
     * @return
     *     The legalEntity
     */
    public Object getLegalEntity() {
        return legalEntity;
    }

    /**
     * 
     * @param legalEntity
     *     The legalEntity
     */
    public void setLegalEntity(Object legalEntity) {
        this.legalEntity = legalEntity;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    public Object getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The startDate
     */
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The projectManager
     */
    public String getProjectManager() {
        return projectManager;
    }

    /**
     * 
     * @param projectManager
     *     The projectManager
     */
    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    /**
     * 
     * @return
     *     The lastHealthReportDate
     */
    public String getLastHealthReportDate() {
        return lastHealthReportDate;
    }

    /**
     * 
     * @param lastHealthReportDate
     *     The lastHealthReportDate
     */
    public void setLastHealthReportDate(String lastHealthReportDate) {
        this.lastHealthReportDate = lastHealthReportDate;
    }

    /**
     * 
     * @return
     *     The quote
     */
    public Quote getQuote() {
        return quote;
    }

    /**
     * 
     * @param quote
     *     The quote
     */
    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    /**
     * 
     * @return
     *     The calculator
     */
    public Calculator getCalculator() {
        return calculator;
    }

    /**
     * 
     * @param calculator
     *     The calculator
     */
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    /**
     * 
     * @return
     *     The gdriveUrl
     */
    public String getGdriveUrl() {
        return gdriveUrl;
    }

    /**
     * 
     * @param gdriveUrl
     *     The gdriveUrl
     */
    public void setGdriveUrl(String gdriveUrl) {
        this.gdriveUrl = gdriveUrl;
    }

    /**
     * 
     * @return
     *     The trelloUrl
     */
    public String getTrelloUrl() {
        return trelloUrl;
    }

    /**
     * 
     * @param trelloUrl
     *     The trelloUrl
     */
    public void setTrelloUrl(String trelloUrl) {
        this.trelloUrl = trelloUrl;
    }

    /**
     * 
     * @return
     *     The githubUrl
     */
    public String getGithubUrl() {
        return githubUrl;
    }

    /**
     * 
     * @param githubUrl
     *     The githubUrl
     */
    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    /**
     * 
     * @return
     *     The buildUrl
     */
    public String getBuildUrl() {
        return buildUrl;
    }

    /**
     * 
     * @param buildUrl
     *     The buildUrl
     */
    public void setBuildUrl(String buildUrl) {
        this.buildUrl = buildUrl;
    }

    /**
     * 
     * @return
     *     The dropboxUrl
     */
    public String getDropboxUrl() {
        return dropboxUrl;
    }

    /**
     * 
     * @param dropboxUrl
     *     The dropboxUrl
     */
    public void setDropboxUrl(String dropboxUrl) {
        this.dropboxUrl = dropboxUrl;
    }

    /**
     * 
     * @return
     *     The numberOfFeatures
     */
    public long getNumberOfFeatures() {
        return numberOfFeatures;
    }

    /**
     * 
     * @param numberOfFeatures
     *     The numberOfFeatures
     */
    public void setNumberOfFeatures(long numberOfFeatures) {
        this.numberOfFeatures = numberOfFeatures;
    }

    /**
     * 
     * @return
     *     The maxStartDate
     */
    public String getMaxStartDate() {
        return maxStartDate;
    }

    /**
     * 
     * @param maxStartDate
     *     The maxStartDate
     */
    public void setMaxStartDate(String maxStartDate) {
        this.maxStartDate = maxStartDate;
    }

    /**
     * 
     * @return
     *     The techStack
     */
    public String getTechStack() {
        return techStack;
    }

    /**
     * 
     * @param techStack
     *     The techStack
     */
    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Id).append(canonical).append(category).append(duration).append(durationUnits).append(dollarAmount).append(name).append(salesEngineerGuess).append(emailLater).append(organizationSize).append(poster).append(V).append(stale).append(organization).append(tracking).append(flags).append(qualified).append(engaged).append(meta).append(designPolish).append(checkedForMissedChatEmail).append(docs).append(payMilestones).append(tags).append(tools).append(risks).append(reviews).append(requiredTeamSize).append(team).append(colleagues).append(qualityReviews).append(specReviews).append(nps).append(customerLike).append(customerDislike).append(customerLikelyToRecommend).append(customerSatisfactions).append(pmStatus).append(statusReached).append(staleReason).append(state).append(status).append(paymentMade).append(paymentReceived).append(terms).append(progressUpdates).append(milestonesSpecification).append(currentMilestoneIndex).append(milestones).append(qualifiers).append(postDevTasks).append(preDevTasks).append(whiteboard).append(features).append(keyFeatures).append(polishLevel).append(templates).append(skills).append(projectTypes).append(techs).append(platforms).append(margin).append(cost).append(costingType).append(hoursEstimate).append(chatPrice).append(price).append(firstMessage).append(lastContactChannel).append(lastContactByGigster).append(lastContactByClient).append(lastEmailBy).append(lastEmailTime).append(lastChatBy).append(lastMissedChatEmailToPoc).append(lastMissedChatEmailToClient).append(lastChatEmail).append(lastChatTime).append(clientOwnsCode).append(gigsterEsign).append(boughtNDA).append(clientNDASign).append(clientEsign).append(internalType).append(type).append(lastUpdate).append(updated).append(created).append(howDidTheCustomerFindUs).append(pdfUrl).append(salesEngineer).append(seNotes).append(info).append(timeline).append(customerPersonality).append(legalEntity).append(startDate).append(projectManager).append(lastHealthReportDate).append(quote).append(calculator).append(gdriveUrl).append(trelloUrl).append(githubUrl).append(buildUrl).append(dropboxUrl).append(numberOfFeatures).append(maxStartDate).append(techStack).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return new EqualsBuilder().append(Id, rhs.Id).append(canonical, rhs.canonical).append(category, rhs.category).append(duration, rhs.duration).append(durationUnits, rhs.durationUnits).append(dollarAmount, rhs.dollarAmount).append(name, rhs.name).append(salesEngineerGuess, rhs.salesEngineerGuess).append(emailLater, rhs.emailLater).append(organizationSize, rhs.organizationSize).append(poster, rhs.poster).append(V, rhs.V).append(stale, rhs.stale).append(organization, rhs.organization).append(tracking, rhs.tracking).append(flags, rhs.flags).append(qualified, rhs.qualified).append(engaged, rhs.engaged).append(meta, rhs.meta).append(designPolish, rhs.designPolish).append(checkedForMissedChatEmail, rhs.checkedForMissedChatEmail).append(docs, rhs.docs).append(payMilestones, rhs.payMilestones).append(tags, rhs.tags).append(tools, rhs.tools).append(risks, rhs.risks).append(reviews, rhs.reviews).append(requiredTeamSize, rhs.requiredTeamSize).append(team, rhs.team).append(colleagues, rhs.colleagues).append(qualityReviews, rhs.qualityReviews).append(specReviews, rhs.specReviews).append(nps, rhs.nps).append(customerLike, rhs.customerLike).append(customerDislike, rhs.customerDislike).append(customerLikelyToRecommend, rhs.customerLikelyToRecommend).append(customerSatisfactions, rhs.customerSatisfactions).append(pmStatus, rhs.pmStatus).append(statusReached, rhs.statusReached).append(staleReason, rhs.staleReason).append(state, rhs.state).append(status, rhs.status).append(paymentMade, rhs.paymentMade).append(paymentReceived, rhs.paymentReceived).append(terms, rhs.terms).append(progressUpdates, rhs.progressUpdates).append(milestonesSpecification, rhs.milestonesSpecification).append(currentMilestoneIndex, rhs.currentMilestoneIndex).append(milestones, rhs.milestones).append(qualifiers, rhs.qualifiers).append(postDevTasks, rhs.postDevTasks).append(preDevTasks, rhs.preDevTasks).append(whiteboard, rhs.whiteboard).append(features, rhs.features).append(keyFeatures, rhs.keyFeatures).append(polishLevel, rhs.polishLevel).append(templates, rhs.templates).append(skills, rhs.skills).append(projectTypes, rhs.projectTypes).append(techs, rhs.techs).append(platforms, rhs.platforms).append(margin, rhs.margin).append(cost, rhs.cost).append(costingType, rhs.costingType).append(hoursEstimate, rhs.hoursEstimate).append(chatPrice, rhs.chatPrice).append(price, rhs.price).append(firstMessage, rhs.firstMessage).append(lastContactChannel, rhs.lastContactChannel).append(lastContactByGigster, rhs.lastContactByGigster).append(lastContactByClient, rhs.lastContactByClient).append(lastEmailBy, rhs.lastEmailBy).append(lastEmailTime, rhs.lastEmailTime).append(lastChatBy, rhs.lastChatBy).append(lastMissedChatEmailToPoc, rhs.lastMissedChatEmailToPoc).append(lastMissedChatEmailToClient, rhs.lastMissedChatEmailToClient).append(lastChatEmail, rhs.lastChatEmail).append(lastChatTime, rhs.lastChatTime).append(clientOwnsCode, rhs.clientOwnsCode).append(gigsterEsign, rhs.gigsterEsign).append(boughtNDA, rhs.boughtNDA).append(clientNDASign, rhs.clientNDASign).append(clientEsign, rhs.clientEsign).append(internalType, rhs.internalType).append(type, rhs.type).append(lastUpdate, rhs.lastUpdate).append(updated, rhs.updated).append(created, rhs.created).append(howDidTheCustomerFindUs, rhs.howDidTheCustomerFindUs).append(pdfUrl, rhs.pdfUrl).append(salesEngineer, rhs.salesEngineer).append(seNotes, rhs.seNotes).append(info, rhs.info).append(timeline, rhs.timeline).append(customerPersonality, rhs.customerPersonality).append(legalEntity, rhs.legalEntity).append(startDate, rhs.startDate).append(projectManager, rhs.projectManager).append(lastHealthReportDate, rhs.lastHealthReportDate).append(quote, rhs.quote).append(calculator, rhs.calculator).append(gdriveUrl, rhs.gdriveUrl).append(trelloUrl, rhs.trelloUrl).append(githubUrl, rhs.githubUrl).append(buildUrl, rhs.buildUrl).append(dropboxUrl, rhs.dropboxUrl).append(numberOfFeatures, rhs.numberOfFeatures).append(maxStartDate, rhs.maxStartDate).append(techStack, rhs.techStack).isEquals();
    }

    public int compareTo(Datum d){
        DateTime date1 = getLastChatTime();
        DateTime date2 = d.getLastChatTime();
        return date1.compareTo(date2);
    }
}
