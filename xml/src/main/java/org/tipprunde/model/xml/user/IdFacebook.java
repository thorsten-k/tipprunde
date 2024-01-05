
package org.tipprunde.model.xml.user;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="fbId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="appAuhtCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="expiresToken" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "idFacebook")
public class IdFacebook
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "fbId")
    protected String fbId;
    @XmlAttribute(name = "appAuhtCode")
    protected String appAuhtCode;
    @XmlAttribute(name = "accessToken")
    protected String accessToken;
    @XmlAttribute(name = "expiresToken")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiresToken;

    /**
     * Gets the value of the fbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbId() {
        return fbId;
    }

    /**
     * Sets the value of the fbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbId(String value) {
        this.fbId = value;
    }

    /**
     * Gets the value of the appAuhtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppAuhtCode() {
        return appAuhtCode;
    }

    /**
     * Sets the value of the appAuhtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppAuhtCode(String value) {
        this.appAuhtCode = value;
    }

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the expiresToken property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiresToken() {
        return expiresToken;
    }

    /**
     * Sets the value of the expiresToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiresToken(XMLGregorianCalendar value) {
        this.expiresToken = value;
    }

}
