
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
 *         &lt;element name="GetMatchdataByGroupLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfMatchdata" minOccurs="0"/>
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
    "getMatchdataByGroupLeagueSaisonResult"
})
@XmlRootElement(name = "GetMatchdataByGroupLeagueSaisonResponse")
public class GetMatchdataByGroupLeagueSaisonResponse {

    @XmlElement(name = "GetMatchdataByGroupLeagueSaisonResult")
    protected ArrayOfMatchdata getMatchdataByGroupLeagueSaisonResult;

    /**
     * Gets the value of the getMatchdataByGroupLeagueSaisonResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchdata }
     *     
     */
    public ArrayOfMatchdata getGetMatchdataByGroupLeagueSaisonResult() {
        return getMatchdataByGroupLeagueSaisonResult;
    }

    /**
     * Sets the value of the getMatchdataByGroupLeagueSaisonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchdata }
     *     
     */
    public void setGetMatchdataByGroupLeagueSaisonResult(ArrayOfMatchdata value) {
        this.getMatchdataByGroupLeagueSaisonResult = value;
    }

}
