package model.staff;

import model.Date;

import java.util.Arrays;

public class Employee {

    String staffId;
    String name;
    Date dob;
    String address;
    String[] telephone;
    String email;

    public Employee(){
        this.staffId = "''";
        this.name = "''";
        this.dob = new Date();
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public Employee(String staffId){

    }

    public Employee(String staffId, String name, Date dob, String address,
                    String[] telephone, String email) {
        this.staffId = staffId;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public String getStaffId( ) {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob( ) {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress( ) {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getTelephone( ) {
        return telephone;
    }

    public void setTelephone(String[] telephone) {
        this.telephone = telephone;
    }

    public String getEmail( ) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString( ) {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", telephone=" + Arrays.toString(telephone) +
                ", email='" + email + '\'' +
                '}';
    }
}
