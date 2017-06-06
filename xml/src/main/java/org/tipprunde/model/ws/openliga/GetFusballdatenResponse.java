
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
 *         &lt;element name="GetFusballdatenResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfFussballdaten" minOccurs="0"/>
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
    "getFusballdatenResult"
})
@XmlRootElement(name = "GetFusballdatenResponse")
public class GetFusballdatenResponse {

    @XmlElement(name = "GetFusballdatenResult")
    protected ArrayOfFussballdaten getFusballdatenResult;

    /**
     * Gets the value of the getFusballdatenResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFussballdaten }
     *     
     */
    public ArrayOfFussballdaten getGetFusballdatenResult() {
        return getFusballdatenResult;
    }

    /**
     * Sets the value of the getFusballdatenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFussballdaten }
     *     
     */
    public void setGetFusballdatenResult(ArrayOfFussballdaten value) {
        this.getFusballdatenResult = value;
    }

}
