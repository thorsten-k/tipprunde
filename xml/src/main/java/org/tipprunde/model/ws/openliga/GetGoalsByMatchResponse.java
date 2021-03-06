
package org.tipprunde.model.ws.openliga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetGoalsByMatchResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfGoal" minOccurs="0"/>
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
    "getGoalsByMatchResult"
})
@XmlRootElement(name = "GetGoalsByMatchResponse")
public class GetGoalsByMatchResponse {

    @XmlElement(name = "GetGoalsByMatchResult")
    protected ArrayOfGoal getGoalsByMatchResult;

    /**
     * Gets the value of the getGoalsByMatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoal }
     *     
     */
    public ArrayOfGoal getGetGoalsByMatchResult() {
        return getGoalsByMatchResult;
    }

    /**
     * Sets the value of the getGoalsByMatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoal }
     *     
     */
    public void setGetGoalsByMatchResult(ArrayOfGoal value) {
        this.getGoalsByMatchResult = value;
    }

}
