package student;

import java.util.List;

public interface ICourse {
       String getCourseID();
       String getCourseName();
       void enrollStudent(IStudent student);
       List<IStudent> getEnrolledStudents();
}
