package kr.co.kpproject.kpcompany01.controller;
/*
    고정현
    회원가입 controller
    26/03/25
*/
import kr.co.kpproject.kpcompany01.dto.SignupDto;
import kr.co.kpproject.kpcompany01.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/`USER`")
public class SignupController {

    private final SignupService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupDto dto) {
        userService.signup(dto);
        return "회원가입 성공";
    }
}