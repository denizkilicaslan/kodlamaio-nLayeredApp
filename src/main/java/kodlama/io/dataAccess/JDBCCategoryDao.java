package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JDBCCategoryDao implements CategoryDao{

    List<Category> categoryList;

    public JDBCCategoryDao(){
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
