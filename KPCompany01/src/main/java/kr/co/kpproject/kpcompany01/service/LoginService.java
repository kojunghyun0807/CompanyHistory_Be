package kr.co.kpproject.kpcompany01.service;

import kr.co.kpproject.kpcompany01.dto.LoginRequestDto;
import kr.co.kpproject.kpcompany01.entity.User;
import kr.co.kpproject.kpcompany01.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class LoginService {

    private final UserRepository userRepository;

    public boolean login(LoginRequestDto loginRequestDto) {
        // userid로 사용자 조회

        User user = userRepository
                .findByUserId(loginRequestDto.getUserId())
                .orElse(null);

        if (user == null) {
            return false; // id 없음

        }
        if (!user.getPassword().equals(loginRequestDto.getPassword())) {
            return false; //   비번 틀림
        }
        return true; // 로그인 성공
    }
}

