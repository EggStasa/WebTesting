package KRCPK.WebTesting.controllers;

import KRCPK.WebTesting.model.Questions;
import KRCPK.WebTesting.repo.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuestionsController {
    @Autowired
    private QuestionsRepository questionsRepository;;

    @GetMapping("login")
    public String showLoginPage(Model model) {
        model.addAttribute("title", "Login");
        return "login";
    }

    @GetMapping("/tests")
    public String showtests(Model model) {
        Iterable<Questions> questions = questionsRepository.findAll();
        model.addAttribute("questions", questions);
        return "test-page";
    }

    @PostMapping("/tests")
    public String tests(Model model) {
        Iterable<Questions> questions = questionsRepository.findAll();
        model.addAttribute("questions", questions);
        return "test-page";
    }



}
