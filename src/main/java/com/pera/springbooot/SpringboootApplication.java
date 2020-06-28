package com.pera.springbooot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringboootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboootApplication.class, args);
    }

    @RequestMapping(value={"","/index"})
    public String index(Model model) {
        model.addAttribute("msg","欢迎使用spring boot");
        return "index";
    }

}
