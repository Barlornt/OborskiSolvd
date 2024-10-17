package com.solvd.JAXB;

import com.solvd.model.Employee;
import com.solvd.model.Role;

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
            JAXBContext context = JAXBContext.newInstance(Employee.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            Employee employee = (Employee) unmarshaller.unmarshal(new File("employees.xml"));
            System.out.println("Unmarshalled Employee: " + employee.getFullName());

            List<Role> roles = employee.getRoles();
            for (Role role : roles) {
                System.out.println("Role: " + role.getRoleName());
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Employee newEmployee = new Employee(3, "Alice", "Johnson", 101, 2, LocalDate.now(), 70000, new ArrayList<>());
            marshaller.marshal(newEmployee, new File("output_employee.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}