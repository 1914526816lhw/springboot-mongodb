package com.mongodb.dao;

import com.mongodb.entity.TestEntity;
import org.springframework.stereotype.Repository;

/**
 * ClassName：TestDao
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/8/9 18:48
 * @version 1.0.0
 */
@Repository
public interface TestDao {

    /*将对象数据以分布式文件存储*/
    void save(TestEntity testEntity);

    void remove(Long id);

    void update(TestEntity testEntity);

    TestEntity findById(Long id);
}
