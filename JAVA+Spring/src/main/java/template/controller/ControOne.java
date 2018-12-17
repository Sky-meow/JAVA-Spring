package template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;


@Controller
public class ControOne {
    @GetMapping()
    public String getOne(){
        System.out.println(23);
        return "home";
    }
}
