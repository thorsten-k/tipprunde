
package org.tipprunde.model.xml.liga;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tipprunde.model.xml.ds.Openliga;


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
 *         &lt;element ref="{http://www.tipprunde.org/liga}updatePolicy"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga/datasource}openliga"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updatePolicy",
    "openliga"
})
@XmlRootElement(name = "dataSource")
public class DataSource
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected UpdatePolicy updatePolicy;
    @XmlElement(namespace = "http://www.tipprunde.org/liga/datasource", required = true)
    protected Openliga openliga;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "lastChange")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChange;

    /**
     * Gets the value of the updatePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePolicy }
     *     
     */
    public UpdatePolicy getUpdatePolicy() {
        return updatePolicy;
    }

    /**
     * Sets the value of the updatePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePolicy }
     *     
     */
    public void setUpdatePolicy(UpdatePolicy value) {
        this.updatePolicy = value;
    }

    public boolean isSetUpdatePolicy() {
        return (this.updatePolicy!= null);
    }

    /**
     * Gets the value of the openliga property.
     * 
     * @return
     *     possible object is
     *     {@link Openliga }
     *     
     */
    public Openliga getOpenliga() {
        return openliga;
    }

    /**
     * Sets the value of the openliga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Openliga }
     *     
     */
    public void setOpenliga(Openliga value) {
        this.openliga = value;
    }

    public boolean isSetOpenliga() {
        return (this.openliga!= null);
    }

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
     * Gets the value of the lastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChange() {
        return lastChange;
    }

    /**
     * Sets the value of the lastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChange(XMLGregorianCalendar value) {
        this.lastChange = value;
    }

    public boolean isSetLastChange() {
        return (this.lastChange!= null);
    }

}
