
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

import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.user.Identity;

import net.sf.ahtutils.model.interfaces.with.EjbWithId;
import net.sf.ahtutils.xml.status.Status;


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
 *         &lt;element ref="{http://www.tipprunde.org/user}identity"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}match"/&gt;
 *         &lt;element ref="{http://ahtutils.aht-group.com/status}status"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="record" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="sync" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identity",
    "match",
    "status"
})
@XmlRootElement(name = "tipp")
public class Tipp
    implements Serializable,EjbWithId
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.tipprunde.org/user", required = true)
    protected Identity identity;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Match match;
    @XmlElement(namespace = "http://ahtutils.aht-group.com/status", required = true)
    protected Status status;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "left")
    protected Integer left;
    @XmlAttribute(name = "right")
    protected Integer right;
    @XmlAttribute(name = "record")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar record;
    @XmlAttribute(name = "deadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadline;
    @XmlAttribute(name = "sync")
    protected String sync;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link Identity }
     *     
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identity }
     *     
     */
    public void setIdentity(Identity value) {
        this.identity = value;
    }

    public boolean isSetIdentity() {
        return (this.identity!= null);
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link Match }
     *     
     */
    public Match getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link Match }
     *     
     */
    public void setMatch(Match value) {
        this.match = value;
    }

    public boolean isSetMatch() {
        return (this.match!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
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
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeft(int value) {
        this.left = value;
    }

    public boolean isSetLeft() {
        return (this.left!= null);
    }

    public void unsetLeft() {
        this.left = null;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRight(int value) {
        this.right = value;
    }

    public boolean isSetRight() {
        return (this.right!= null);
    }

    public void unsetRight() {
        this.right = null;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecord(XMLGregorianCalendar value) {
        this.record = value;
    }

    public boolean isSetRecord() {
        return (this.record!= null);
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

    /**
     * Gets the value of the sync property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSync() {
        return sync;
    }

    /**
     * Sets the value of the sync property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSync(String value) {
        this.sync = value;
    }

    public boolean isSetSync() {
        return (this.sync!= null);
    }

}
