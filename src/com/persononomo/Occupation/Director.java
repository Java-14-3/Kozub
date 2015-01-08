package com.persononomo.Occupation;

import com.persononomo.Person;


public class Director extends Person {

    public int getKabinet() {
        return kabinet;
    }
    public void setKabinet(int kabinet) {
        this.kabinet = kabinet;
    }

    int kabinet;

    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }

    String car;

    public int getParkingPlace() {
        return parkingPlace;
    }
    public void setParkingPlace(int parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    int parkingPlace;
}
