package com.photoBank.pakage.db;

import javax.persistence.*;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "PrivacyStr", schema = "", catalog = "bionicfphoto")
public class PrivacyStrEntity {
    private int privacyId;
    private String privacyStr;

    @Id
    @Column(name = "privacyId", nullable = false, insertable = true, updatable = true)
    public int getPrivacyId() {
        return privacyId;
    }

    public void setPrivacyId(int privacyId) {
        this.privacyId = privacyId;
    }

    @Basic
    @Column(name = "privacyStr", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPrivacyStr() {
        return privacyStr;
    }

    public void setPrivacyStr(String privacyStr) {
        this.privacyStr = privacyStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivacyStrEntity that = (PrivacyStrEntity) o;

        if (privacyId != that.privacyId) return false;
        if (privacyStr != null ? !privacyStr.equals(that.privacyStr) : that.privacyStr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = privacyId;
        result = 31 * result + (privacyStr != null ? privacyStr.hashCode() : 0);
        return result;
    }
}
