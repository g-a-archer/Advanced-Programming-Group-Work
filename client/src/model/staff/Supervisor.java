package model.staff;


import java.util.Arrays;

public class Supervisor extends Employee {

    public Supervisor(){
        super();
    }


    @Override
    public String toString( ) {
        return "Supervisor{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", telephone=" + Arrays.toString(telephone) +
                ", email='" + email + '\'' +
                "} ";
    }
}
