package kodlama.io;

import kodlama.io.bussiness.CategoryManager;
import kodlama.io.bussiness.CourseManager;
import kodlama.io.bussiness.InstructorManager;
import kodlama.io.dataAccess.HibarneteCourseDao;
import kodlama.io.dataAccess.HibarneteInstructorDao;
import kodlama.io.dataAccess.JDBCCategoryDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

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

        Category category=new Category(1,"Software");
        Category category1=new Category(1,"Hardware");
       // Category category2=new Category(1,"Software");

        CategoryManager categoryManager=new CategoryManager(new JDBCCategoryDao());
        categoryManager.add(category);
        categoryManager.add(category1);
        //categoryManager.add(category2);

        for (Category cat : categoryManager.getAll()) {
            System.out.println(cat.getName());
        }

        Instructor instructor=new Instructor(1,"Deniz");
        Instructor instructor1=new Instructor(1,"Engin Demiroğ");
        Instructor instructor2=new Instructor(1,"Ali");

        InstructorManager instructorManager=new InstructorManager(new HibarneteInstructorDao());

        instructorManager.add(instructor);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

        for (Instructor instructr : instructorManager.getAll()) {
            System.out.println(instructr.getName());
        }
    }
}