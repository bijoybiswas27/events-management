package com.bijoy.events.event_management.entities;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Venue extends AbstractEntity {
    private String streetaddress1;
    private String streetaddress2;
    private String city;
    private String state;
    private String country;
    private String pincode;

    public String getStreetaddress1() {
        return streetaddress1;
    }

    public void setStreetaddress1(String streetaddress1) {
        this.streetaddress1 = streetaddress1;
    }

    public String getStreetaddress2() {
        return streetaddress2;
    }

    public void setStreetaddress2(String streetaddress2) {
        this.streetaddress2 = streetaddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public boolean equals(Object o) {
        return Objects.equals(id, ((Venue) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
