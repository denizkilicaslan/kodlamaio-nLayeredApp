package kodlama.io.bussiness;

import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        System.out.println("instructor added");
    }

    public List<Instructor> getAll(){
       return instructorDao.getAll();
    }
}
