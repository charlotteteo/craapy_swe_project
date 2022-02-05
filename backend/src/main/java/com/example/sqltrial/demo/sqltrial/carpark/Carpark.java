package com.example.sqltrial.demo.sqltrial.carpark;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carpark {
    @Id
    String code;
    String address;
    String typeOfParkingSystem;
    int lotsAvail;


    public Carpark() {
    }

    public Carpark(String code, String address, String typeOfParkingSystem, int lotsAvail) {
        this.code = code;
        this.address = address;
        this.typeOfParkingSystem = typeOfParkingSystem;
        this.lotsAvail = lotsAvail;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfParkingSystem() {
        return typeOfParkingSystem;
    }

    public void setTypeOfParkingSystem(String typeOfParkingSystem) {
        this.typeOfParkingSystem = typeOfParkingSystem;
    }

    public int getLotsAvail() {
        return lotsAvail;
    }

    public void setLotsAvail(int lotsAvail) {
        this.lotsAvail = lotsAvail;
    }


    @Override
    public String toString() {
        return "Carpark{" +
                "code='" + code + '\'' +
                ", address='" + address + '\'' +
                ", typeOfParkingSystem='" + typeOfParkingSystem + '\'' +
                ", lotsAvail=" + lotsAvail +
                '}';
    }
}
