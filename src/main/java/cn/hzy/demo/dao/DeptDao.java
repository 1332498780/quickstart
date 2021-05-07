package cn.hzy.demo.dao;

import cn.hzy.demo.model.DDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptDao extends JpaRepository<DDept, Integer> {

}
