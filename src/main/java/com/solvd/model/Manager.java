package com.solvd.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import java.time.LocalDate;

@XmlRootElement(name = "manager")
@XmlAccessorType(XmlAccessType.FIELD)
public class Manager extends Employee {

    @XmlElement(name = "teamSize")
    private int teamSize;

    @XmlElement(name = "departmentManaged")
    private String departmentManaged;

    public Manager(int employeeId, String firstName, String lastName, int departmentId, int roleId, LocalDate hireDate, double salary, int teamSize, String departmentManaged) {
        super(employeeId, firstName, lastName, departmentId, roleId, hireDate, salary);
        this.teamSize = teamSize;
        this.departmentManaged = departmentManaged;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    public String getDepartmentManaged() { return departmentManaged; }
    public void setDepartmentManaged(String departmentManaged) { this.departmentManaged = departmentManaged; }

    public void manageTeam() {
        System.out.println("Managing team of " + teamSize + " in the " + departmentManaged + " department.");
    }
}
