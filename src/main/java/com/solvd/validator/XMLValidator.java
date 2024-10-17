package com.solvd.validator;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;
import java.io.IOException;

public class XMLValidator {
    public static void main(String[] args) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File("employees.xsd"));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File("employees.xml")));

            System.out.println("XML is valid.");
        } catch (SAXException | IOException e) {
            System.out.println("XML is NOT valid.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}