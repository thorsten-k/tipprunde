
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
 *         &lt;element name="GetGoalGettersByLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfGoalGetter" minOccurs="0"/>
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
    "getGoalGettersByLeagueSaisonResult"
})
@XmlRootElement(name = "GetGoalGettersByLeagueSaisonResponse")
public class GetGoalGettersByLeagueSaisonResponse {

    @XmlElement(name = "GetGoalGettersByLeagueSaisonResult")
    protected ArrayOfGoalGetter getGoalGettersByLeagueSaisonResult;

    /**
     * Gets the value of the getGoalGettersByLeagueSaisonResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoalGetter }
     *     
     */
    public ArrayOfGoalGetter getGetGoalGettersByLeagueSaisonResult() {
        return getGoalGettersByLeagueSaisonResult;
    }

    /**
     * Sets the value of the getGoalGettersByLeagueSaisonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoalGetter }
     *     
     */
    public void setGetGoalGettersByLeagueSaisonResult(ArrayOfGoalGetter value) {
        this.getGoalGettersByLeagueSaisonResult = value;
    }

}
