package com.example.demo8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo8.dto.BookDto;
import com.example.demo8.service.BookService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/book/bookList")
    public String selectBookList(Model model) {
        List<BookDto> list = service.selectBookList();
        model.addAttribute("list", list);
        // model.addAttribute("list", service.selectBookList());

        // 화면에서 보여줄 데이터를 담는 객체
        model.addAttribute("title", "도서목록");
        return "book/bookList";
    }

    /**
     * 상세 페이지
     * 
     * 요청경로와 반환값이 동일 한 경우, return 문은 생략이 가능하다
     * 
     * @param param
     * @return
     */
    @GetMapping("/book/bookDetail")
    public void getMethodName() {

    }

}
