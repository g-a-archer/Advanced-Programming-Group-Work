package model.staff;

import java.util.Arrays;

public class Manager extends Employee {

    public Manager(){
        super();
    }

    @Override
    public String toString( ) {
        return "Manager{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", telephone=" + Arrays.toString(telephone) +
                ", email='" + email + '\'' +
                "} ";
    }
}
