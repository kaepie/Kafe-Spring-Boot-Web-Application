package ku.cs.kafe.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

/**
 * @author 6510450291 Chutipong Triyasith
 */
@Data
public class MenuRequest {

    @NotBlank
    private String name;


    @NotBlank
    private String categoryName;


    @Positive
    private double price;
}
