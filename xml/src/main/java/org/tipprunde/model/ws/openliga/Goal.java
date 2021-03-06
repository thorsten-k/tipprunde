
package org.tipprunde.model.ws.openliga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goalID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalMachID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalScoreTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalScoreTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalMatchMinute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalGetterID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalGetterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalPenalty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="goalOwnGoal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="goalOvertime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="goalComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goal", propOrder = {
    "goalID",
    "goalMachID",
    "goalScoreTeam1",
    "goalScoreTeam2",
    "goalMatchMinute",
    "goalGetterID",
    "goalGetterName",
    "goalPenalty",
    "goalOwnGoal",
    "goalOvertime",
    "goalComment"
})
public class Goal {

    protected int goalID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalMachID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalScoreTeam1;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalScoreTeam2;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalMatchMinute;
    protected int goalGetterID;
    protected String goalGetterName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean goalPenalty;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean goalOwnGoal;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean goalOvertime;
    protected String goalComment;

    /**
     * Gets the value of the goalID property.
     * 
     */
    public int getGoalID() {
        return goalID;
    }

    /**
     * Sets the value of the goalID property.
     * 
     */
    public void setGoalID(int value) {
        this.goalID = value;
    }

    /**
     * Gets the value of the goalMachID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalMachID() {
        return goalMachID;
    }

    /**
     * Sets the value of the goalMachID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalMachID(Integer value) {
        this.goalMachID = value;
    }

    /**
     * Gets the value of the goalScoreTeam1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalScoreTeam1() {
        return goalScoreTeam1;
    }

    /**
     * Sets the value of the goalScoreTeam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalScoreTeam1(Integer value) {
        this.goalScoreTeam1 = value;
    }

    /**
     * Gets the value of the goalScoreTeam2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalScoreTeam2() {
        return goalScoreTeam2;
    }

    /**
     * Sets the value of the goalScoreTeam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalScoreTeam2(Integer value) {
        this.goalScoreTeam2 = value;
    }

    /**
     * Gets the value of the goalMatchMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalMatchMinute() {
        return goalMatchMinute;
    }

    /**
     * Sets the value of the goalMatchMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalMatchMinute(Integer value) {
        this.goalMatchMinute = value;
    }

    /**
     * Gets the value of the goalGetterID property.
     * 
     */
    public int getGoalGetterID() {
        return goalGetterID;
    }

    /**
     * Sets the value of the goalGetterID property.
     * 
     */
    public void setGoalGetterID(int value) {
        this.goalGetterID = value;
    }

    /**
     * Gets the value of the goalGetterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalGetterName() {
        return goalGetterName;
    }

    /**
     * Sets the value of the goalGetterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalGetterName(String value) {
        this.goalGetterName = value;
    }

    /**
     * Gets the value of the goalPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoalPenalty() {
        return goalPenalty;
    }

    /**
     * Sets the value of the goalPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoalPenalty(Boolean value) {
        this.goalPenalty = value;
    }

    /**
     * Gets the value of the goalOwnGoal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoalOwnGoal() {
        return goalOwnGoal;
    }

    /**
     * Sets the value of the goalOwnGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoalOwnGoal(Boolean value) {
        this.goalOwnGoal = value;
    }

    /**
     * Gets the value of the goalOvertime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoalOvertime() {
        return goalOvertime;
    }

    /**
     * Sets the value of the goalOvertime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoalOvertime(Boolean value) {
        this.goalOvertime = value;
    }

    /**
     * Gets the value of the goalComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalComment() {
        return goalComment;
    }

    /**
     * Sets the value of the goalComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalComment(String value) {
        this.goalComment = value;
    }

}
