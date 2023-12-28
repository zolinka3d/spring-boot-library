package com.zofia.tokarczyk.uni.controller;

import com.zofia.tokarczyk.uni.entity.Book;
import com.zofia.tokarczyk.uni.service.BookServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private BookServiceImpl bookService;
    @Autowired
    public BookController(BookServiceImpl theBookService) {
        bookService = theBookService;
    }

    // post a book
    @PostMapping("/save")
    public String saveBook(
            @Valid @ModelAttribute("book") Book theBook,
                           BindingResult theBindingResult, Model theModel) {
        if (theBindingResult.hasErrors()){
            return "admin";
        }
        bookService.save(theBook);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteBook(@RequestParam("bookId") int theId){

        // delete the employee
        bookService.deleteById(theId);
        // redirect to the start page controller
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("bookId") int theId,
                                    Model theModel){
        Book theBook = bookService.findById(theId);
        theModel.addAttribute("book", theBook);
        return "admin";
    }


}
