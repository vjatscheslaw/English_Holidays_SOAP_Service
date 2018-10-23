
package com.holidaywebservice.holidayservice_v2;

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
 *         &lt;element name="GetHolidaysForDateRangeResult" type="{http://www.holidaywebservice.com/HolidayService_v2/}ArrayOfHoliday" minOccurs="0"/>
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
    "getHolidaysForDateRangeResult"
})
@XmlRootElement(name = "GetHolidaysForDateRangeResponse")
public class GetHolidaysForDateRangeResponse {

    @XmlElement(name = "GetHolidaysForDateRangeResult")
    protected ArrayOfHoliday getHolidaysForDateRangeResult;

    /**
     * Gets the value of the getHolidaysForDateRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHoliday }
     *     
     */
    public ArrayOfHoliday getGetHolidaysForDateRangeResult() {
        return getHolidaysForDateRangeResult;
    }

    /**
     * Sets the value of the getHolidaysForDateRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHoliday }
     *     
     */
    public void setGetHolidaysForDateRangeResult(ArrayOfHoliday value) {
        this.getHolidaysForDateRangeResult = value;
    }

}
