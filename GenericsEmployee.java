package Generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsEmployee {
  private int empId;

  private String empName;

  private int empSal;

  private String empDept;

  public GenericsEmployee(int empId, String empName, int empSal, String empDept) {

    super();
    this.empId = empId;
    this.empName = empName;
    this.empSal = empSal;
    this.empDept = empDept;
  }

  public final int getEmpId() {

    return this.empId;
  }

  public final void setEmpId(int empId) {

    this.empId = empId;
  }

  public final String setEmpName() {

    return this.empName;
  }

  public final void setEmpName(String empName) {

    this.empName = empName;
  }

  public final int setEmpSal() {

    return this.empSal;
  }

  public final void setEmpSal(int empSal) {

    this.empSal = empSal;
  }

  public final String setEmpDept() {

    return this.empDept;
  }

  public final void setEmpDept(String empDept) {

    this.empDept = empDept;
  }

  @Override
  public String toString() {

    return "Employee [empId= " + this.empId + ",empName= " + this.empName + ",empSal = " + this.empSal + ",empDept = "
        + this.empDept + "]";
  }

  @Override
  public int hashCode() {

    return this.empId;
  }

  @Override
  public boolean equals(Object obj) {

    GenericsEmployee employee = (GenericsEmployee) obj;
    if (employee.empId == this.empId) {
      employee.setEmpName(this.empName);
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {

    Set<GenericsEmployee> employees = new HashSet<>();
    employees.add(new GenericsEmployee(1, "Anu", 30000, "testing"));
    employees.add(new GenericsEmployee(2, "Ansu", 45000, "Developer"));
    employees.add(new GenericsEmployee(3, "Neenu", 38000, "Testing"));
    employees.add(new GenericsEmployee(4, "Sara", 47000, "Developer"));
    System.out.println(employees);
  }
}