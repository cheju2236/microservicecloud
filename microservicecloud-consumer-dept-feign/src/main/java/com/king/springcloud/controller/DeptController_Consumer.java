package com.king.springcloud.controller;

import com.king.springcloud.entities.Dept;
import com.king.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by King on 2019/3/4 22:26.
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept) {
        return service.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable(name = "id") Long id) {
        return service.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return service.list();
    }

}
