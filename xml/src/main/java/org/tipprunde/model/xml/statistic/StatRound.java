
package org.tipprunde.model.xml.statistic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.tipprunde.org/liga}round"/>
 *         &lt;element ref="{http://www.tipprunde.org/stats}statMatch" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "round",
    "statMatch"
})
@XmlRootElement(name = "statRound")
public class StatRound
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Round round;
    @XmlElement(required = true)
    protected List<StatMatch> statMatch;

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
     * Gets the value of the statMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatMatch }
     * 
     * 
     */
    public List<StatMatch> getStatMatch() {
        if (statMatch == null) {
            statMatch = new ArrayList<StatMatch>();
        }
        return this.statMatch;
    }

    public boolean isSetStatMatch() {
        return ((this.statMatch!= null)&&(!this.statMatch.isEmpty()));
    }

    public void unsetStatMatch() {
        this.statMatch = null;
    }

}
