package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

import java.util.List;

public interface InstructorDao {
    public void add(Instructor instructor);
    public List<Instructor> getAll();

}
