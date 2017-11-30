
package diumarkmanagement;

import java.util.ArrayList;

public class Student {
    
    String stdId;
    String stdName;
    double waiveramount;
    double stdCGPA = 0;
    
    
    Course c1;
    Course c2;
    Course c3;
    // course info in ArrayList
    
    ArrayList < Course > StudentCourseList = new ArrayList<>();
    
    // constructor
    
    Student(String stdId,String stdName){
        this.stdId = stdId;
        this.stdName = stdName;
       
        
    }
    
    void regCourse1(String scode,String sname,String stype,int scredit){
        c1 = new Course(scode,sname,stype,scredit);
        StudentCourseList.add(c1);
        
    }
    void regCourse2(String scode,String sname,String stype,int scredit){
                c2 = new Course(scode,sname,stype,scredit);
        StudentCourseList.add(c2);
        
    }
    void regCourse3(String scode,String sname,String stype,int scredit){
                c3 = new Course(scode,sname,stype,scredit);
        StudentCourseList.add(c3);
        
    }
    
    
    
    
}
