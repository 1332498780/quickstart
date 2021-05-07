package cn.hzy.demo.test;

import cn.hzy.demo.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest(classes = {Application.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class C3p0Test {

    @Autowired
    private DataSource dataSource;

    @Test
    public void c3p0Test() throws SQLException {
//        System.out.println(dataSource.getConnection());
    }
}
