package student;


public class Client {

    public static void main(String[] args) {
       
        IStudent student1 = new GraduateStudent("G001", "Jane Smith");

      
        ICourse course1 = new ConcreteCourse("CSE111", "Introduction to Computer Science n wtever");


        EnrollmentManager enrollmentManager = new EnrollmentManager();
     
        enrollmentManager.enrollStudentInCourse(student1, course1);

      
        System.out.println(student1.getName() + " enrolled in " + student1.getEnrolledCourses().get(0).getCourseName());
    }
}

