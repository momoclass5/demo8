package com.example.demo8.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MemberDto {
    private String m_no;
    private String id;
    private String pw;
    private String name;
    private String gender;
    private String addr;
    private String phone;
    private String delyn;
    private String regdate;
}
