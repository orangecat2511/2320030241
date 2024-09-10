package student;

import java.util.*;


public abstract class Course implements ICourse {
    private String courseId;
    private String courseName;
    private List<IStudent> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    
    public String getCourseId() {
        return courseId;
    }

   
    public String getCourseName() {
        return courseName;
    }

    
    public void enrollStudent(IStudent student) {
        enrolledStudents.add(student);
    }

    public List<IStudent> getEnrolledStudents() {
        return enrolledStudents;
    }
}
