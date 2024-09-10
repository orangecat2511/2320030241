package student;

import java.util.*;

public abstract class Student implements IStudent{
           private String id;
           private String name;
           private List<ICourse> enrolledCourses;
           
           public Student(String id, String name) {
        	   this.id=id;
        	   this.name=name;
        	   this.enrolledCourses=new ArrayList<>();
           }
           
           public String getID() {
        	   return id;
           }
           
           public String getName() {
        	   return name;
           }
           public void enrolledInCourse(ICourse course) {
        	   enrolledCourses.add(course);
           }
           public List<ICourse> getEnrolledCourse(){
        	   return enrolledCourses;
           }
}
