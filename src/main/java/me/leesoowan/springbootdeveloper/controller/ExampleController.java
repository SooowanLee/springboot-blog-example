package me.leesoowan.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨트롤러라는 것을 명시적으로 표현
public class ExampleController {

    @GetMapping("/thymeleaf/example")
    public String thymeleafExample(Model model) { //뷰로 데이터를 넘겨주는 모델 객체

    }
}
