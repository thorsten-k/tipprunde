
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tipprunde.org/liga}event"/>
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsRound" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "event",
    "pointsRound"
})
@XmlRootElement(name = "pointsEvent")
public class PointsEvent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Event event;
    @XmlElement(required = true)
    protected List<PointsRound> pointsRound;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "score")
    protected Integer score;
    @XmlAttribute(name = "rank")
    protected Integer rank;

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

    public boolean isSetEvent() {
        return (this.event!= null);
    }

    /**
     * Gets the value of the pointsRound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointsRound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointsRound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointsRound }
     * 
     * 
     */
    public List<PointsRound> getPointsRound() {
        if (pointsRound == null) {
            pointsRound = new ArrayList<PointsRound>();
        }
        return this.pointsRound;
    }

    public boolean isSetPointsRound() {
        return ((this.pointsRound!= null)&&(!this.pointsRound.isEmpty()));
    }

    public void unsetPointsRound() {
        this.pointsRound = null;
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
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(int value) {
        this.score = value;
    }

    public boolean isSetScore() {
        return (this.score!= null);
    }

    public void unsetScore() {
        this.score = null;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRank(int value) {
        this.rank = value;
    }

    public boolean isSetRank() {
        return (this.rank!= null);
    }

    public void unsetRank() {
        this.rank = null;
    }

}
