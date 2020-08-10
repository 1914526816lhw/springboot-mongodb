package com.mongodb.controller;

import com.mongodb.dao.TestDao;
import com.mongodb.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：TestController
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/8/9 19:11
 * @version 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private TestDao testDao;

    @RequestMapping("/save")
    public void save(Long id,String title,String describe,String byUser,String url){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(id);
        testEntity.setTitle(title);
        testEntity.setDescribe(describe);
        testEntity.setByUser(byUser);
        testEntity.setUrl(url);
        testDao.save(testEntity);
    }

    @RequestMapping("/remove")
    public void remove(Long id){
        testDao.remove(id);
    }

    @RequestMapping("/updateById")
    public void updateById(Long id,String title,String describe,String byUser,String url){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(id);
        testEntity.setTitle(title);
        testEntity.setDescribe(describe);
        testEntity.setByUser(byUser);
        testEntity.setUrl(url);
        testDao.update(testEntity);
    }


    @RequestMapping("/findById")
    public TestEntity findById(Long id){
        return testDao.findById(id);
    }
}
