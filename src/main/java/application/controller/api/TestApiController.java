package application.controller.api;

import application.data.model.Category;
import application.data.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/test")
public class TestApiController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/detail/{id}")
    public String getCategoryInfo(@PathVariable Integer id) {
        Category category = categoryService.findOne(id);
        System.out.println(category);
        return category.getName();
    }

}
