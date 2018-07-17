package com.BugzTests;


public class Person{
     private String name;
     private String idNo;
     private String phone;
     private String email;

     public void setName(String name)  //set name
     {
         this.name = name;
     }

     public String getName()    //get name
     {
         return name;
     }

     public void setIdNo(String id)  //set id
     {
         this.idNo = id;
     }

     public String getIdNo()  //get id
     {
         return idNo;
     }

     public void setPhone(String phone)  //set phone
     {
         this.phone = phone;
     }

     public String getPhone() //get phone
     {
         return phone;
     }

     public void setEmail(String email)  //set name
     {
         this.email = email;
     }

     public String getEmail()   //get email
     {
         return  email;
     }

     public void getAdress()
     {
         System.out.println(getPhone()+" "+getEmail());
     }





    public static void main(String[] args) {
         Department dpt = new Department();
         dpt.setCode("001");
         dpt.setHOD("makena");
         dpt.setName("frontDoor");
         Worker receptionist = new Worker();
         receptionist.setDesignation("receptionist");
         receptionist.setName("mrs mwangi");
         receptionist.setEmail("mwangi@gmail.com");
         receptionist.setPhone("0715225835");
         receptionist.setSalary(50000);
         receptionist.setDepartment(dpt);


        System.out.println("name is : "+receptionist.getName());
        System.out.print("the contacts are : ");
        receptionist.getAdress();
        System.out.println("designation: "+receptionist.getDesignation());
        System.out.println("salary is :"+receptionist.getSalary());
        System.out.println("department details  :");
        System.out.println("\t\t\t\t\t\t"+receptionist.getDepartment());
        System.out.println();

        System.out.print(receptionist.getName()+" advance is:");
        System.out.println(receptionist.requestAdvance(30000));
        System.out.println("##################################################################################################");
        System.out.println("##################################################################################################");

        Person cook = new Worker();
        cook.setName("chief chef");
        cook.setPhone("07212...");
        ((Worker) cook).setDepartment(dpt);
        cook.setEmail("cook@...");
        ((Worker) cook).setDesignation("cook");
        ((Worker) cook).setSalary(30000);


        System.out.println("name is "+cook.getName());
        System.out.println("contacts are : "); cook.getAdress();
        System.out.println("can get advance? : "); ((Worker) cook).requestAdvance(20000);


   }
}
