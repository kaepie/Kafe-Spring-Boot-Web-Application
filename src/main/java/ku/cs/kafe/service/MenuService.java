package ku.cs.kafe.service;
import java.util.UUID;

import ku.cs.kafe.entity.Category;
import ku.cs.kafe.entity.Menu;
import ku.cs.kafe.request.MenuRequest;
import ku.cs.kafe.repository.MenuRepository;
import ku.cs.kafe.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author 6510450291 Chutipong Triyasith
 */
@Service
public class MenuService {


    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;


    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public Menu getOneById(UUID id) {
        return menuRepository.findById(id).get();
    }

    public void createMenu(MenuRequest request) {
        Menu record = modelMapper.map(request, Menu.class);
        Category category =
                categoryRepository.findByName(request.getCategoryName());
        record.setCategory(category);
        menuRepository.save(record);
    }
}

