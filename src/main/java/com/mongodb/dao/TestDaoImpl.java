package com.mongodb.dao;

import com.mongodb.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * ClassName：TestDaoImpl
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/8/9 18:54
 * @version 1.0.0
 */
@Repository
public class TestDaoImpl implements TestDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(TestEntity testEntity) {
        mongoTemplate.save(testEntity);
    }

    @Override
    public void remove(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,TestEntity.class);
    }

    @Override
    public void update(TestEntity testEntity) {
        Query query = new Query(Criteria.where("id").is(testEntity.getId()));
        Update update = new Update();
        update.set("title", testEntity.getTitle());
        update.set("describe", testEntity.getDescribe());
        update.set("byUser", testEntity.getByUser());
        update.set("url", testEntity.getUrl());
        mongoTemplate.updateFirst(query,update, TestEntity.class);
    }

    @Override
    public TestEntity findById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        TestEntity testEntity = mongoTemplate.findOne(query, TestEntity.class);
        return testEntity;
    }
}
