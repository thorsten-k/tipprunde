
package org.tipprunde.model.xml.community;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jeesl.model.xml.io.cms.text.Remark;


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
 *         &lt;element ref="{http://www.tipprunde.org/community}participant"/&gt;
 *         &lt;element ref="{http://www.jeesl.org/text}remark"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="record" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="carryover" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="fee" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="paid" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="win" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="out" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="balance" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "participant",
    "remark"
})
@XmlRootElement(name = "bet")
public class Bet
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Participant participant;
    @XmlElement(namespace = "http://www.jeesl.org/text", required = true)
    protected Remark remark;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "record")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar record;
    @XmlAttribute(name = "carryover")
    protected Double carryover;
    @XmlAttribute(name = "fee")
    protected Double fee;
    @XmlAttribute(name = "paid")
    protected Double paid;
    @XmlAttribute(name = "win")
    protected Double win;
    @XmlAttribute(name = "out")
    protected Double out;
    @XmlAttribute(name = "balance")
    protected Double balance;

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link Participant }
     *     
     */
    public Participant getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participant }
     *     
     */
    public void setParticipant(Participant value) {
        this.participant = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link Remark }
     *     
     */
    public Remark getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remark }
     *     
     */
    public void setRemark(Remark value) {
        this.remark = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
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
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecord(XMLGregorianCalendar value) {
        this.record = value;
    }

    /**
     * Gets the value of the carryover property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCarryover() {
        return carryover;
    }

    /**
     * Sets the value of the carryover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCarryover(Double value) {
        this.carryover = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFee(Double value) {
        this.fee = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaid(Double value) {
        this.paid = value;
    }

    /**
     * Gets the value of the win property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWin() {
        return win;
    }

    /**
     * Sets the value of the win property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWin(Double value) {
        this.win = value;
    }

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOut(Double value) {
        this.out = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalance(Double value) {
        this.balance = value;
    }

}
