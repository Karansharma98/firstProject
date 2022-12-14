package com.pragra.day13;

public class Address {

    private String address1;
    private String address2;
    private String city;
    private String province;
    private String Country;

    public Address(String address1, String address2, String city, String province, String country) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.province = province;
        Country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
