
package org.tipprunde.model.xml.user;

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
 *         &lt;element ref="{http://www.tipprunde.org/user}idFacebook"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/user}idPassword"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/user}idEnterprise"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/user}user"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="emailVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idFacebook",
    "idPassword",
    "idEnterprise",
    "user"
})
@XmlRootElement(name = "identity")
public class Identity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected IdFacebook idFacebook;
    @XmlElement(required = true)
    protected IdPassword idPassword;
    @XmlElement(required = true)
    protected IdEnterprise idEnterprise;
    @XmlElement(required = true)
    protected User user;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "preferred")
    protected Boolean preferred;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "emailVerified")
    protected Boolean emailVerified;

    /**
     * Gets the value of the idFacebook property.
     * 
     * @return
     *     possible object is
     *     {@link IdFacebook }
     *     
     */
    public IdFacebook getIdFacebook() {
        return idFacebook;
    }

    /**
     * Sets the value of the idFacebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFacebook }
     *     
     */
    public void setIdFacebook(IdFacebook value) {
        this.idFacebook = value;
    }

    public boolean isSetIdFacebook() {
        return (this.idFacebook!= null);
    }

    /**
     * Gets the value of the idPassword property.
     * 
     * @return
     *     possible object is
     *     {@link IdPassword }
     *     
     */
    public IdPassword getIdPassword() {
        return idPassword;
    }

    /**
     * Sets the value of the idPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdPassword }
     *     
     */
    public void setIdPassword(IdPassword value) {
        this.idPassword = value;
    }

    public boolean isSetIdPassword() {
        return (this.idPassword!= null);
    }

    /**
     * Gets the value of the idEnterprise property.
     * 
     * @return
     *     possible object is
     *     {@link IdEnterprise }
     *     
     */
    public IdEnterprise getIdEnterprise() {
        return idEnterprise;
    }

    /**
     * Sets the value of the idEnterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEnterprise }
     *     
     */
    public void setIdEnterprise(IdEnterprise value) {
        this.idEnterprise = value;
    }

    public boolean isSetIdEnterprise() {
        return (this.idEnterprise!= null);
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    public boolean isSetUser() {
        return (this.user!= null);
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
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(boolean value) {
        this.preferred = value;
    }

    public boolean isSetPreferred() {
        return (this.preferred!= null);
    }

    public void unsetPreferred() {
        this.preferred = null;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    public boolean isSetEmail() {
        return (this.email!= null);
    }

    /**
     * Gets the value of the emailVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmailVerified() {
        return emailVerified;
    }

    /**
     * Sets the value of the emailVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailVerified(boolean value) {
        this.emailVerified = value;
    }

    public boolean isSetEmailVerified() {
        return (this.emailVerified!= null);
    }

    public void unsetEmailVerified() {
        this.emailVerified = null;
    }

}
