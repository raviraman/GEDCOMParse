package com.main.gedcom.marshaller.impl;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.main.gedcom.marshaller.GedcomMarshaller;

public class GedcomMarshallerImpl implements GedcomMarshaller {

	@Override
	public Marshaller getMashaller(String instance) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(instance);
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		return m;
	}

}
