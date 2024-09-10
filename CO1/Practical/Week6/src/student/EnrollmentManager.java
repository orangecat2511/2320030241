package student;

public class EnrollmentManager {
    public void enrollStudentInCourse(IStudent student, ICourse course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }
}
