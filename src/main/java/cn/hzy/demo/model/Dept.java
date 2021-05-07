package cn.hzy.demo.model;

public class Dept {

    private int deptNo;
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
