//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.20 at 01:47:17 AM IST 
//


package com.main.gedcom.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="surn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="givn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birth">
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
 *         &lt;element name="deat">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="occu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="famc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fams" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "indi", propOrder = {
    "name",
    "sex",
    "birth",
    "deat",
    "occu",
    "titl",
    "famc",
    "fams",
    "note",
    "chan"
})
public class Indi {

    @XmlElement(required = true)
    protected Indi.Name name;
    @XmlElement(required = true)
    protected String sex;
    @XmlElement(required = true)
    protected Indi.Birth birth;
    @XmlElement(required = true)
    protected Indi.Deat deat;
    @XmlElement(required = true)
    protected String occu;
    @XmlElement(required = true)
    protected String titl;
    @XmlElement(required = true)
    protected String famc;
    @XmlElement(required = true)
    protected String fams;
    @XmlElement(required = true)
    protected String note;
    @XmlElement(required = true)
    protected Indi.Chan chan;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Indi.Name }
     *     
     */
    public Indi.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indi.Name }
     *     
     */
    public void setName(Indi.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the birth property.
     * 
     * @return
     *     possible object is
     *     {@link Indi.Birth }
     *     
     */
    public Indi.Birth getBirth() {
        return birth;
    }

    /**
     * Sets the value of the birth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indi.Birth }
     *     
     */
    public void setBirth(Indi.Birth value) {
        this.birth = value;
    }

    /**
     * Gets the value of the deat property.
     * 
     * @return
     *     possible object is
     *     {@link Indi.Deat }
     *     
     */
    public Indi.Deat getDeat() {
        return deat;
    }

    /**
     * Sets the value of the deat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indi.Deat }
     *     
     */
    public void setDeat(Indi.Deat value) {
        this.deat = value;
    }

    /**
     * Gets the value of the occu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccu() {
        return occu;
    }

    /**
     * Sets the value of the occu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccu(String value) {
        this.occu = value;
    }

    /**
     * Gets the value of the titl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitl() {
        return titl;
    }

    /**
     * Sets the value of the titl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitl(String value) {
        this.titl = value;
    }

    /**
     * Gets the value of the famc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamc() {
        return famc;
    }

    /**
     * Sets the value of the famc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamc(String value) {
        this.famc = value;
    }

    /**
     * Gets the value of the fams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFams() {
        return fams;
    }

    /**
     * Sets the value of the fams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFams(String value) {
        this.fams = value;
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
     * Gets the value of the chan property.
     * 
     * @return
     *     possible object is
     *     {@link Indi.Chan }
     *     
     */
    public Indi.Chan getChan() {
        return chan;
    }

    /**
     * Sets the value of the chan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indi.Chan }
     *     
     */
    public void setChan(Indi.Chan value) {
        this.chan = value;
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
    public static class Birth {

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
        "date"
    })
    public static class Chan {

        @XmlElement(required = true)
        protected String date;

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
     *       &lt;/sequence>
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date"
    })
    public static class Deat {

        @XmlElement(required = true)
        protected String date;
        @XmlAttribute(required = true)
        protected String value;

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
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

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
     *         &lt;element name="surn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="givn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "surn",
        "givn"
    })
    public static class Name {

        @XmlElement(required = true)
        protected String surn;
        @XmlElement(required = true)
        protected String givn;
        @XmlAttribute(required = true)
        protected String value;

        /**
         * Gets the value of the surn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurn() {
            return surn;
        }

        /**
         * Sets the value of the surn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurn(String value) {
            this.surn = value;
        }

        /**
         * Gets the value of the givn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGivn() {
            return givn;
        }

        /**
         * Sets the value of the givn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGivn(String value) {
            this.givn = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
