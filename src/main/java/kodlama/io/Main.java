package kodlama.io;

import kodlama.io.bussiness.CourseManager;
import kodlama.io.dataAccess.HibarneteCourseDao;
import kodlama.io.entities.Course;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

        Course course = new Course(1, "java", 3);
        Course course1 = new Course(2, "c", 0);
        Course course2 = new Course(3, "java", 3);

        CourseManager courseManager = new CourseManager(new HibarneteCourseDao());
        courseManager.add(course);
        courseManager.add(course1);
        //courseManager.add(course2);

        for (Course cour : courseManager.getAll()) {
            System.out.println(cour.getName());
        }


    }
}