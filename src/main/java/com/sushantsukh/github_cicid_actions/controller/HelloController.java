package com.sushantsukh.github_cicid_actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    /*echo "# github-actions-example" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/sushantsukh/github-actions-example.git
    git push -u origin main*/
}
