package kr.co.kpproject.kpcompany01.dto;

import lombok.Getter;
import lombok.Setter;
/*
 *   이름 : 박효빈
 *   날짜 : 26/03/25
 *   내용 : 로그인 dto(request) 생성
 * */
@Getter
@Setter
public class LoginRequestDto {

    private String userId;
    private String password;
}
