package dev.drugowick.springthymeleafvuecrudexample.web.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The main controller returns the Home Page
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
