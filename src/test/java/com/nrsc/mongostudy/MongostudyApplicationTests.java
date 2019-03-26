package com.nrsc.mongostudy;

import com.nrsc.mongostudy.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongostudyApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void testSave() {
        Book book = new Book();
        //id不写mongo会自动生成_id,如果写了会用我们自己写的
        //book.setId("3");
        book.setName("新华字典");
        book.setInfo("好书啊");
        //注意如果用new BigDecimal(22.9900001)无法完成转换---异常有兴趣的可以自己看一下
        book.setPrice(BigDecimal.valueOf(22.9900001));
        book.setPublish("新华出版社");
        mongoTemplate.save(book);
    }

    @Test
    public void testQueryAll() {
        List<Book> all = mongoTemplate.findAll(Book.class);
        System.err.println(all);
    }

}
