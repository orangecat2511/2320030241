package student;

import java.util.*;

public interface IStudent {
       String getID();
       String getName();
       void enrollInCourse(ICourse course);
       List<ICourse> getEnrolledCourses();
}
