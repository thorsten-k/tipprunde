
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsEvent"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}round"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsMatch" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
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
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRank() {
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
    public void setRank(Integer value) {
        this.rank = value;
    }

}
