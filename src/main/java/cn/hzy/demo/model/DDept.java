package cn.hzy.demo.model;

import javax.persistence.*;

@Entity
@Table(name="dept")
@Cacheable(false)
public class DDept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deptno")
    private int deptNo;
    @Column(name = "dname")
    private String dName;

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString(){
        return "[deptNo:"+deptNo+",dname:"+dName+"]";
    }
}
