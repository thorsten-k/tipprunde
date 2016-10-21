
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
import org.tipprunde.model.xml.liga.Round;


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
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsEvent"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}round"/>
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsMatch" maxOccurs="unbounded"/>
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
    "pointsEvent",
    "round",
    "pointsMatch"
})
@XmlRootElement(name = "pointsRound")
public class PointsRound
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PointsEvent pointsEvent;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Round round;
    @XmlElement(required = true)
    protected List<PointsMatch> pointsMatch;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "score")
    protected Integer score;
    @XmlAttribute(name = "rank")
    protected Integer rank;

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
     * Gets the value of the pointsMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointsMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointsMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointsMatch }
     * 
     * 
     */
    public List<PointsMatch> getPointsMatch() {
        if (pointsMatch == null) {
            pointsMatch = new ArrayList<PointsMatch>();
        }
        return this.pointsMatch;
    }

    public boolean isSetPointsMatch() {
        return ((this.pointsMatch!= null)&&(!this.pointsMatch.isEmpty()));
    }

    public void unsetPointsMatch() {
        this.pointsMatch = null;
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
