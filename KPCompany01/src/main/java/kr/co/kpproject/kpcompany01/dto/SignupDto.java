package kr.co.kpproject.kpcompany01.dto;
/*
    고정현
    회원가입 dto
    26/03/25
*/
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupDto {
    private String id;
    private String username;
    private String password;
    private String email;
}