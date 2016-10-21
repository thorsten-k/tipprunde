
package org.tipprunde.model.xml.tr;

import java.io.Serializable;
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
 *         &lt;element ref="{http://www.tipprunde.org}tg"/>
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
    "tg"
})
@XmlRootElement(name = "report")
public class Report
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Tg tg;

    /**
     * Gets the value of the tg property.
     * 
     * @return
     *     possible object is
     *     {@link Tg }
     *     
     */
    public Tg getTg() {
        return tg;
    }

    /**
     * Sets the value of the tg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tg }
     *     
     */
    public void setTg(Tg value) {
        this.tg = value;
    }

    public boolean isSetTg() {
        return (this.tg!= null);
    }

}
