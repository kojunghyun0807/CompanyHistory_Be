package kr.co.kpproject.kpcompany01.repository;

import kr.co.kpproject.kpcompany01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
/*
 *   이름 : 박효빈
 *   날짜 : 26/03/25
 *   내용 : 유저 레포지토라 생성
 * */
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUserId(String  userId);
}
