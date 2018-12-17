package template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import template.mapper.PetCategoryMapper;


@Controller
public class ControOne {
    @Autowired
    PetCategoryMapper petCategoryMapper;

    @GetMapping()
    public String getOne(){
        System.out.println(23);
        return "home";
    }
}
