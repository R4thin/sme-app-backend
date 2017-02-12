package com.me.sparta.repositories.customer;

public class CustomerInformation {

    private String idNumber;
    private String firstName;
    private String suname;
    private String email;
    private String mobile;
    private String address;
    private String date;

    public CustomerInformation() {
    }

    public CustomerInformation(String idNumber, String firstName, String suname, String email, String mobile, String address, String date) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.suname = suname;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.date = date;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CustomerInformation{" +
                "idNumber='" + idNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", suname='" + suname + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
