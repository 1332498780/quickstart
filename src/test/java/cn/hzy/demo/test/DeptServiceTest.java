package cn.hzy.demo.test;


import cn.hzy.demo.Application;
import cn.hzy.demo.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DeptServiceTest {

    @Autowired
    private DeptService deptService;

    @Test
    public void deptTest(){
        System.out.println(deptService.findAll());
    }

}
