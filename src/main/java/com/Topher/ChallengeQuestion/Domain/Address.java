package com.Topher.ChallengeQuestion.Domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {
    @Column(name = "ADDRESS_STREET")
    private String street;
    @Column(name = "ADDRESS_SUITE")
    private String suite;
    @Column(name = "ADDRESS_CITY")
    private String city;
    @Column(name = "ADDRESS_ZIPCODE")
    private String zipcode;
    @Column(name = "ADDRESS_GEO_OBJ")
    private Geo geo;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zip) {
        this.zipcode = zip;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}
