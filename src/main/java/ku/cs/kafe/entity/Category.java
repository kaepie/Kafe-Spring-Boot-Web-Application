package ku.cs.kafe.entity;


import jakarta.persistence.*;
import lombok.Data;


import java.util.List;
import java.util.UUID;

/**
 * @author 6510450291 Chutipong Triyasith
 */
@Data
@Entity
public class Category {


    @Id
    @GeneratedValue
    private UUID id;


    private String name;


    @OneToMany(mappedBy = "category")
    List<Menu> menus;
}
