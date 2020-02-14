package com.example.demo.service;

import com.example.demo.domain.Role;
import com.example.demo.domain.entity.MemberEntity;
import com.example.demo.domain.repository.MemberRepository;
import com.example.demo.dto.MemberDto;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MemberService {
    @Transactional
    public Long reg(MemberDto mdto) {
        return MemberRepository.reg(MemberDto.toEntity()).getId();
    }
//    // 회원가입 시, 유효성 체크
//    public Map<String, String> validateHandling(Errors errors) {
//        Map<String, String> validatorResult = new HashMap<>();
//
//        for (FieldError error : errors.getFieldErrors()) {
//            String validKeyName = String.format("valid_%s", error.getField());
//            validatorResult.put(validKeyName, error.getDefaultMessage());
//        }
//
//        return validatorResult;
//    }
//
//    // 회원가입
//    public void signUp(MemberDto memberDto) {
//        // 회원 가입 비즈니스 로직 구현
//    }
//    private MemberRepository memberRepository;
//
//    @Transactional
//    public Long joinUser(MemberDto memberDto) {
//        // 비밀번호 암호화
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        memberDto.setPassword(passwordEncoder.encode(memberDto.getPassword()));
//
//        return memberRepository.save(memberDto.toEntity()).getId();
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
//        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(userEmail);
//        MemberEntity userEntity = userEntityWrapper.get();
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//
//        if (("admin@example.com").equals(userEmail)) {
//            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
//        } else {
//            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
//        }
//
//        return new User(userEntity.getEmail(), userEntity.getPassword(), authorities);
//    }


}
