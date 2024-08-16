package com.example.demo8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo8.dto.MemberDto;
import com.example.demo8.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemberController {

    @Autowired
    MemberService service;

    @GetMapping("/member/memberList")
    public void getMethodName(Model model) {
        List<MemberDto> list = service.selectMemberList();

        log.info(list.toString());
        // 화면에 출력 하기위해 사용자 목록을 Model객체에 담아줍니다!!!
        model.addAttribute("list", list);

        log.info("/member/memberList");
    }

    /**
     * 사용자 정보를 조회 하기 위해서
     * 사번을 받아 옵니다.
     * 
     * @param m_no
     */
    @GetMapping("/member/memberDetail")
    public void getMethodName(@RequestParam(required = false, name = "m_no") String m_no, Model model) {
        log.info("/member/memberDetail");
        log.info("m_no : " + m_no);
        if (m_no == null) {
            model.addAttribute("msg", "사용자번호가 존재하지 않습니다.");
            return;
        }

        MemberDto member = service.selectMember(m_no);

        // 조회된 사용자 정보를 화면에 전달
        model.addAttribute("member", member);

    }

    @GetMapping("/member/memberWrite")
    public void getMethodName() {
        log.info("/member/memberWrite");
    }

    @GetMapping("/member/bookWrite")
    public void getMethodName1() {
        log.info("/member/memberWrite");
    }
}
