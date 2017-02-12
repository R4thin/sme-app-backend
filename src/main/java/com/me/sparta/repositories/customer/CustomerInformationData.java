package com.me.sparta.repositories.customer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customerInformationData")
public class CustomerInformationData {

    @Id
    private String idNumber;

    private String firstName;
    private String suname;
    private String email;
    private String mobile;
    private String address;
    private String date;

    public CustomerInformationData() {
    }

    public CustomerInformationData(String idNumber, String firstName, String suname, String email, String mobile, String address, String date) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.suname = suname;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.date = date;
    }

    public CustomerInformationData(CustomerInformation customerInformation) {
        this.idNumber = customerInformation.getIdNumber();
        this.firstName = customerInformation.getFirstName();
        this.suname = customerInformation.getSuname();
        this.email = customerInformation.getEmail();
        this.mobile = customerInformation.getMobile();
        this.address = customerInformation.getAddress();
        this.date = customerInformation.getDate();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerInformationData that = (CustomerInformationData) o;

        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (suname != null ? !suname.equals(that.suname) : that.suname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        return date != null ? date.equals(that.date) : that.date == null;

    }

    @Override
    public int hashCode() {
        int result = idNumber != null ? idNumber.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (suname != null ? suname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomerInformationData{" +
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
