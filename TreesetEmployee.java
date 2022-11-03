 import java.util.*;

 import static java.lang.invoke.MethodHandleImpl.ArrayAccessor.name;

 class Employee{

    private int salary;
    private String name;

    // constructor
    public TreesetEmployee (int value, String name)
    {
        this.salary=value;
        this.name=name;
    }
    public String getName()
    {
        return getName();
    }
    public void setName(String name)
    {
        this.name= name;
    }

    public int getSalary()
    {
        return salary;
    }

}



class mysalaryComparator implements Comparator<Employee>
{

    public int compare(Employee E1, Employee E2)
    {
        return E1.getSalary()-E2.getSalary();
    }
}

class myNameComparator implements Comparator<Employee>
{
    public int compare(Employee E1, Employee E2)
    {
        return E1.getName().compareTo(E2.getName());
    }
}

class GFG {

    public static void main (String[] args){


        TreeSet<Employee> set = new TreeSet<Employee>(new mysalaryComparator());

        set.add(new Employee(50000,"Sam"));
        set.add(new Employee(60000,"Ronaldo"));
        set.add(new Employee(70000,"Daniel"));
        set.add(new Employee(40000,"George"));

        System.out.println("increasing Order with the salary");


        for(Employee ele: set)
        {
            System.out.print(ele.getName()+" "+ele.getSalary());
            System.out.println();
        }


        TreeSet<Employee> slry = new TreeSet<Employee>(new myNameComparator());

        slry.add(new Employee(50000,"Sam"));
        slry.add(new Employee(60000,"Ronaldo"));
        slry.add(new Employee(70000,"Daniel"));
        slry.add(new Employee(40000,"George"));

        System.out.println();

        for(Employee ele : slry)
        {
            System.out.print(ele.getName() +" "+ ele.getSalary());
            System.out.println();
        }

    }
}