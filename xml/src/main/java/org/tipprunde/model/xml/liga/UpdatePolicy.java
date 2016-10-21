
package org.tipprunde.model.xml.liga;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="never"/>
 *             &lt;enumeration value="once"/>
 *             &lt;enumeration value="regulary"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="updateLast" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="updateNext" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="updateQueue" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "updatePolicy")
public class UpdatePolicy
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "updateLast")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateLast;
    @XmlAttribute(name = "updateNext")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateNext;
    @XmlAttribute(name = "updateQueue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateQueue;

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

    /**
     * Gets the value of the updateLast property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateLast() {
        return updateLast;
    }

    /**
     * Sets the value of the updateLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateLast(XMLGregorianCalendar value) {
        this.updateLast = value;
    }

    public boolean isSetUpdateLast() {
        return (this.updateLast!= null);
    }

    /**
     * Gets the value of the updateNext property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateNext() {
        return updateNext;
    }

    /**
     * Sets the value of the updateNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateNext(XMLGregorianCalendar value) {
        this.updateNext = value;
    }

    public boolean isSetUpdateNext() {
        return (this.updateNext!= null);
    }

    /**
     * Gets the value of the updateQueue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateQueue() {
        return updateQueue;
    }

    /**
     * Sets the value of the updateQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateQueue(XMLGregorianCalendar value) {
        this.updateQueue = value;
    }

    public boolean isSetUpdateQueue() {
        return (this.updateQueue!= null);
    }

}
