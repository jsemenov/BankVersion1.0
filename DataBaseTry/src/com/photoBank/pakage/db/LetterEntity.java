package com.photoBank.pakage.db;

import javax.persistence.*;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "Letter", schema = "", catalog = "bionicfphoto")
public class LetterEntity {
    private int userId;
    private Integer msgNumber;
    private String msgText;
    private Integer senderId;

    @Id
    @Column(name = "userId", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "msgNumber", nullable = true, insertable = true, updatable = true)
    public Integer getMsgNumber() {
        return msgNumber;
    }

    public void setMsgNumber(Integer msgNumber) {
        this.msgNumber = msgNumber;
    }

    @Basic
    @Column(name = "msgText", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    @Basic
    @Column(name = "senderId", nullable = true, insertable = true, updatable = true)
    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LetterEntity that = (LetterEntity) o;

        if (userId != that.userId) return false;
        if (msgNumber != null ? !msgNumber.equals(that.msgNumber) : that.msgNumber != null) return false;
        if (msgText != null ? !msgText.equals(that.msgText) : that.msgText != null) return false;
        if (senderId != null ? !senderId.equals(that.senderId) : that.senderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (msgNumber != null ? msgNumber.hashCode() : 0);
        result = 31 * result + (msgText != null ? msgText.hashCode() : 0);
        result = 31 * result + (senderId != null ? senderId.hashCode() : 0);
        return result;
    }
}
