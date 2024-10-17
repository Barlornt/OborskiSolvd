package com.solvd.model;

import javax.xml.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlElement(name = "employeeId")
    private int employeeId;

    @XmlElement(name = "firstName")
    private String firstName;

    @XmlElement(name = "lastName")
    private String lastName;

    @XmlElement(name = "departmentId")
    private int departmentId;

    @XmlElement(name = "roleId")
    private int roleId;

    @XmlElement(name = "hireDate")
    private LocalDate hireDate;

    @XmlElement(name = "salary")
    private double salary;

    @XmlElementWrapper(name = "roles")
    @XmlElement(name = "role")
    private List<Role> roles;

    public Employee(int employeeId, String firstName, String lastName, int departmentId, int roleId, LocalDate hireDate, double salary, List<Role> roles) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.roleId = roleId;
        this.hireDate = hireDate;
        this.salary = salary;
        this.roles = roles;
    }


    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public int getRoleId() { return roleId; }
    public void setRoleId(int roleId) { this.roleId = roleId; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public List<Role> getRoles() { return roles; }
    public void setRoles(List<Role> roles) { this.roles = roles; }

    public String getFullName() { return this.firstName + " " + this.lastName; }
}
