package com.example.demo8.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo8.dto.BookDto;

@Mapper
public interface BookMapper {

    // 반환타입 메서드명();
    @Select("select sysdate from dual")
    String selectDate();

    // 도서목록 조회
    List<BookDto> selectBookList();

    // 도서 상세정보(1건) 조회
    @Select("select * from tb_book where b_no = #{b_no}")
    BookDto selectBook(String b_no);

    // 도서 입력
    int insertBook(BookDto dto);

    // 도서 수정
    int updateBook(BookDto dto);

    // 도서 삭제
    @Delete("delete from tb_book where b_no = #{b_no}")
    int deleteBook(String b_no);

}
