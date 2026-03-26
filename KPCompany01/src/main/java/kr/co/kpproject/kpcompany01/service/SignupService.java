package kr.co.kpproject.kpcompany01.service;
/*
    고정현
    회원가입 service
    26/03/25
*/
import kr.co.kpproject.kpcompany01.dto.SignupDto;
import kr.co.kpproject.kpcompany01.entity.SignupEntity;
import kr.co.kpproject.kpcompany01.repository.SignupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final SignupRepository signupRepository;

    public void signup(SignupDto dto) {


        if (signupRepository.findByUserId(dto.getUserId()).isPresent()) {

            throw new RuntimeException("이미 존재하는 아이디입니다.");
        }

        if (signupRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("이미 존재하는 이메일입니다.");
        }

        String encodedPassword = dto.getPassword(); // 암호화 없이 평문 저장

        SignupEntity user = SignupEntity.builder()
                .id(dto.getUserId())
                .username(dto.getUsername())
                .password(encodedPassword)
                .email(dto.getEmail())
                .build();

        signupRepository.save(user);
    }
}