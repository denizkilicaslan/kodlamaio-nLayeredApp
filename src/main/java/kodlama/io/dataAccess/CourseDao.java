package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    List<Course> getAll();
}
