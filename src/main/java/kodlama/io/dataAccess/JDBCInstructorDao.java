package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JDBCInstructorDao implements InstructorDao{

    List<Instructor> instructorList;

    public JDBCInstructorDao() {
        instructorList = new ArrayList<>();
    }

    @Override
    public void add(Instructor instructor) {

        instructorList.add(instructor);
    }

    @Override
    public List<Instructor> getAll() {
        return instructorList;
    }
}
