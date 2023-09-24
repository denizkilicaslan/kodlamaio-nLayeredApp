package kodlama.io.bussiness;

import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

import java.io.StringReader;
import java.util.List;
import java.util.Objects;

public class CourseManager {

    private CourseDao courseDao;

    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }


    /*
    Kurs ismi tekrar edemez
Kategori ismi tekrar edemez
Bir kursun fiyatı 0 dan küçük olamaz
     */
    public void add(Course course) throws Exception {
        if (course.getPrice()<0){
            throw new Exception(" Kursun fiyatı 0 dan küçük olamaz");
        }

        for(Course course1:getAll()){
            if (Objects.equals(course.getName(), course1.getName())){
                throw new Exception(" Kurs zaten mevcut");
            }
        }

        courseDao.add(course);
        System.out.println("kurs eklendi");

    }


    public List<Course> getAll(){
        return courseDao.getAll();
    }


}
