package model.department;

public class Management extends Department {

    public Management( ) {
        super();
        departmentCode = "Man002";
        name = "Management";
    }

    @Override
    public String toString( ) {
        return "Management{" +
                "departmentCode='" + departmentCode + '\'' +
                ", name='" + name + '\'' +
                "} ";
    }
}
