package cn.hzy.demo.service;

import cn.hzy.demo.controller.MyController;
import cn.hzy.demo.dao.DeptDao;
import cn.hzy.demo.mapper.DeptMapper;
import cn.hzy.demo.model.DDept;
import cn.hzy.demo.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptMapper;

    @Override
//    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_UNCOMMITTED)
    public void insert() {
        DDept dDept = deptMapper.findOne(1);
        dDept.setdName("hhhh111");
        deptMapper.saveAndFlush(dDept);
//        try {
//            Thread.sleep(1000*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_UNCOMMITTED)
    public String findAll() {
        DDept dDept = deptMapper.findOne(1);
        String name = dDept.getdName();
        System.out.println(name);
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        DDept dDept1 = deptMapper.findOne(1);
        System.out.println(dDept==dDept1);
        return String.valueOf(dDept1.getdName().equals(name));
    }


}
