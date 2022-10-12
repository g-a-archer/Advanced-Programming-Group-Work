package model.staff;

import java.util.Arrays;

public class LineWorker extends Employee{

    public LineWorker(){
        super();
    }

    @Override
    public String toString( ) {
        return "LineWorker{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", telephone=" + Arrays.toString(telephone) +
                ", email='" + email + '\'' +
                "} ";
    }
}
