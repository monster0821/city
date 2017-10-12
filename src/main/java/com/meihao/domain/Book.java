package com.meihao.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created by monster on 2017/10/12.
 */
public class Book {
    @Getter
    @Setter
    @Id
    protected String id;
    /**
     * 图书名称
    */
    @Getter
    @Setter
    protected String name;
    /**
    * 图书价格
    */
    @Getter
    @Setter
    protected double price;

    /**
     * 图书作者
     */
    @Getter
    @Setter
    protected String author;

    @Override
    public String toString() {
        return super.toString();
    }
}


