package KRCPK.WebTesting.controllers;

import KRCPK.WebTesting.model.Tests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    private KRCPK.WebTesting.repo.TestsRepository TestsRepository;

    @GetMapping("/tests")
        public String tests(Model model){
            Iterable<Tests> tests = TestsRepository.findAll();
        System.out.println(tests);
            model.addAttribute("tests", tests);
            return "test-page";
        }
    }

