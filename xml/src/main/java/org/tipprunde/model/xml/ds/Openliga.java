
package org.tipprunde.model.xml.ds;

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
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="refId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="saison" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shortcut" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="sport"/&gt;
 *             &lt;enumeration value="league"/&gt;
 *             &lt;enumeration value="group"/&gt;
 *             &lt;enumeration value="match"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "openliga")
public class Openliga
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "refId")
    protected Integer refId;
    @XmlAttribute(name = "saison")
    protected String saison;
    @XmlAttribute(name = "shortcut")
    protected String shortcut;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(long value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    public void unsetId() {
        this.id = null;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefId(int value) {
        this.refId = value;
    }

    public boolean isSetRefId() {
        return (this.refId!= null);
    }

    public void unsetRefId() {
        this.refId = null;
    }

    /**
     * Gets the value of the saison property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaison() {
        return saison;
    }

    /**
     * Sets the value of the saison property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaison(String value) {
        this.saison = value;
    }

    public boolean isSetSaison() {
        return (this.saison!= null);
    }

    /**
     * Gets the value of the shortcut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcut() {
        return shortcut;
    }

    /**
     * Sets the value of the shortcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcut(String value) {
        this.shortcut = value;
    }

    public boolean isSetShortcut() {
        return (this.shortcut!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

}
