package com.BugzTests;

public class Worker extends Person {

    private  String empolyeeNo;
    private  Department department;
    private  String designation;
    private  double Salary;

    public String getEmpolyeeNo() // get employee no
    {
        return empolyeeNo;
    }

    public void setEmpolyeeNo(String empolyeeNo) // set employee
    {
        this.empolyeeNo = empolyeeNo;
    }

    public Department getDepartment() // get department
    {
        return department;
    }

    public void setDepartment(Department department)  // set department
    {
        this.department = department;
    }

    public String getDesignation()   //get destination
    {
        return designation;
    }

    public void setDesignation(String designation) //set designation
    {
        this.designation = designation;
    }

    public double getSalary()  //get salary
    {
        return Salary;
    }

    public void setSalary(double salary) // set salary
    {
        Salary = salary;
    }

    public double requestAdvance (double requestedAmount)
    {
        double advance=0;
        if (requestedAmount>=(getSalary()-10000))
        {
            System.out.println("not valid");
        }
        else
        {
            advance = getSalary()-requestedAmount;

        }


        return  advance;
    }
}
