package com.photoBank.pakage.db;

import javax.persistence.*;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "UserRoleStr", schema = "", catalog = "bionicfphoto")
public class UserRoleStrEntity {
    private int roleId;
    private String roleStr;

    @Id
    @Column(name = "roleId", nullable = false, insertable = true, updatable = true)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "roleStr", nullable = true, insertable = true, updatable = true, length = 255)
    public String getRoleStr() {
        return roleStr;
    }

    public void setRoleStr(String roleStr) {
        this.roleStr = roleStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoleStrEntity that = (UserRoleStrEntity) o;

        if (roleId != that.roleId) return false;
        if (roleStr != null ? !roleStr.equals(that.roleStr) : that.roleStr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleStr != null ? roleStr.hashCode() : 0);
        return result;
    }
}
