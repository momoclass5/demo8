package com.example.demo8.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo8.dto.BookDto;

/**
 * Spring IOC컨테이너를 생성하고 객체를 미리 생성해둡니다
 */
@SpringBootTest
public class BookMapperTests {
    @Autowired
    BookDto book;

    @Autowired
    BookMapper mapper;

    @BeforeEach
    public void before() {
        book.setB_no(null);
        book.setAuthor("작가명");
        book.setTitle("도서명");

    }

    /* Test 어노테이션이 붙어있는 메서드만 실행 */
    @Test
    public void selectBook() {
        BookDto book = mapper.selectBook("B00001");
        assertEquals(book.getTitle(), "오늘도맑음");

    }

    @Test
    void testDeleteBook() {

    }

    @Test
    void testInsertBook() {

        int res = mapper.insertBook(book);
        assertEquals(1, res);
    }

    @Test
    void testSelectBookList() {
        List<BookDto> list = mapper.selectBookList();
        assertEquals(127, list.size());

    }

    @Test
    void testSelectDate() {

    }

    @Test
    void testUpdateBook() {
        mapper.updateBook(null);

    }
}
