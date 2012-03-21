package com.main.gedcom.service;

import java.util.ArrayList;
import java.util.List;

import com.main.gedcom.jaxb.Fam;
import com.main.gedcom.jaxb.Gedcom;
import com.main.gedcom.jaxb.Indi;
import com.main.gedcom.jaxb.Note;
import com.main.gedcom.jaxb.Fam.Marr;
import com.main.gedcom.jaxb.Indi.Birth;
import com.main.gedcom.jaxb.Indi.Chan;
import com.main.gedcom.jaxb.Indi.Deat;
import com.main.gedcom.jaxb.Indi.Name;

import static com.main.gedcom.constants.Constants.*;

public class GedcomDataService {
	Gedcom gedcom;
	Indi indi;
	Fam fam;
	Note note;
	String rootNode;
	Birth birth;
	Deat death;
	Chan chan;
	Marr marraige;
	List<String> childList;

	public Gedcom generateData(List<String> gedcomData) {

		gedcom = new Gedcom();
		List<Indi> indiList = new ArrayList<Indi>();
		List<Fam> famList = new ArrayList<Fam>();
		List<Note> noteList = new ArrayList<Note>();
		
		for (String data : gedcomData) {
			try {
				int firstChar = Character.getNumericValue(data.charAt(0));

				switch (firstChar) {
				case 0:
					if (indi != null) {
						indiList.add(indi);
						indi = null;
					}
					if (fam != null) {
						
						if (childList != null && !childList.isEmpty()) {
							fam.getChil().addAll(childList);
						}
						famList.add(fam);
						childList = null;
						fam = null;
					}
					if (note != null) {
						noteList.add(note);
						note = null;
					}
					rootNodes(data);
					break;
				case 1:
					childNodes(data);
					
					break;
				case 2:
					leafNodes(data);
					break;

				default:
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		gedcom.getIndi().addAll(indiList);
		gedcom.getFam().addAll(famList);
		gedcom.getNote().addAll(noteList);
		return gedcom;
	}

	private void leafNodes(String data) {

		if (birth != null) {
			if (data.contains("DATE")) {
				birth.setDate(data.replace("2 DATE", "").trim());
			}
			if (data.contains("PLAC")) {
				birth.setPlac(data.replace("2 PLAC", "").trim());
			}
			indi.setBirth(birth);
			// birth = null;
		} else

		if (death != null) {
			if (data.contains("DATE")) {
				death.setDate(data.replace("2 DATE", "").trim());
			}
			indi.setDeat(death);
			death = null;
		} else if (chan != null) {
			if (data.contains("DATE")) {
				chan.setDate(data.replace("2 DATE", "").trim());
			}
			indi.setChan(chan);
			chan = null;
		} else if (marraige != null) {
			if (data.contains("DATE")) {
				marraige.setDate(data.replace("2 DATE", "").trim());
			}
			if (data.contains("PLAC")) {
				marraige.setPlac(data.replace("2 PLAC", "").trim());
			}
			fam.setMarr(marraige);
			marraige = null;
		}
	}

	private void childNodes(String data) {
		if (rootNode.equalsIgnoreCase(ROOT_INDI)) {
			if (data.contains(INDI_NAME)) {
				Name name = new Name();
				name.setValue(data.replace("1 NAME", "").trim().trim());
				if (name.getValue() != null && name.getValue().contains("/")) {
					name.setSurn(name.getValue().substring(
							name.getValue().indexOf("/")).replace("/", ""));
					name.setGivn(name.getValue().substring(0,
							name.getValue().indexOf("/")));
				}

				indi.setName(name);
			} else if (data.contains(INDI_SEX)) {
				indi.setSex(Character.toString(data.charAt(data.length() - 1)));
			} else if (data.contains(INDI_BIRT)) {
				birth = new Birth();
				death = null;
				chan = null;

			} else if (data.contains(INDI_TITL)) {
				indi.setTitl(data.replace("1 TITL", "").trim());
			} else if (data.contains(INDI_OCCU)) {
				indi.setOccu(data.replace("1 OCCU", "").trim());
			} else if (data.contains(INDI_FAMC)) {
				indi.setFamc(data.replace("1 FAMC", "").trim());
			} else if (data.contains(INDI_FAMS)) {
				indi.setFams(data.replace("1 FAMS", "").trim());
			} else if (data.contains(INDI_NOTE)) {
				indi.setNote(data.replace("1 NOTE", "").trim());
			} else if (data.contains(INDI_DEAT)) {
				death = new Deat();
				death.setValue(Character.toString(data
						.charAt(data.length() - 1)));
				birth = null;
				chan = null;
			} else if (data.contains(INDI_CHAN)) {
				chan = new Chan();
				birth = null;
				death = null;
			}
		}
		if (rootNode.equalsIgnoreCase(ROOT_FAM)) {
			if (data.contains(FAM_WIFE)) {
				fam.setWife(data.replace("1 WIFE", "").trim());
			} else if (data.contains(FAM_HUSB)) {
				fam.setHusb(data.replace("1 HUSB", "").trim());
			} else if (data.contains(FAM_CHIL)) {
				childList.add(data.replace("1 CHIL", "").trim());

			} else if (data.contains(FAM_MARR)) {
				marraige = new Marr();

			}else if(data.contains(FAM_NOTE)){
				fam.setNote(data.replace("1 NOTE", "").trim());
			}
			
		}
		if (rootNode.equalsIgnoreCase(ROOT_NOTE)) {
			if(data.contains(NOTE_CONC)){
				note.setConc(data.replace("1 CONC", "").trim());
			}else if(data.contains(NOTE_CONT)){
				note.setCont(data.replace("1 CONT", "").trim());
			}
		}

	}

	private void rootNodes(String data) {

		// TODO Auto-generated method stub
		if (data.contains(ROOT_INDI)) {
			indi = new Indi();
			rootNode = ROOT_INDI;
			indi.setId(data.substring(data.indexOf("@"),
					data.lastIndexOf("@") + 1));
		}
		if (data.contains(ROOT_FAM)) {
			fam = new Fam();
			rootNode = ROOT_FAM;
			childList = new ArrayList<String>();
			fam.setId(data.substring(data.indexOf("@"),
					data.lastIndexOf("@") + 1));
		}
		if (data.contains(ROOT_NOTE)) {
			note = new Note();
			rootNode = ROOT_NOTE;
			note.setId(data.substring(data.indexOf("@"),
					data.lastIndexOf("@") + 1));

		}
	}
}
