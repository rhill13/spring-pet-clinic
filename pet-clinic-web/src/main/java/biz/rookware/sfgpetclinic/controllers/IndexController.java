package biz.rookware.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"","/", "index", "index.html"})
public class IndexController {
    
    @GetMapping
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}
