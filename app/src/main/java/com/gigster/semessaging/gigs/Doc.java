
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Doc {

    private boolean isOpenDefault;
    private boolean isValid;
    private String type;
    private String subType;
    private String name;
    private String uploaderName;
    private boolean isCloseable;
    private String url;
    private IsOpenByUser isOpenByUser;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The isOpenDefault
     */
    public boolean isIsOpenDefault() {
        return isOpenDefault;
    }

    /**
     * 
     * @param isOpenDefault
     *     The isOpenDefault
     */
    public void setIsOpenDefault(boolean isOpenDefault) {
        this.isOpenDefault = isOpenDefault;
    }

    /**
     * 
     * @return
     *     The isValid
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * 
     * @param isValid
     *     The isValid
     */
    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
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
     *     The subType
     */
    public String getSubType() {
        return subType;
    }

    /**
     * 
     * @param subType
     *     The subType
     */
    public void setSubType(String subType) {
        this.subType = subType;
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
     *     The uploaderName
     */
    public String getUploaderName() {
        return uploaderName;
    }

    /**
     * 
     * @param uploaderName
     *     The uploaderName
     */
    public void setUploaderName(String uploaderName) {
        this.uploaderName = uploaderName;
    }

    /**
     * 
     * @return
     *     The isCloseable
     */
    public boolean isIsCloseable() {
        return isCloseable;
    }

    /**
     * 
     * @param isCloseable
     *     The isCloseable
     */
    public void setIsCloseable(boolean isCloseable) {
        this.isCloseable = isCloseable;
    }

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
     *     The isOpenByUser
     */
    public IsOpenByUser getIsOpenByUser() {
        return isOpenByUser;
    }

    /**
     * 
     * @param isOpenByUser
     *     The isOpenByUser
     */
    public void setIsOpenByUser(IsOpenByUser isOpenByUser) {
        this.isOpenByUser = isOpenByUser;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isOpenDefault).append(isValid).append(type).append(subType).append(name).append(uploaderName).append(isCloseable).append(url).append(isOpenByUser).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Doc) == false) {
            return false;
        }
        Doc rhs = ((Doc) other);
        return new EqualsBuilder().append(isOpenDefault, rhs.isOpenDefault).append(isValid, rhs.isValid).append(type, rhs.type).append(subType, rhs.subType).append(name, rhs.name).append(uploaderName, rhs.uploaderName).append(isCloseable, rhs.isCloseable).append(url, rhs.url).append(isOpenByUser, rhs.isOpenByUser).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
