
package org.tipprunde.model.xml.community;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tipprunde.model.xml.liga.Event;


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
 *         &lt;element ref="{http://www.tipprunde.org/community}deadlinePolicy"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}community"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}event"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}definitionRound" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deadlinePolicy",
    "community",
    "event",
    "definitionRound"
})
@XmlRootElement(name = "definitionEvent")
public class DefinitionEvent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected DeadlinePolicy deadlinePolicy;
    @XmlElement(required = true)
    protected Community community;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Event event;
    @XmlElement(required = true)
    protected List<DefinitionRound> definitionRound;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the deadlinePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DeadlinePolicy }
     *     
     */
    public DeadlinePolicy getDeadlinePolicy() {
        return deadlinePolicy;
    }

    /**
     * Sets the value of the deadlinePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlinePolicy }
     *     
     */
    public void setDeadlinePolicy(DeadlinePolicy value) {
        this.deadlinePolicy = value;
    }

    /**
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link Community }
     *     
     */
    public Community getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link Community }
     *     
     */
    public void setCommunity(Community value) {
        this.community = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the definitionRound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definitionRound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinitionRound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionRound }
     * 
     * 
     */
    public List<DefinitionRound> getDefinitionRound() {
        if (definitionRound == null) {
            definitionRound = new ArrayList<DefinitionRound>();
        }
        return this.definitionRound;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
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
    public void setId(Long value) {
        this.id = value;
    }

}
