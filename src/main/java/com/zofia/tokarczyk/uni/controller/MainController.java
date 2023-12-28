package com.zofia.tokarczyk.uni.controller;

import com.zofia.tokarczyk.uni.entity.Book;
import com.zofia.tokarczyk.uni.service.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private BookServiceImpl bookService;

    public MainController(BookServiceImpl theBookService) {
        bookService = theBookService;
    }

    @GetMapping("/")
    public String showStarter(Model model) {
        // get all books
        model.addAttribute("books", bookService.findAll());

        return "start";
    }

    @GetMapping("/admin")
    public String showAdminPanel(Model model) {
        // post a book
        Book theBook = new Book();
        model.addAttribute("book", theBook);
        return "admin";
    }
    @GetMapping("/home")
    public String showHome() {

        return "home";
    }


    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

    // add request mapping for /systems

    @GetMapping("/systems")
    public String showSystems() {

        return "systems";
    }

}









