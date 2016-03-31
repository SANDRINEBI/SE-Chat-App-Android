
package com.gigster.semessaging.gigs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated("org.jsonschema2pojo")
public class Template {

    private String template;
    private String example;
    private String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The template
     */
    public String getTemplate() {
        return template;
    }

    /**
     * 
     * @param template
     *     The template
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * 
     * @return
     *     The example
     */
    public String getExample() {
        return example;
    }

    /**
     * 
     * @param example
     *     The example
     */
    public void setExample(String example) {
        this.example = example;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(template).append(example).append(title).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Template) == false) {
            return false;
        }
        Template rhs = ((Template) other);
        return new EqualsBuilder().append(template, rhs.template).append(example, rhs.example).append(title, rhs.title).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
