
package org.tipprunde.model.xml.tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.jeesl.org/io/mail}mail"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org}tg"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mail",
    "tg"
})
@XmlRootElement(name = "mail")
public class Mail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.jeesl.org/io/mail", required = true)
    protected org.jeesl.model.xml.system.io.mail.Mail mail;
    @XmlElement(required = true)
    protected Tg tg;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link org.jeesl.model.xml.system.io.mail.Mail }
     *     
     */
    public org.jeesl.model.xml.system.io.mail.Mail getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.jeesl.model.xml.system.io.mail.Mail }
     *     
     */
    public void setMail(org.jeesl.model.xml.system.io.mail.Mail value) {
        this.mail = value;
    }

    public boolean isSetMail() {
        return (this.mail!= null);
    }

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

}
