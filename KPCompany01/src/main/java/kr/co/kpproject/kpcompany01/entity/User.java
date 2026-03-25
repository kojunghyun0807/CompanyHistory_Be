package kr.co.kpproject.kpcompany01.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "`USER`") // USER는 예약어라서 백틱 중요
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
/*
 *   이름 : 박효빈
 *   날짜 : 26/03/25
 *   내용 : 유저 엔티티 생성
 * */
public class User {

    @Id
    @Column(length = 45)
    private String id;   // 로그인 ID (PK)

    @Column(nullable = false, length = 16)
    private String username;

    @Column(name = "userid", nullable = false, unique = true)
    private String userId;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "create_time")
    private LocalDateTime createTime;
}