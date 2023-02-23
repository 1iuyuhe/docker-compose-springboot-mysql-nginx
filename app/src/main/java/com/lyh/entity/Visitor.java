package com.lyh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Visitor {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private  Long  times;
    @Column(nullable = false)
    private  String  ip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTimes() {
        return times;
    }

    public void setTimes(Long times) {
        this.times = times;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", times=" + times +
                ", ip='" + ip + '\'' +
                '}';
    }
}
