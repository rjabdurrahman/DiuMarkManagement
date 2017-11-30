
package diumarkmanagement;

import java.util.ArrayList;

public class Admin {
     
    double totalAmount = 30000;
    double totalGPA = 0;
    
    void calculateCGPA_AllStudent(ArrayList<Student> studentList){
             
      studentList.forEach((Student std) -> {

          std.StudentCourseList.forEach((cc) -> {
              
              totalGPA = totalGPA + cc.gpa;
             
              
          });
          std.stdCGPA = totalGPA/(std.StudentCourseList.size());
          
          if(std.stdCGPA>3.9){
           std.waiveramount = totalAmount * 0.5;
          }
          
          totalGPA=0;
     });
        
    }
    
    void checkMarks(ArrayList<Student> studentList){
        
                   
      studentList.forEach((Student std) -> {
                System.out.println("ID: "+std.stdId);
               System.out.println("name: "+std.stdName);
               System.out.println("Semester Course :");
          
          std.StudentCourseList.forEach((cc) -> {
              
         
               System.out.println(cc.idCode +" "+cc.name+" "+cc.type+" "+cc.credit+" "+cc.marks+" "+cc.gpa);
              
              
              
               
          });
          System.out.println("CGPA = " +std.stdCGPA);
          System.out.println(" ");
     });
        
    }
            
         int t = 0;   
    void salaryAprovemrnt(ArrayList<Student> studentList,Teacher Tchr){
        
        studentList.forEach((Student std) -> {

          std.StudentCourseList.forEach((cc) -> {
               if(cc.idCode.equals(Tchr.courseInfo1.courseCode)){
                   t = t + cc.marks;
               }
          });

     });
        
        if(t>0){
            t=0;
            System.out.println(Tchr.tId);
            System.out.println(Tchr.tName);
          System.out.println("Salary Aproved");  
        }
            
        else{
            t=0;
            System.out.println(Tchr.tId);
            System.out.println(Tchr.tName);
            System.out.println("Salary is not Aproved");
        }
        System.out.println(" ");
           
    }
    
    
    
}
