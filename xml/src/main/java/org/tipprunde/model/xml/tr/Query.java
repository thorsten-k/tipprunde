
package org.tipprunde.model.xml.tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tipprunde.model.xml.community.Bet;
import org.tipprunde.model.xml.community.Community;
import org.tipprunde.model.xml.community.DefinitionEvent;
import org.tipprunde.model.xml.community.DefinitionRound;
import org.tipprunde.model.xml.community.Participant;
import org.tipprunde.model.xml.community.PointsEvent;
import org.tipprunde.model.xml.community.PointsMatch;
import org.tipprunde.model.xml.community.PointsRound;
import org.tipprunde.model.xml.community.Tipp;
import org.tipprunde.model.xml.ds.Openliga;
import org.tipprunde.model.xml.liga.DataSource;
import org.tipprunde.model.xml.liga.Discipline;
import org.tipprunde.model.xml.liga.Event;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.model.xml.liga.Result;
import org.tipprunde.model.xml.liga.Round;
import org.tipprunde.model.xml.liga.Visible;
import org.tipprunde.model.xml.user.Identity;
import org.tipprunde.model.xml.user.User;


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
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsEvent"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsRound"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}pointsMatch"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}definitionEvent"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}definitionRound"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}participant"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}bet"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}tipp"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}discipline"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}event"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}round"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}match"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}result"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}visible"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}opponent"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}dataSource"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga/datasource}openliga"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/user}user"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/user}identity"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "pointsEvent",
    "pointsRound",
    "pointsMatch",
    "definitionEvent",
    "definitionRound",
    "participant",
    "bet",
    "tipp",
    "discipline",
    "event",
    "round",
    "match",
    "result",
    "visible",
    "opponent",
    "dataSource",
    "openliga",
    "user",
    "identity"
})
@XmlRootElement(name = "query")
public class Query
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected Community community;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected PointsEvent pointsEvent;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected PointsRound pointsRound;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected PointsMatch pointsMatch;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected DefinitionEvent definitionEvent;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected DefinitionRound definitionRound;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected Participant participant;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected Bet bet;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected Tipp tipp;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Discipline discipline;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Event event;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Round round;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Match match;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Result result;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Visible visible;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Opponent opponent;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected DataSource dataSource;
    @XmlElement(namespace = "http://www.tipprunde.org/liga/datasource", required = true)
    protected Openliga openliga;
    @XmlElement(namespace = "http://www.tipprunde.org/user", required = true)
    protected User user;
    @XmlElement(namespace = "http://www.tipprunde.org/user", required = true)
    protected Identity identity;
    @XmlAttribute(name = "lang")
    protected String lang;

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

    /**
     * Gets the value of the pointsMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PointsMatch }
     *     
     */
    public PointsMatch getPointsMatch() {
        return pointsMatch;
    }

    /**
     * Sets the value of the pointsMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsMatch }
     *     
     */
    public void setPointsMatch(PointsMatch value) {
        this.pointsMatch = value;
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
     * Gets the value of the definitionRound property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionRound }
     *     
     */
    public DefinitionRound getDefinitionRound() {
        return definitionRound;
    }

    /**
     * Sets the value of the definitionRound property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionRound }
     *     
     */
    public void setDefinitionRound(DefinitionRound value) {
        this.definitionRound = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link Participant }
     *     
     */
    public Participant getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participant }
     *     
     */
    public void setParticipant(Participant value) {
        this.participant = value;
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

    /**
     * Gets the value of the tipp property.
     * 
     * @return
     *     possible object is
     *     {@link Tipp }
     *     
     */
    public Tipp getTipp() {
        return tipp;
    }

    /**
     * Sets the value of the tipp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipp }
     *     
     */
    public void setTipp(Tipp value) {
        this.tipp = value;
    }

    /**
     * Gets the value of the discipline property.
     * 
     * @return
     *     possible object is
     *     {@link Discipline }
     *     
     */
    public Discipline getDiscipline() {
        return discipline;
    }

    /**
     * Sets the value of the discipline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discipline }
     *     
     */
    public void setDiscipline(Discipline value) {
        this.discipline = value;
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

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Visible }
     *     
     */
    public Visible getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visible }
     *     
     */
    public void setVisible(Visible value) {
        this.visible = value;
    }

    /**
     * Gets the value of the opponent property.
     * 
     * @return
     *     possible object is
     *     {@link Opponent }
     *     
     */
    public Opponent getOpponent() {
        return opponent;
    }

    /**
     * Sets the value of the opponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opponent }
     *     
     */
    public void setOpponent(Opponent value) {
        this.opponent = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link DataSource }
     *     
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSource }
     *     
     */
    public void setDataSource(DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the openliga property.
     * 
     * @return
     *     possible object is
     *     {@link Openliga }
     *     
     */
    public Openliga getOpenliga() {
        return openliga;
    }

    /**
     * Sets the value of the openliga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Openliga }
     *     
     */
    public void setOpenliga(Openliga value) {
        this.openliga = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
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

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
