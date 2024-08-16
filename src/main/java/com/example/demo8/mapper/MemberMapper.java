package com.example.demo8.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo8.dto.MemberDto;

@Mapper
public interface MemberMapper {

    MemberDto selectMember(String m_no);

    List<MemberDto> selectMemberList();
}
