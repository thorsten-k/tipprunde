
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
 *         &lt;element name="GetAvailLeaguesBySportsResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfLeague" minOccurs="0"/>
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
    "getAvailLeaguesBySportsResult"
})
@XmlRootElement(name = "GetAvailLeaguesBySportsResponse")
public class GetAvailLeaguesBySportsResponse {

    @XmlElement(name = "GetAvailLeaguesBySportsResult")
    protected ArrayOfLeague getAvailLeaguesBySportsResult;

    /**
     * Gets the value of the getAvailLeaguesBySportsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeague }
     *     
     */
    public ArrayOfLeague getGetAvailLeaguesBySportsResult() {
        return getAvailLeaguesBySportsResult;
    }

    /**
     * Sets the value of the getAvailLeaguesBySportsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeague }
     *     
     */
    public void setGetAvailLeaguesBySportsResult(ArrayOfLeague value) {
        this.getAvailLeaguesBySportsResult = value;
    }

}
