package com.mysite.sbb.thymeleaf;

import com.mysite.sbb.question.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class test01 {

    @GetMapping("/linktest")
    public String basicLinkTest(Model model) {
        //링크예제
        model.addAttribute("post", "post-reply");
        model.addAttribute("place", "place-reply");

        //th:each예제
        List<Object> replyList = new ArrayList<>();
        replyList.add("댓글1");
        replyList.add("댓글2");
        replyList.add("댓글3이에요");
        model.addAttribute("replyList", replyList);


        return "thymeleaf/thymeleaf01";
    }

    //fragment 예제
    @GetMapping("/layout-test")
    public String test01() {

        return "thymeleaf/layout-main";
    }
}
