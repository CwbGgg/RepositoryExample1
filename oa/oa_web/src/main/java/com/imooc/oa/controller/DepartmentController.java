package com.imooc.oa.controller;

import com.imooc.oa.biz.DepartmentBiz;
import com.imooc.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("departmentController")   //部门模块的数据控制层******************
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentBiz departmentBiz;
    //业务层调用dao层,dao接口实现sql映射文件.xml 中的具体功能--实现具体功能的模块

    @RequestMapping("/list")
    public String list(Map<String,Object> map){     //得到全部的部门信息记录
        map.put("list",departmentBiz.getAll());
        return "department_list";
    }

    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){ //跳转到去add的页面
        map.put("department",new Department());
        return "department_add";
    }
    @RequestMapping("/add")
    public String add(Department department){ //实现添加部门信息的处理模块
        departmentBiz.add(department);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "sn") //进行过滤，强制要求参数
    public String toUpdate(String sn,Map<String,Object> map){ //跳转到去Update的页面
        map.put("department",departmentBiz.get(sn));
        return "department_update";
    }
    @RequestMapping("/update")
    public String update(Department department){  //实现部门信息修改的处理模块
        departmentBiz.edit(department);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove",params = "sn") //进行过滤，强制要求参数
    public String remove(String sn){   //实现删除部门记录的处理模块
        departmentBiz.remove(sn);
        return "redirect:list";
    }
}
