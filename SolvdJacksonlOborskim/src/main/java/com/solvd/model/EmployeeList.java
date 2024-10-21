package com.solvd.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "employees")
public class EmployeeList {

    @XmlElement(name = "employee")
    private List<Employee> employeees;

    public List<Employee> getEmployees() {
        return employeees;
    }

    public void setEmployees(List<Employee> employeees) {
        this.employeees = employeees;
    }
}
