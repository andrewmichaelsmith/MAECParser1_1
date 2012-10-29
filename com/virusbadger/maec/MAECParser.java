package com.virusbadger.maec;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.mitre.maec.xmlschema.maec_core_1.BundleType;

public class MAECParser {

	private static final String MAEC_SCHEMA_ID = "org.mitre.maec.xmlschema.maec_core_1";
	
	public MAECParser(InputStream xml) {
		try {
			JAXBContext jc = JAXBContext.newInstance(MAEC_SCHEMA_ID);
			Unmarshaller u = jc.createUnmarshaller();
			
			JAXBElement<BundleType> root = (JAXBElement<BundleType>) u.unmarshal(xml);
		
			BundleType bundleType = root.getValue();
			
			System.out.println(bundleType.getId());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) throws IOException {
		
		new MAECParser(new FileInputStream(new File("C:\\Users\\andrew\\git\\vb\\VirusBadger\\resources\\sample-1.xml")));
	}
}
