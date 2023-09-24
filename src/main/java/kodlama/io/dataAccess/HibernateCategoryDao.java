package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    List<Category> categoryList;

    public HibernateCategoryDao(){
        categoryList=new ArrayList<>();
    }

    @Override
    public void add(Category category) {
        categoryList.add(category);
        System.out.println("Category added to JDBC");
    }

    @Override
    public List<Category> getAll() {
        return categoryList;
    }
}
