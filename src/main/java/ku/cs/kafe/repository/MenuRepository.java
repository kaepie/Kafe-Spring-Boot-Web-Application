package ku.cs.kafe.repository;


import ku.cs.kafe.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

/**
 * @author 6510450291 Chutipong Triyasith
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
}
