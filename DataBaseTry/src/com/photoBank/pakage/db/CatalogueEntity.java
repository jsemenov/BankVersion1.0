package com.photoBank.pakage.db;

import javax.persistence.*;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "Catalogue", schema = "", catalog = "bionicfphoto")
public class CatalogueEntity {
    private int idFolder;
    private String nameDirectory;
    private Integer parentId;

    @Id
    @Column(name = "idFolder", nullable = false, insertable = true, updatable = true)
    public int getIdFolder() {
        return idFolder;
    }

    public void setIdFolder(int idFolder) {
        this.idFolder = idFolder;
    }

    @Basic
    @Column(name = "nameDirectory", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNameDirectory() {
        return nameDirectory;
    }

    public void setNameDirectory(String nameDirectory) {
        this.nameDirectory = nameDirectory;
    }

    @Basic
    @Column(name = "parentId", nullable = true, insertable = true, updatable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CatalogueEntity that = (CatalogueEntity) o;

        if (idFolder != that.idFolder) return false;
        if (nameDirectory != null ? !nameDirectory.equals(that.nameDirectory) : that.nameDirectory != null)
            return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFolder;
        result = 31 * result + (nameDirectory != null ? nameDirectory.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        return result;
    }
}
