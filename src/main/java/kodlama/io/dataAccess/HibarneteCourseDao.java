package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibarneteCourseDao implements CourseDao{

    List<Course> courseList;

    public HibarneteCourseDao () {
        this.courseList=new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
        System.out.println("added to Hibernate");
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }
}
