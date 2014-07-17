package com.photoBank.pakage.db;

import javax.persistence.*;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "SharingStr", schema = "", catalog = "bionicfphoto")
public class SharingStrEntity {
    private int sharingId;
    private String sharingStr;

    @Id
    @Column(name = "sharingId", nullable = false, insertable = true, updatable = true)
    public int getSharingId() {
        return sharingId;
    }

    public void setSharingId(int sharingId) {
        this.sharingId = sharingId;
    }

    @Basic
    @Column(name = "sharingStr", nullable = true, insertable = true, updatable = true, length = 255)
    public String getSharingStr() {
        return sharingStr;
    }

    public void setSharingStr(String sharingStr) {
        this.sharingStr = sharingStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SharingStrEntity that = (SharingStrEntity) o;

        if (sharingId != that.sharingId) return false;
        if (sharingStr != null ? !sharingStr.equals(that.sharingStr) : that.sharingStr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sharingId;
        result = 31 * result + (sharingStr != null ? sharingStr.hashCode() : 0);
        return result;
    }
}
