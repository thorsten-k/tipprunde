
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
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsRound"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}tipp" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}scoreDetails"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pointsRound",
    "tipp",
    "scoreDetails"
})
@XmlRootElement(name = "pointsMatch")
public class PointsMatch
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PointsRound pointsRound;
    @XmlElement(required = true)
    protected List<Tipp> tipp;
    @XmlElement(required = true)
    protected ScoreDetails scoreDetails;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "score")
    protected Integer score;

    /**
     * Gets the value of the pointsRound property.
     * 
     * @return
     *     possible object is
     *     {@link PointsRound }
     *     
     */
    public PointsRound getPointsRound() {
        return pointsRound;
    }

    /**
     * Sets the value of the pointsRound property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsRound }
     *     
     */
    public void setPointsRound(PointsRound value) {
        this.pointsRound = value;
    }

    public boolean isSetPointsRound() {
        return (this.pointsRound!= null);
    }

    /**
     * Gets the value of the tipp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tipp }
     * 
     * 
     */
    public List<Tipp> getTipp() {
        if (tipp == null) {
            tipp = new ArrayList<Tipp>();
        }
        return this.tipp;
    }

    public boolean isSetTipp() {
        return ((this.tipp!= null)&&(!this.tipp.isEmpty()));
    }

    public void unsetTipp() {
        this.tipp = null;
    }

    /**
     * Gets the value of the scoreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreDetails }
     *     
     */
    public ScoreDetails getScoreDetails() {
        return scoreDetails;
    }

    /**
     * Sets the value of the scoreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreDetails }
     *     
     */
    public void setScoreDetails(ScoreDetails value) {
        this.scoreDetails = value;
    }

    public boolean isSetScoreDetails() {
        return (this.scoreDetails!= null);
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

}
