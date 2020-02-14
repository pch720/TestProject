package com.example.demo.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.nio.file.FileStore;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(length = 50, nullable = false, unique = true)
    private String nickname;

    @Column(length = 50, nullable = false)
    private Long name;

    @Column(length = 256, nullable = false)
    private String email;

    @Column(length = 256, nullable = false)
    private String password;

    @Column(length = 256, nullable = false)
    private Date regdate;
    @Builder
    public MemberEntity(Long name,String nickname, String email, String password) {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.regdate = regdate;
    }
}