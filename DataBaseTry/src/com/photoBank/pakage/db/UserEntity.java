package com.photoBank.pakage.db;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "User", schema = "", catalog = "bionicfphoto")
public class UserEntity {
    private int userId;
    private String name;
    private Timestamp regDate;
    private Integer sharing;
    private Timestamp updateDate;
    private UserRoleStrEntity userRoleStrByRoleId;

    @Id
    @Column(name = "userId", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "regDate", nullable = true, insertable = true, updatable = true)
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "sharing", nullable = true, insertable = true, updatable = true)
    public Integer getSharing() {
        return sharing;
    }

    public void setSharing(Integer sharing) {
        this.sharing = sharing;
    }

    @Basic
    @Column(name = "updateDate", nullable = true, insertable = true, updatable = true)
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (regDate != null ? !regDate.equals(that.regDate) : that.regDate != null) return false;
        if (sharing != null ? !sharing.equals(that.sharing) : that.sharing != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (sharing != null ? sharing.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    public UserRoleStrEntity getUserRoleStrByRoleId() {
        return userRoleStrByRoleId;
    }

    public void setUserRoleStrByRoleId(UserRoleStrEntity userRoleStrByRoleId) {
        this.userRoleStrByRoleId = userRoleStrByRoleId;
    }
}
