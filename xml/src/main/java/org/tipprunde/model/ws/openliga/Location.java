
package org.tipprunde.model.ws.openliga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationStadium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "locationID",
    "locationCity",
    "locationStadium"
})
public class Location {

    protected int locationID;
    protected String locationCity;
    protected String locationStadium;

    /**
     * Gets the value of the locationID property.
     * 
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(int value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the locationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCity() {
        return locationCity;
    }

    /**
     * Sets the value of the locationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCity(String value) {
        this.locationCity = value;
    }

    /**
     * Gets the value of the locationStadium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationStadium() {
        return locationStadium;
    }

    /**
     * Sets the value of the locationStadium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationStadium(String value) {
        this.locationStadium = value;
    }

}
