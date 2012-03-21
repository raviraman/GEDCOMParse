/**
 * 
 */
package com.main.gedcom.marshaller;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author Ravi
 * 
 */
public interface GedcomMarshaller {

	public Marshaller getMashaller(String instance) throws JAXBException;
		
	
}