
package org.tipprunde.model.xml.tr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jeesl.model.xml.system.io.mail.Link;
import org.tipprunde.model.xml.community.Community;
import org.tipprunde.model.xml.community.DefinitionRound;
import org.tipprunde.model.xml.community.Participant;
import org.tipprunde.model.xml.community.Tipps;
import org.tipprunde.model.xml.liga.Discipline;
import org.tipprunde.model.xml.liga.Event;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Round;
import org.tipprunde.model.xml.statistic.UpdateWorker;
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
 *         &lt;element ref="{http://www.tipprunde.org/community}community" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}tipps" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}definitionRound" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}discipline" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}event" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}round" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}match" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/community}participant" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/user}identity" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/stats}updateWorker" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://ahtutils.aht-group.com/mail}link"/&gt;
 *       &lt;/sequence&gt;
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
    "tipps",
    "definitionRound",
    "discipline",
    "event",
    "round",
    "match",
    "participant",
    "identity",
    "updateWorker",
    "link"
})
@XmlRootElement(name = "tg")
public class Tg
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected List<Community> community;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected List<Tipps> tipps;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected List<DefinitionRound> definitionRound;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected List<Discipline> discipline;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected List<Event> event;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected List<Round> round;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected List<Match> match;
    @XmlElement(namespace = "http://www.tipprunde.org/community", required = true)
    protected List<Participant> participant;
    @XmlElement(namespace = "http://www.tipprunde.org/user", required = true)
    protected List<Identity> identity;
    @XmlElement(namespace = "http://www.tipprunde.org/stats", required = true)
    protected List<UpdateWorker> updateWorker;
    @XmlElement(namespace = "http://ahtutils.aht-group.com/mail", required = true)
    protected Link link;

    /**
     * Gets the value of the community property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the community property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Community }
     * 
     * 
     */
    public List<Community> getCommunity() {
        if (community == null) {
            community = new ArrayList<Community>();
        }
        return this.community;
    }

    public boolean isSetCommunity() {
        return ((this.community!= null)&&(!this.community.isEmpty()));
    }

    public void unsetCommunity() {
        this.community = null;
    }

    /**
     * Gets the value of the tipps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tipps }
     * 
     * 
     */
    public List<Tipps> getTipps() {
        if (tipps == null) {
            tipps = new ArrayList<Tipps>();
        }
        return this.tipps;
    }

    public boolean isSetTipps() {
        return ((this.tipps!= null)&&(!this.tipps.isEmpty()));
    }

    public void unsetTipps() {
        this.tipps = null;
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

    public boolean isSetDefinitionRound() {
        return ((this.definitionRound!= null)&&(!this.definitionRound.isEmpty()));
    }

    public void unsetDefinitionRound() {
        this.definitionRound = null;
    }

    /**
     * Gets the value of the discipline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discipline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscipline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discipline }
     * 
     * 
     */
    public List<Discipline> getDiscipline() {
        if (discipline == null) {
            discipline = new ArrayList<Discipline>();
        }
        return this.discipline;
    }

    public boolean isSetDiscipline() {
        return ((this.discipline!= null)&&(!this.discipline.isEmpty()));
    }

    public void unsetDiscipline() {
        this.discipline = null;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    public boolean isSetEvent() {
        return ((this.event!= null)&&(!this.event.isEmpty()));
    }

    public void unsetEvent() {
        this.event = null;
    }

    /**
     * Gets the value of the round property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the round property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Round }
     * 
     * 
     */
    public List<Round> getRound() {
        if (round == null) {
            round = new ArrayList<Round>();
        }
        return this.round;
    }

    public boolean isSetRound() {
        return ((this.round!= null)&&(!this.round.isEmpty()));
    }

    public void unsetRound() {
        this.round = null;
    }

    /**
     * Gets the value of the match property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the match property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Match }
     * 
     * 
     */
    public List<Match> getMatch() {
        if (match == null) {
            match = new ArrayList<Match>();
        }
        return this.match;
    }

    public boolean isSetMatch() {
        return ((this.match!= null)&&(!this.match.isEmpty()));
    }

    public void unsetMatch() {
        this.match = null;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Participant }
     * 
     * 
     */
    public List<Participant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<Participant>();
        }
        return this.participant;
    }

    public boolean isSetParticipant() {
        return ((this.participant!= null)&&(!this.participant.isEmpty()));
    }

    public void unsetParticipant() {
        this.participant = null;
    }

    /**
     * Gets the value of the identity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identity }
     * 
     * 
     */
    public List<Identity> getIdentity() {
        if (identity == null) {
            identity = new ArrayList<Identity>();
        }
        return this.identity;
    }

    public boolean isSetIdentity() {
        return ((this.identity!= null)&&(!this.identity.isEmpty()));
    }

    public void unsetIdentity() {
        this.identity = null;
    }

    /**
     * Gets the value of the updateWorker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateWorker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateWorker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateWorker }
     * 
     * 
     */
    public List<UpdateWorker> getUpdateWorker() {
        if (updateWorker == null) {
            updateWorker = new ArrayList<UpdateWorker>();
        }
        return this.updateWorker;
    }

    public boolean isSetUpdateWorker() {
        return ((this.updateWorker!= null)&&(!this.updateWorker.isEmpty()));
    }

    public void unsetUpdateWorker() {
        this.updateWorker = null;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setLink(Link value) {
        this.link = value;
    }

    public boolean isSetLink() {
        return (this.link!= null);
    }

}
