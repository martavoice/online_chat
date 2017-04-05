package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Марта on 03.04.2017.
 */

@Controller
public class WelcomeController {

    private int visitorCount = 0;

    @RequestMapping("/index.html")
    public String index(Model model) {
        model.addAttribute("visitorCount", visitorCount++);
        return "WEB-INF/jsp/index.jsp";
    }

}
