package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    List<Category> getAll();

}
