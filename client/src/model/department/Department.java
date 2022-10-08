package model.department;

public class Department {
    String departmentCode;
    String name;


    public Department(){
     departmentCode = "''";
     name = "''";
    }

    public Department(String departmentCode, String name) {
        this.departmentCode = departmentCode;
        this.name = name;
    }

    public String getDepartmentCode( ) {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString( ) {
        return "Department{" +
                "departmentCode='" + departmentCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
