package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JDBCCourseDao implements CourseDao{

    List<Course> courseList;

    public JDBCCourseDao() {
        this.courseList=new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
        System.out.println("added to JDBC");
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }
}
