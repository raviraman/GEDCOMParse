package com.main.gedcom.reader.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.main.gedcom.reader.GedcomFileReader;
import com.main.gedcom.utils.LoadProperties;

/**
 * @author Ravi
 * 
 */
public class GedcomFileReaderImpl implements GedcomFileReader {

	
	
	
	/**
	 * reads the GEDCOM file and loads to memory 
	 * @return {@link List}
	 * @see com.main.gedcom.reader.GedcomFileReader#getGedcomData()
	 */
	@Override
	public List<String> getGedcomData() {

		BufferedReader br = null;
		String line = null;
		List<String> gedcomData = null;
		
		Properties appProp = LoadProperties.getInstance().loadProps();
		try {
			String path = getClass().getClassLoader().getResource(".").getPath();
			System.out.println("Read Data File From :"+path+appProp.getProperty("GEDCOM_FILE_NAME"));
			br = new BufferedReader(new FileReader(path+appProp.getProperty("GEDCOM_FILE_NAME")));
			gedcomData = new ArrayList<String>();
			while ((line = br.readLine()) != null) {
				gedcomData.add(line);

			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return gedcomData;
	}

}
