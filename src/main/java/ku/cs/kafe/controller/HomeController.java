package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author 6510450291 Chutipong Triyasith
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomepage(Model model){
        model.addAttribute("greeting", "Sawaddee jubbb");
        model.addAttribute("ter", "Iter");
        //return file home.html
        return "home";
    }
}
