
package diumarkmanagement;

public class Course {
    String name;
    String idCode;
    String type;
    int credit;
    int marks;
    double gpa;
    
    // consyructor
    
    Course(String idCode,String name,String type,int credit){
        this.idCode = idCode;
        this.name = name;
        this.type = type;
        this.credit = credit;
        
    }
    
}
