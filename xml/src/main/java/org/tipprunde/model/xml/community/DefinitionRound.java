
package org.tipprunde.model.xml.community;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tipprunde.model.xml.liga.Round;


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
 *         &lt;element ref="{http://www.tipprunde.org/community}definitionEvent"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}round"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "definitionEvent",
    "round"
})
@XmlRootElement(name = "definitionRound")
public class DefinitionRound
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected DefinitionEvent definitionEvent;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Round round;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "deadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadline;

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

    public boolean isSetDefinitionEvent() {
        return (this.definitionEvent!= null);
    }

    /**
     * Gets the value of the round property.
     * 
     * @return
     *     possible object is
     *     {@link Round }
     *     
     */
    public Round getRound() {
        return round;
    }

    /**
     * Sets the value of the round property.
     * 
     * @param value
     *     allowed object is
     *     {@link Round }
     *     
     */
    public void setRound(Round value) {
        this.round = value;
    }

    public boolean isSetRound() {
        return (this.round!= null);
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

    public boolean isSetId() {
        return (this.id!= null);
    }

    public void unsetId() {
        this.id = null;
    }

    /**
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadline(XMLGregorianCalendar value) {
        this.deadline = value;
    }

    public boolean isSetDeadline() {
        return (this.deadline!= null);
    }

}
