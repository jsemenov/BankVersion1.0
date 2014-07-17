package com.photoBank.pakage.db;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "Photo", schema = "", catalog = "bionicfphoto")
public class PhotoEntity {
    private int imageId;
    private Timestamp downloadDate;
    private byte[] image;
    private Integer sharing;
    private String title;
    private Timestamp updateDate;
    private UserEntity userByUserId;
    private PrivacyStrEntity privacyStrByPrivacyId;

    @Id
    @Column(name = "imageId", nullable = false, insertable = true, updatable = true)
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Basic
    @Column(name = "downloadDate", nullable = true, insertable = true, updatable = true)
    public Timestamp getDownloadDate() {
        return downloadDate;
    }

    public void setDownloadDate(Timestamp downloadDate) {
        this.downloadDate = downloadDate;
    }

    @Basic
    @Column(name = "image", nullable = true, insertable = true, updatable = true)
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

        PhotoEntity that = (PhotoEntity) o;

        if (imageId != that.imageId) return false;
        if (downloadDate != null ? !downloadDate.equals(that.downloadDate) : that.downloadDate != null) return false;
        if (!Arrays.equals(image, that.image)) return false;
        if (sharing != null ? !sharing.equals(that.sharing) : that.sharing != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imageId;
        result = 31 * result + (downloadDate != null ? downloadDate.hashCode() : 0);
        result = 31 * result + (image != null ? Arrays.hashCode(image) : 0);
        result = 31 * result + (sharing != null ? sharing.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "privacyId", referencedColumnName = "privacyId")
    public PrivacyStrEntity getPrivacyStrByPrivacyId() {
        return privacyStrByPrivacyId;
    }

    public void setPrivacyStrByPrivacyId(PrivacyStrEntity privacyStrByPrivacyId) {
        this.privacyStrByPrivacyId = privacyStrByPrivacyId;
    }
}
