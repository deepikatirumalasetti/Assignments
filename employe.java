package javaprojects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class employe {
  private String name;

  private double salary;

  public employe(String name, double salary) {

    this.name = name;
    this.salary = salary;
  }

  @Override
  public String toString() {

    return "Employee name: " + this.name + " salary: " + this.salary;
  }

  public boolean getSalary() {

    return this.salary > 40000.00;
  }
}

public class oddLengths {
  static List<employe> employelist = new ArrayList<>();

  public static void main(String[] args) {

    employelist.add(new employe("Anu", 50000.00));
    employelist.add(new employe("Sara", 45780.99));
    employelist.add(new employe("Neenu", 34560.78));
    for (Iterator empiterator = employelist.iterator(); empiterator.hasNext();) {
      employe emp = (employe) empiterator.next();
      {
        if (emp.getSalary()) {
          empiterator.remove();
        }
      }
      System.out.println("employee under the salary 40000");
      employelist.forEach(System.out::println);
    }

  }
}