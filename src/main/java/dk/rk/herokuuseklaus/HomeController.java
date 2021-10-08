package dk.rk.herokuuseklaus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/site")
    public String site(){
        return "site";
    }

    @GetMapping("/shout")
    public String shout(){
        return "greet";
    }

}
