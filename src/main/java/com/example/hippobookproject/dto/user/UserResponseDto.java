package com.example.hippobookproject.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserResponseDto<T> {
    private int code;
    private String msg;
    private T data;
}
