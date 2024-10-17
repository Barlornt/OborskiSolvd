package com.solvd.validator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import java.io.File;

public class DOMParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("employee.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("employee");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element: " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Employee ID: " + eElement.getElementsByTagName("employeeId").item(0).getTextContent());
                    System.out.println("First Name: " + eElement.getElementsByTagName("firstName").item(0).getTextContent());
                    System.out.println("Last Name: " + eElement.getElementsByTagName("lastName").item(0).getTextContent());
                    System.out.println("Department ID: " + eElement.getElementsByTagName("departmentId").item(0).getTextContent());
                    System.out.println("Role ID: " + eElement.getElementsByTagName("roleId").item(0).getTextContent());
                    System.out.println("Hire Date: " + eElement.getElementsByTagName("hireDate").item(0).getTextContent());
                    System.out.println("Salary: " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
