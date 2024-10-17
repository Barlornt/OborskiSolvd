package com.solvd.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "role")
@XmlAccessorType(XmlAccessType.FIELD)
public class Role {

    @XmlElement(name = "roleId")
    private int roleId;

    @XmlElement(name = "roleName")
    private String roleName;

    @XmlElement(name = "departmentId")
    private int departmentId;

    public Role(int roleId, String roleName, int departmentId) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.departmentId = departmentId;
    }

    public int getRoleId() { return roleId; }
    public void setRoleId(int roleId) { this.roleId = roleId; }

    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }

    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
