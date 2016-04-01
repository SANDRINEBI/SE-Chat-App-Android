
package com.gigster.semessaging.gigs;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Doc {

    @SerializedName("isOpenDefault")
    @Expose
    private boolean isOpenDefault;
    @SerializedName("isValid")
    @Expose
    private String isValid;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("subType")
    @Expose
    private String subType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("uploaderName")
    @Expose
    private String uploaderName;
    @SerializedName("isCloseable")
    @Expose
    private boolean isCloseable;

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
    public String getIsValid() {
        return isValid;
    }

    /**
     * 
     * @param isValid
     *     The isValid
     */
    public void setIsValid(String isValid) {
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isOpenDefault).append(isValid).append(type).append(subType).append(name).append(uploaderName).append(isCloseable).toHashCode();
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
        return new EqualsBuilder().append(isOpenDefault, rhs.isOpenDefault).append(isValid, rhs.isValid).append(type, rhs.type).append(subType, rhs.subType).append(name, rhs.name).append(uploaderName, rhs.uploaderName).append(isCloseable, rhs.isCloseable).isEquals();
    }

}
