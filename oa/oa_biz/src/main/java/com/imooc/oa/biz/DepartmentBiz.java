package com.imooc.oa.biz;

import com.imooc.oa.entity.Department;

import java.util.List;
//这是业务逻辑层***********************
public interface DepartmentBiz {

    public void add(Department department);

    public void edit(Department department);

    public void remove(String sn);

    public Department get(String sn);

    List<Department> getAll();
}
