package com.example.demo8.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * setter, getter, toString, constructor(생성자) 자동완성
 */
@Data
@Component
public class BookDto {
    String b_no;
    String title;
    String author;
    String price;
    String p_no;
    String rentyn;
    String delyn;
    String regdate;
}
