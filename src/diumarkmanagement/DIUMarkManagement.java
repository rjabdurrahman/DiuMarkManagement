
package diumarkmanagement;

import java.util.ArrayList;



public class DIUMarkManagement {


    public static void main(String[] args) { 
        
     ArrayList<Student> studentList = new ArrayList<>();
        
      // each student object
      
      Student s1 = new Student("162-35-1667","Mamun");
      Student s2 = new Student("160-35-1567","A.Razzak");
      
     // Add each student object in ArrayList
     
      studentList.add(s1);
      studentList.add(s2);
      
// student course info when registration Course
     // s1 subject info
     
      s1.regCourse1("111","java","Lab base",4);
      s1.regCourse2("112","Datastructure","Lab base",4);
      s1.regCourse3("113","Testing","Theory base",3);
      
    // s2 subject info
    
      s2.regCourse1("111","java","Lab base",4);
      s2.regCourse3("113","Testing","Theory base",3);
      s2.regCourse2("112","Datastructure","Lab base",4);
      
      
      // teacher assign for which course & Marks input
      
      Teacher t1 = new Teacher("A K Kamrul","SL4657");
              t1.courseT1("111","java");
              //Teacher mark add
              t1.marksInput(studentList,t1);
      Teacher t2 = new Teacher("DR. Ali","ASoL4677");
              t2.courseT1("112","Datastructure");
              //Teacher mark add
              t2.marksInput(studentList,t2);
      Teacher t3 = new Teacher("A.razzak","SL465657");
              t3.courseT1("113","Testing");
              //Teacher mark add
              t3.marksInput(studentList,t3);
              
              
       
      // Admin
     
      Admin ad = new  Admin();
    ad.calculateCGPA_AllStudent(studentList);
    ad.checkMarks(studentList);
    ad.salaryAprovemrnt(studentList,t1);
    ad.salaryAprovemrnt(studentList,t2);
    ad.salaryAprovemrnt(studentList,t3);

       
     }
    
}
