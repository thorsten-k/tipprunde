
package org.tipprunde.model.xml.community;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.exlp.model.xml.net.Urls;
import org.jeesl.interfaces.model.with.primitive.number.EjbWithId;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}participants"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}subscription"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}rules"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}definitionEvent"/&gt;
 *         &lt;element ref="{http://exlp.sf.net/net}urls"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "participants",
    "subscription",
    "rules",
    "definitionEvent",
    "urls"
})
@XmlRootElement(name = "community")
public class Community
    implements Serializable,EjbWithId
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Participants participants;
    @XmlElement(required = true)
    protected Subscription subscription;
    @XmlElement(required = true)
    protected Rules rules;
    @XmlElement(required = true)
    protected DefinitionEvent definitionEvent;
    @XmlElement(namespace = "http://exlp.sf.net/net", required = true)
    protected Urls urls;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link Participants }
     *     
     */
    public Participants getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participants }
     *     
     */
    public void setParticipants(Participants value) {
        this.participants = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link Rules }
     *     
     */
    public Rules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rules }
     *     
     */
    public void setRules(Rules value) {
        this.rules = value;
    }

    /**
     * Gets the value of the definitionEvent property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionEvent }
     *     
     */
    public DefinitionEvent getDefinitionEvent() {
        return definitionEvent;
    }

    /**
     * Sets the value of the definitionEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionEvent }
     *     
     */
    public void setDefinitionEvent(DefinitionEvent value) {
        this.definitionEvent = value;
    }

    /**
     * Gets the value of the urls property.
     * 
     * @return
     *     possible object is
     *     {@link Urls }
     *     
     */
    public Urls getUrls() {
        return urls;
    }

    /**
     * Sets the value of the urls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Urls }
     *     
     */
    public void setUrls(Urls value) {
        this.urls = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
