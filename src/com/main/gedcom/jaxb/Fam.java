//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.20 at 01:47:17 AM IST 
//


package com.main.gedcom.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="husb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wife" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="plac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="chil" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fam", propOrder = {
    "husb",
    "wife",
    "marr",
    "chil",
    "note"
})
public class Fam {

    @XmlElement(required = true)
    protected String husb;
    @XmlElement(required = true)
    protected String wife;
    @XmlElement(required = true)
    protected Fam.Marr marr;
    protected List<String> chil;
    @XmlElement(required = true)
    protected String note;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Gets the value of the husb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusb() {
        return husb;
    }

    /**
     * Sets the value of the husb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusb(String value) {
        this.husb = value;
    }

    /**
     * Gets the value of the wife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWife() {
        return wife;
    }

    /**
     * Sets the value of the wife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWife(String value) {
        this.wife = value;
    }

    /**
     * Gets the value of the marr property.
     * 
     * @return
     *     possible object is
     *     {@link Fam.Marr }
     *     
     */
    public Fam.Marr getMarr() {
        return marr;
    }

    /**
     * Sets the value of the marr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fam.Marr }
     *     
     */
    public void setMarr(Fam.Marr value) {
        this.marr = value;
    }

    /**
     * Gets the value of the chil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChil() {
        if (chil == null) {
            chil = new ArrayList<String>();
        }
        return this.chil;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="plac" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "date",
        "plac"
    })
    public static class Marr {

        @XmlElement(required = true)
        protected String date;
        @XmlElement(required = true)
        protected String plac;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the plac property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlac() {
            return plac;
        }

        /**
         * Sets the value of the plac property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlac(String value) {
            this.plac = value;
        }

    }

}
