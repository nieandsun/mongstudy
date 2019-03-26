package com.nrsc.mongostudy.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;
@Data
public class Book {
    @Id
    private String id;
    /**书名*/
    private String name;
    /** 价格*/
    private BigDecimal price;
    /**简介*/
    private String info;
    /**出版社*/
    private String publish;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", publish='" + publish + '\'' +
                '}';
    }
}
