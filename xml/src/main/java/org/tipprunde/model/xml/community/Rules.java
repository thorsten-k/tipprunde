
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="excact" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="difference" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tendence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "rules")
public class Rules
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "excact")
    protected Integer excact;
    @XmlAttribute(name = "difference")
    protected Integer difference;
    @XmlAttribute(name = "tendence")
    protected Integer tendence;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(int value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    public void unsetId() {
        this.id = null;
    }

    /**
     * Gets the value of the excact property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getExcact() {
        return excact;
    }

    /**
     * Sets the value of the excact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcact(int value) {
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
     *     {@link Integer }
     *     
     */
    public int getDifference() {
        return difference;
    }

    /**
     * Sets the value of the difference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDifference(int value) {
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
     *     {@link Integer }
     *     
     */
    public int getTendence() {
        return tendence;
    }

    /**
     * Sets the value of the tendence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTendence(int value) {
        this.tendence = value;
    }

    public boolean isSetTendence() {
        return (this.tendence!= null);
    }

    public void unsetTendence() {
        this.tendence = null;
    }

}
