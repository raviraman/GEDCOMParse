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
 *         &lt;element name="indi" type="{http://www.example.org/GEDCOMSchema}indi" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fam" type="{http://www.example.org/GEDCOMSchema}fam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.example.org/GEDCOMSchema}note" maxOccurs="unbounded" minOccurs="0"/>
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
    "indi",
    "fam",
    "note"
})
@XmlRootElement(name = "gedcom")
public class Gedcom {

    protected List<Indi> indi;
    protected List<Fam> fam;
    protected List<Note> note;

    /**
     * Gets the value of the indi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Indi }
     * 
     * 
     */
    public List<Indi> getIndi() {
        if (indi == null) {
            indi = new ArrayList<Indi>();
        }
        return this.indi;
    }

    /**
     * Gets the value of the fam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fam }
     * 
     * 
     */
    public List<Fam> getFam() {
        if (fam == null) {
            fam = new ArrayList<Fam>();
        }
        return this.fam;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

}