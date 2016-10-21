
package org.tipprunde.model.xml.community;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tipprunde.model.xml.user.Identity;


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
 *         &lt;element ref="{http://www.tipprunde.org/community}community"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/user}identity"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}bet"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsEvent"/&gt;
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
    "community",
    "identity",
    "bet",
    "pointsEvent"
})
@XmlRootElement(name = "participant")
public class Participant
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Community community;
    @XmlElement(namespace = "http://www.tipprunde.org/user", required = true)
    protected Identity identity;
    @XmlElement(required = true)
    protected Bet bet;
    @XmlElement(required = true)
    protected PointsEvent pointsEvent;
    @XmlAttribute(name = "id")
    protected Long id;

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

    public boolean isSetCommunity() {
        return (this.community!= null);
    }

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
     * Gets the value of the bet property.
     * 
     * @return
     *     possible object is
     *     {@link Bet }
     *     
     */
    public Bet getBet() {
        return bet;
    }

    /**
     * Sets the value of the bet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bet }
     *     
     */
    public void setBet(Bet value) {
        this.bet = value;
    }

    public boolean isSetBet() {
        return (this.bet!= null);
    }

    /**
     * Gets the value of the pointsEvent property.
     * 
     * @return
     *     possible object is
     *     {@link PointsEvent }
     *     
     */
    public PointsEvent getPointsEvent() {
        return pointsEvent;
    }

    /**
     * Sets the value of the pointsEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsEvent }
     *     
     */
    public void setPointsEvent(PointsEvent value) {
        this.pointsEvent = value;
    }

    public boolean isSetPointsEvent() {
        return (this.pointsEvent!= null);
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

}
