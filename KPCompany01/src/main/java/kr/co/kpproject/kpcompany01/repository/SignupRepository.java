package kr.co.kpproject.kpcompany01.repository;

import kr.co.kpproject.kpcompany01.entity.SignupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SignupRepository extends JpaRepository<SignupEntity, Long> {
    Optional<SignupEntity> findByUserid(String userid);
    Optional<SignupEntity> findByEmail(String email);
}