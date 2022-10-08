package model.department;

public class Accounting extends Department {

    public Accounting( ) {
        super();
        departmentCode = "Ac001";
        name = "Accounting";
    }
    @Override
    public String toString( ) {
        return "Accounting{" +
                "departmentCode='" + departmentCode + '\'' +
                ", name='" + name + '\'' +
                "} ";
    }
}
