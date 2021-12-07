package dev.spring.springboot.devspringspringboot.devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class devToolsController {

    @GetMapping("/devtoolstest")
    public String devToolsTest(Model model) throws Exception{
        model.addAttribute("test1","테스트후1");
        model.addAttribute("test2","테스트후2");
        model.addAttribute("test3","테스트후3");
        return "devToolsTest/test";
    }
}
