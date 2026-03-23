package kr.co.kpproject.kpcompany01.controller;

import kr.co.kpproject.kpcompany01.dto.SignupDto;
import kr.co.kpproject.kpcompany01.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class SignupController {

    private final SignupService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupDto dto) {
        userService.signup(dto);
        return "회원가입 성공";
    }
}
