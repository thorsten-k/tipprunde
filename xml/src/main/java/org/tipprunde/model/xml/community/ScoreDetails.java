
package org.tipprunde.model.xml.community;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="excact" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="difference" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="tendence" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "scoreDetails")
public class ScoreDetails
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "excact")
    protected Boolean excact;
    @XmlAttribute(name = "difference")
    protected Boolean difference;
    @XmlAttribute(name = "tendence")
    protected Boolean tendence;

    /**
     * Gets the value of the excact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcact() {
        return excact;
    }

    /**
     * Sets the value of the excact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcact(boolean value) {
        this.excact = value;
    }

    public boolean isSetExcact() {
        return (this.excact!= null);
    }

    public void unsetExcact() {
        this.excact = null;
    }

    /**
     * Gets the value of the difference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDifference() {
        return difference;
    }

    /**
     * Sets the value of the difference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDifference(boolean value) {
        this.difference = value;
    }

    public boolean isSetDifference() {
        return (this.difference!= null);
    }

    public void unsetDifference() {
        this.difference = null;
    }

    /**
     * Gets the value of the tendence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTendence() {
        return tendence;
    }

    /**
     * Sets the value of the tendence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTendence(boolean value) {
        this.tendence = value;
    }

    public boolean isSetTendence() {
        return (this.tendence!= null);
    }

    public void unsetTendence() {
        this.tendence = null;
    }

}
