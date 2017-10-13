package com.meihao.repository;

import com.meihao.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by monster on 2017/10/12.
 */
public interface BookRepository extends MongoRepository<Book, String>, Serializable {


    // public List<Book> findById(String id);
    /**
     * 添加图书
     */
    // public Book save(Book book);
/*
    */

    /**
     * 根据id删除
     */

    public void delete(String id);


    /**
     * 根据id查询
     */

    public Book findById(String id);

    /**
     * 查询所有
     */


    public List<Book> findAll();

}
