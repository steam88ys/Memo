package kr.hs.study.Memo.controller;

import kr.hs.study.Memo.dto.WriteDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WriteController {
    @GetMapping("/write")
    public String write() {
        return "write_form";
    }

    @PostMapping("/write_form")
    public String write(@ModelAttribute WriteDto t, Model model) {
        model.addAttribute("title", t.getTitle());
        model.addAttribute("content", t.getContent());
        model.addAttribute("writer", t.getWriter());
        return "result";
    }
}
