
package org.tipprunde.model.xml.community;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.tipprunde.org/community}tipp" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipp"
})
@XmlRootElement(name = "tipps")
public class Tipps
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<Tipp> tipp;

    /**
     * Gets the value of the tipp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tipp }
     * 
     * 
     */
    public List<Tipp> getTipp() {
        if (tipp == null) {
            tipp = new ArrayList<Tipp>();
        }
        return this.tipp;
    }

    public boolean isSetTipp() {
        return ((this.tipp!= null)&&(!this.tipp.isEmpty()));
    }

    public void unsetTipp() {
        this.tipp = null;
    }

}
