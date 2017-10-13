package com.meihao.web.rest;

import com.meihao.domain.Book;
import com.meihao.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by monster on 2017/10/12.
 */
@RestController
@RequestMapping("/book")
@Slf4j
@AllArgsConstructor
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    /**
     * 添加图书
     */

    @PostMapping(value = "/save")
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    /**
     * 根据id查询图书
     */
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public Book findById(@RequestParam String id) {
        return bookRepository.findById(id);
    }

    /**
     * 显示所有图书
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    /**
     * 根据id删除图书
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delete(@RequestParam String id) {
        bookRepository.delete(id);
    }

}
