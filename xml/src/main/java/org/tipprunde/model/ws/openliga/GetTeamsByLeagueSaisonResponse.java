
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
 *         &lt;element name="GetTeamsByLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfTeam" minOccurs="0"/>
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
    "getTeamsByLeagueSaisonResult"
})
@XmlRootElement(name = "GetTeamsByLeagueSaisonResponse")
public class GetTeamsByLeagueSaisonResponse {

    @XmlElement(name = "GetTeamsByLeagueSaisonResult")
    protected ArrayOfTeam getTeamsByLeagueSaisonResult;

    /**
     * Gets the value of the getTeamsByLeagueSaisonResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTeam }
     *     
     */
    public ArrayOfTeam getGetTeamsByLeagueSaisonResult() {
        return getTeamsByLeagueSaisonResult;
    }

    /**
     * Sets the value of the getTeamsByLeagueSaisonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTeam }
     *     
     */
    public void setGetTeamsByLeagueSaisonResult(ArrayOfTeam value) {
        this.getTeamsByLeagueSaisonResult = value;
    }

}
