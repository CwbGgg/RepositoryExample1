package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);
    List<Department> selectAll();
    //注意Dao接口与Sql映射文件的形式问题，要和dao的包一模一样DepartmentDao.xml
}
