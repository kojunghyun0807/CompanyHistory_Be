package kr.co.kpproject.kpcompany01.entity;
/*
    고정현
    회원가입 entitiy
    26/03/25
*/
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "`USER`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignupEntity {

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
}
