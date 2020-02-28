/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

/**
 *
 * @author 2
 */
public class Employee {
    
    String result;
    private int sal;
    private String nam;


    public Employee()
    {
        result="";
    }
    
    public Employee(String name, int salary)
    {
        nam=name;
        sal=salary;
        getSalary();
        getName();
    }
    
    public int getSalary()
    {   
        return sal;
    }
    
    public String getName()
    {
        return nam;
    }

    public String toString()
    {

      result= "Employee: " + getName() + " Salary: $" + getSalary();
      return result;
    }
}
