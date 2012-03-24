package com.main.gedcom.parser;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.main.gedcom.jaxb.Gedcom;
import com.main.gedcom.marshaller.GedcomMarshaller;
import com.main.gedcom.marshaller.impl.GedcomMarshallerImpl;
import com.main.gedcom.reader.GedcomFileReader;
import com.main.gedcom.reader.impl.GedcomFileReaderImpl;
import com.main.gedcom.service.GedcomDataService;
import com.main.gedcom.utils.LoadProperties;

import static com.main.gedcom.constants.Constants.*;

/**
 * @author Ravi
 * 
 */
public class GedcomParser {

	Properties appProp;

	/**
	 * Constructor to start the parse
	 */
	public GedcomParser() {
		appProp = LoadProperties.getInstance().loadProps();
		generateXML();
	}

	/**
	 * Main method to invoke parser
	 * 
	 */
	private void generateXML() {

		System.out.println("Parser Started ...");

		GedcomFileReader gedcomFileReader = new GedcomFileReaderImpl();
		System.out.println("Read data File : complete");
		List<String> gedcomData = gedcomFileReader.getGedcomData();

		Gedcom gedcom = new GedcomDataService().generateData(gedcomData);

		try {
			GedcomMarshaller parser = new GedcomMarshallerImpl();
			Marshaller m = parser.getMashaller(JAXB_INSTANCE);
			BufferedWriter os = new BufferedWriter(new FileWriter(appProp
					.getProperty(OUTPUT_FILE_NAME)));

			m.marshal(gedcom, os);
			System.out.println("File Generated !");

		} catch (JAXBException e) {

			e.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}

	}

}
