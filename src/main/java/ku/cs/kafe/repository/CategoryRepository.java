package ku.cs.kafe.repository;


import ku.cs.kafe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

/**
 * @author 6510450291 Chutipong Triyasith
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    Category findByName(String name);
}
