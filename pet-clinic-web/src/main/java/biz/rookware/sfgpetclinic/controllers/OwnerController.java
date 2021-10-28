package biz.rookware.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {
    
    @GetMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owner/index";
    }
}
