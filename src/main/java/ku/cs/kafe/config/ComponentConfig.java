package ku.cs.kafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author 6510450291 Chutipong Triyasith
 */
@Configuration
public class ComponentConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
