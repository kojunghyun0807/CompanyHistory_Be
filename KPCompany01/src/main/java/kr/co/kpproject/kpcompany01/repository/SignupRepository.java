package kr.co.kpproject.kpcompany01.repository;
/*
    고정현
    회원가입 repository
    26/03/25
*/
import kr.co.kpproject.kpcompany01.entity.SignupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SignupRepository extends JpaRepository<SignupEntity, Long> {
<<<<<<< Updated upstream
    Optional<SignupEntity> findByUserId(String userId);
=======
    Optional<SignupEntity> findByUserId(String Id);
>>>>>>> Stashed changes
    Optional<SignupEntity> findByEmail(String email);
}