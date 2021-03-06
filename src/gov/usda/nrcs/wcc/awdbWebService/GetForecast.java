
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForecast"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stationTriplet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="forecastPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForecast", propOrder = {
    "stationTriplet",
    "elementCd",
    "forecastPeriod",
    "publicationDate"
})
public class GetForecast {

    @XmlElement(required = true)
    protected String stationTriplet;
    @XmlElement(required = true)
    protected String elementCd;
    @XmlElement(required = true)
    protected String forecastPeriod;
    @XmlElement(required = true)
    protected String publicationDate;

    /**
     * Gets the value of the stationTriplet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTriplet() {
        return stationTriplet;
    }

    /**
     * Sets the value of the stationTriplet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTriplet(String value) {
        this.stationTriplet = value;
    }

    /**
     * Gets the value of the elementCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementCd() {
        return elementCd;
    }

    /**
     * Sets the value of the elementCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementCd(String value) {
        this.elementCd = value;
    }

    /**
     * Gets the value of the forecastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Sets the value of the forecastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastPeriod(String value) {
        this.forecastPeriod = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

}
