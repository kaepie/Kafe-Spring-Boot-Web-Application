package ku.cs.kafe.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author 6510450291 Chutipong Triyasith
 */
@Data
public class CategoryRequest {


    @NotBlank
    private String name;


}
