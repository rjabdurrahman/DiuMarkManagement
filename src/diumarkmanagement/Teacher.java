
package diumarkmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    String tName;
    String tId;
    
    TeacherCourse courseInfo1;
    TeacherCourse courseInfo2;
    TeacherCourse courseInfo3;
    
    // constuctor
    Teacher(String tName,String tId){
        this.tName = tName;
        this.tId = tId;
    }
    
    Scanner sc = new Scanner(System.in);
    void marksInput(ArrayList<Student> studentList, Teacher T){
              studentList.forEach((Student std) -> {
          
          std.StudentCourseList.forEach((cc) -> {
              if(cc.idCode.equals(T.courseInfo1.courseCode)){
               System.out.println("ID: "+std.stdId);
               System.out.println("name: "+std.stdName);
               System.out.println("Semester Course :");
               System.out.println(cc.idCode +" "+cc.name+" "+cc.type+" "+cc.credit);
               System.out.println("You add your course Marks here :");
               cc.marks = sc.nextInt();
               
               if(cc.marks>=80){
                   cc.gpa=4.00;
               }
               else if(cc.marks>=75){
                   cc.gpa=3.75;
               }
               else if(cc.marks>=70){
                   cc.gpa=3.50;
               }
               else if(cc.marks>=65){
                   cc.gpa=3.25;
               }
               else if(cc.marks>=60){
                   cc.gpa=3.00;
               }
               else if(cc.marks>=55){
                   cc.gpa=2.75;
               }
               else if(cc.marks>=50){
                   cc.gpa=2.50;
               }
               else  if(cc.marks>=45){
                   cc.gpa=2.25;
               }
               else if(cc.marks>=40){
                   cc.gpa=2.00;
               }
               else {
                   cc.gpa=0.0;
               }       
               
               
              }
              
               
            });
          System.out.println(" ");
       }); 
    }
    
    void courseT1(String subcode, String subname){
        courseInfo1 = new TeacherCourse(subcode,subname);
        
    }
    void courseT2(String subcode, String subname){
        courseInfo2 = new TeacherCourse(subcode,subname);
        
    }
    void courseT3(String subcode, String subname){
        courseInfo3 = new TeacherCourse(subcode,subname);
        
    }
    
    
    
}
