package kr.co.kpproject.kpcompany01.controller;

/*
*   이름 : 박효빈
*   날짜 : 26/03/25
*   내용 : 로그인 컨트롤러 생성
* */

import kr.co.kpproject.kpcompany01.dto.LoginRequestDto;
import kr.co.kpproject.kpcompany01.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/login")
public class LoginController {
    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginRequestDto loginRequestDto) {

        boolean result = loginService.login(loginRequestDto);

        if (result) {
            return ResponseEntity.ok("로그인 성공");
        }
        else {
            return   ResponseEntity.badRequest().body("ID, Password 오류");
        }

    }
}
