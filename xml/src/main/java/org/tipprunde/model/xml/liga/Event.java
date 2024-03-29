
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}discipline"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}dataSource"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}visible"/&gt;
 *         &lt;element ref="{http://www.tipprunde.org/liga}rounds"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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

}
