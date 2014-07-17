package com.photoBank.pakage.db;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by user on 7/17/14.
 */
@Entity
@Table(name = "Log", schema = "", catalog = "bionicfphoto")
public class LogEntity {
    private int id;
    private Date data;
    private String log;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "data", nullable = true, insertable = true, updatable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "log", nullable = true, insertable = true, updatable = true, length = 255)
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogEntity logEntity = (LogEntity) o;

        if (id != logEntity.id) return false;
        if (data != null ? !data.equals(logEntity.data) : logEntity.data != null) return false;
        if (log != null ? !log.equals(logEntity.log) : logEntity.log != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (log != null ? log.hashCode() : 0);
        return result;
    }
}
