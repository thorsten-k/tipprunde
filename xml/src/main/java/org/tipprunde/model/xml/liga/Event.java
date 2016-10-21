
package org.tipprunde.model.xml.liga;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tipprunde.org/liga}discipline"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}dataSource"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}visible"/>
 *         &lt;element ref="{http://www.tipprunde.org/liga}rounds"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "discipline",
    "dataSource",
    "visible",
    "rounds"
})
@XmlRootElement(name = "event")
public class Event
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Discipline discipline;
    @XmlElement(required = true)
    protected DataSource dataSource;
    @XmlElement(required = true)
    protected Visible visible;
    @XmlElement(required = true)
    protected Rounds rounds;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the discipline property.
     * 
     * @return
     *     possible object is
     *     {@link Discipline }
     *     
     */
    public Discipline getDiscipline() {
        return discipline;
    }

    /**
     * Sets the value of the discipline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discipline }
     *     
     */
    public void setDiscipline(Discipline value) {
        this.discipline = value;
    }

    public boolean isSetDiscipline() {
        return (this.discipline!= null);
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
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Visible }
     *     
     */
    public Visible getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visible }
     *     
     */
    public void setVisible(Visible value) {
        this.visible = value;
    }

    public boolean isSetVisible() {
        return (this.visible!= null);
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

}
