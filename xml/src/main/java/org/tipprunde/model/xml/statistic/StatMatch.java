
package org.tipprunde.model.xml.statistic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tipprunde.model.xml.liga.Match;


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
 *         &lt;element ref="{http://www.tipprunde.org/liga}match"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/stats}statTipp" maxOccurs="unbounded"/&gt;
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
    "match",
    "statTipp"
})
@XmlRootElement(name = "statMatch")
public class StatMatch
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.tipprunde.org/liga", required = true)
    protected Match match;
    @XmlElement(required = true)
    protected List<StatTipp> statTipp;

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
     * Gets the value of the statTipp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statTipp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatTipp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatTipp }
     * 
     * 
     */
    public List<StatTipp> getStatTipp() {
        if (statTipp == null) {
            statTipp = new ArrayList<StatTipp>();
        }
        return this.statTipp;
    }

}
