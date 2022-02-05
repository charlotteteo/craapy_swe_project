package com.example.sqltrial.demo.sqltrial.hawker;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class HawkerStall {

    @Id
    public String name;
    public String address;
    public String operationHours;

    public HawkerStall() {
    }

    @Autowired
    public HawkerStall(String name, String address, String operationHours) {
        this.name = name;
        this.address = address;
        this.operationHours = operationHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperationHours() {
        return operationHours;
    }

    public void setOpeningHours(String operationHours) {
        this.operationHours = operationHours;
    }

    @Override
    public String toString() {
        return "HawkerStall{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", operationHours='" + operationHours + '\'' +
                '}';
    }
}
