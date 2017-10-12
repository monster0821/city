package com.meihao.web.rest;

import com.meihao.domain.Book;
import com.meihao.repository.BookRepository;
import com.meihao.service.BookService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.web.bind.annotation.*;

/**
 * Created by monster on 2017/10/12.
 */
@RestController
@RequestMapping("/book")
@Slf4j
@AllArgsConstructor
public class BookController {

    private BookRepository bookRepository;

    @ApiOperation("根据id获取图书")
    @RequestMapping(value = "/getBookById", method = RequestMethod.GET)
    public Book getBookById(@RequestParam("id") String id) {
                return bookRepository.findById(id);
            }
    @RequestMapping("/add")
    @Test
    public void add(){

       Book book1 = new Book();
       book1.setName("aaa");
       book1.setAuthor("AAA");
        bookRepository.add(book1);
       book1.setPrice(88);



    }
}
