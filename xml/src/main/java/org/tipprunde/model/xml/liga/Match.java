
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
 *         &lt;element ref="{http://www.tipprunde.org/liga}rounds"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}dataSource"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}location"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}result"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}left"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}right"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ongoing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="kickOff" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rounds",
    "dataSource",
    "location",
    "result",
    "left",
    "right"
})
@XmlRootElement(name = "match")
public class Match
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Rounds rounds;
    @XmlElement(required = true)
    protected DataSource dataSource;
    @XmlElement(required = true)
    protected Location location;
    @XmlElement(required = true)
    protected Result result;
    @XmlElement(required = true)
    protected Left left;
    @XmlElement(required = true)
    protected Right right;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "finished")
    protected Boolean finished;
    @XmlAttribute(name = "ongoing")
    protected Boolean ongoing;
    @XmlAttribute(name = "kickOff")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kickOff;

    /**
     * Gets the value of the rounds property.
     * 
     * @return
     *     possible object is
     *     {@link Rounds }
     *     
     */
    public Rounds getRounds() {
        return rounds;
    }

    /**
     * Sets the value of the rounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounds }
     *     
     */
    public void setRounds(Rounds value) {
        this.rounds = value;
    }

    public boolean isSetRounds() {
        return (this.rounds!= null);
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link DataSource }
     *     
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSource }
     *     
     */
    public void setDataSource(DataSource value) {
        this.dataSource = value;
    }

    public boolean isSetDataSource() {
        return (this.dataSource!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    public boolean isSetResult() {
        return (this.result!= null);
    }

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Left }
     *     
     */
    public Left getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Left }
     *     
     */
    public void setLeft(Left value) {
        this.left = value;
    }

    public boolean isSetLeft() {
        return (this.left!= null);
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Right }
     *     
     */
    public Right getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Right }
     *     
     */
    public void setRight(Right value) {
        this.right = value;
    }

    public boolean isSetRight() {
        return (this.right!= null);
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
     * Gets the value of the finished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Sets the value of the finished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

    public boolean isSetFinished() {
        return (this.finished!= null);
    }

    public void unsetFinished() {
        this.finished = null;
    }

    /**
     * Gets the value of the ongoing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOngoing() {
        return ongoing;
    }

    /**
     * Sets the value of the ongoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOngoing(boolean value) {
        this.ongoing = value;
    }

    public boolean isSetOngoing() {
        return (this.ongoing!= null);
    }

    public void unsetOngoing() {
        this.ongoing = null;
    }

    /**
     * Gets the value of the kickOff property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKickOff() {
        return kickOff;
    }

    /**
     * Sets the value of the kickOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKickOff(XMLGregorianCalendar value) {
        this.kickOff = value;
    }

    public boolean isSetKickOff() {
        return (this.kickOff!= null);
    }

}
