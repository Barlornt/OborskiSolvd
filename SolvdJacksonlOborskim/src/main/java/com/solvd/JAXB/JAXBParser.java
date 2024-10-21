package com.solvd.JAXB;

import com.solvd.model.Employee;
import com.solvd.model.EmployeeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class JAXBParser {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(EmployeeList.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            EmployeeList employeeList = (EmployeeList) unmarshaller.unmarshal(new File("src/main/resources/employee.xml"));

            for (Employee employee : employeeList.getEmployees()) {
                System.out.println("Unmarshalled Employee: " + employee.getFullName());
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }


        //Test for unmarshaling to output_employee.xml
        EmployeeList newEmployeeList = new EmployeeList();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John", "Doe", 101, 2, LocalDate.now(), 50000, new ArrayList<>()));
        employeeList.add(new Employee(2, "Jane", "Smith", 102, 3, LocalDate.now(), 60000, new ArrayList<>()));

        newEmployeeList.setEmployees(employeeList);


        try {
            JAXBContext context = JAXBContext.newInstance(EmployeeList.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(newEmployeeList, new File("src/main/resources/output_employee.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}