package classes;

/**
 * Created by JPMPC-B201 on 11/10/2016.
 */
public class Employee extends Person {



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPagibig_id() {
        return pagibig_id;
    }

    public void setPagibig_id(int pagibig_id) {
        this.pagibig_id = pagibig_id;
    }

    public String department;
    public int employee_id;
    public int id;
    public int pagibig_id;




}
