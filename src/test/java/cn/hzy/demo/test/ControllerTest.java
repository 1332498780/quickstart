package cn.hzy.demo.test;

import cn.hzy.demo.Application;
import cn.hzy.demo.controller.MyController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ControllerTest {

    @Autowired
    private Application application;

    @Autowired
    private MyController myController;

    @Test
    public void helloTest(){
//        TestCase.assertEquals(application.test(),"hello");
    }
}
