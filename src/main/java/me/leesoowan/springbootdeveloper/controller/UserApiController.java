package me.leesoowan.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.leesoowan.springbootdeveloper.dto.AddUserRequest;
import me.leesoowan.springbootdeveloper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request) {
        userService.save(request); //회원 가입 메서드 호출
        return "redirect:/login";  //회원 가입이 완료된 이후에 로그인 페이지로 이동
    }
}
