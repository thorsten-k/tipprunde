
package org.tipprunde.model.xml.liga;

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
 *         &lt;element ref="{http://www.tipprunde.org/liga}opponent"/>
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
    "opponent"
})
@XmlRootElement(name = "left")
public class Left
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Opponent opponent;

    /**
     * Gets the value of the opponent property.
     * 
     * @return
     *     possible object is
     *     {@link Opponent }
     *     
     */
    public Opponent getOpponent() {
        return opponent;
    }

    /**
     * Sets the value of the opponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opponent }
     *     
     */
    public void setOpponent(Opponent value) {
        this.opponent = value;
    }

    public boolean isSetOpponent() {
        return (this.opponent!= null);
    }

}
