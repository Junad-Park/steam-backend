package com.clonecoding.steam.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExceptionMessages {

    INVALID_TOKEN("엑세스 토큰이 올바르지 않습니다."),
    EXPIRED_TOKEN("토큰이 만료되었습니다."),
    LOGIN_FAILURE("아이디 또는 비밀번호가 잘못되었습니다.");
    private String message;


}
