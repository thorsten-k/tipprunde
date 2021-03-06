
package org.tipprunde.model.ws.openliga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pointsTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pointsTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchResult", propOrder = {
    "resultName",
    "pointsTeam1",
    "pointsTeam2",
    "resultOrderID",
    "resultTypeName",
    "resultTypeId"
})
public class MatchResult {

    protected String resultName;
    protected int pointsTeam1;
    protected int pointsTeam2;
    protected int resultOrderID;
    protected String resultTypeName;
    protected int resultTypeId;

    /**
     * Gets the value of the resultName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultName() {
        return resultName;
    }

    /**
     * Sets the value of the resultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultName(String value) {
        this.resultName = value;
    }

    /**
     * Gets the value of the pointsTeam1 property.
     * 
     */
    public int getPointsTeam1() {
        return pointsTeam1;
    }

    /**
     * Sets the value of the pointsTeam1 property.
     * 
     */
    public void setPointsTeam1(int value) {
        this.pointsTeam1 = value;
    }

    /**
     * Gets the value of the pointsTeam2 property.
     * 
     */
    public int getPointsTeam2() {
        return pointsTeam2;
    }

    /**
     * Sets the value of the pointsTeam2 property.
     * 
     */
    public void setPointsTeam2(int value) {
        this.pointsTeam2 = value;
    }

    /**
     * Gets the value of the resultOrderID property.
     * 
     */
    public int getResultOrderID() {
        return resultOrderID;
    }

    /**
     * Sets the value of the resultOrderID property.
     * 
     */
    public void setResultOrderID(int value) {
        this.resultOrderID = value;
    }

    /**
     * Gets the value of the resultTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultTypeName() {
        return resultTypeName;
    }

    /**
     * Sets the value of the resultTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultTypeName(String value) {
        this.resultTypeName = value;
    }

    /**
     * Gets the value of the resultTypeId property.
     * 
     */
    public int getResultTypeId() {
        return resultTypeId;
    }

    /**
     * Sets the value of the resultTypeId property.
     * 
     */
    public void setResultTypeId(int value) {
        this.resultTypeId = value;
    }

}
