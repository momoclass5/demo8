package com.example.demo8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo8.dto.MemberDto;
import com.example.demo8.mapper.MemberMapper;

@Service
public class MemberService {
    @Autowired
    MemberMapper mapper;

    public List<MemberDto> selectMemberList() {
        return mapper.selectMemberList();
    }

    /**
     * 사용자로 부터 전달받은 사용자 번호를 매개변수로 전달
     * 
     * @param m_no
     * @return
     */
    public MemberDto selectMember(String m_no) {
        return mapper.selectMember(m_no);
    }

}
