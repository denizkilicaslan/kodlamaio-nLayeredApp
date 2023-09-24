package kodlama.io.bussiness;

import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

import java.util.List;
import java.util.Objects;

public class CategoryManager {
    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }


    public void add(Category category) throws Exception {

        for (Category category1 : getAll()) {
            if (Objects.equals(category.getName(), category1.getName())) {
                throw new Exception(" Kategori zaten mevcut");
            }
        }
        categoryDao.add(category);
        System.out.println("Kategori eklendi");
    }

    public List<Category> getAll() {
        return categoryDao.getAll();
    }


}
