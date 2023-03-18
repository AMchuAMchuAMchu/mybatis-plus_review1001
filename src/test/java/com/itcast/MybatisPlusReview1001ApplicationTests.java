package com.itcast;

import com.itcast.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusReview1001ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

        userDao.selectList(null).forEach(System.out::println);

    }

}
