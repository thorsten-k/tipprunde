
package org.tipprunde.model.xml.liga;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="scoreLeft" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="scoreRight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "result")
public class Result
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "scoreLeft")
    protected Integer scoreLeft;
    @XmlAttribute(name = "scoreRight")
    protected Integer scoreRight;

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
     * Gets the value of the scoreLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getScoreLeft() {
        return scoreLeft;
    }

    /**
     * Sets the value of the scoreLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreLeft(int value) {
        this.scoreLeft = value;
    }

    public boolean isSetScoreLeft() {
        return (this.scoreLeft!= null);
    }

    public void unsetScoreLeft() {
        this.scoreLeft = null;
    }

    /**
     * Gets the value of the scoreRight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getScoreRight() {
        return scoreRight;
    }

    /**
     * Sets the value of the scoreRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreRight(int value) {
        this.scoreRight = value;
    }

    public boolean isSetScoreRight() {
        return (this.scoreRight!= null);
    }

    public void unsetScoreRight() {
        this.scoreRight = null;
    }

}
