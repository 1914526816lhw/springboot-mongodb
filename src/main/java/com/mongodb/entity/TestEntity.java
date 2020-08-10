package com.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * ClassName：TestEntiy
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/8/9 18:44
 * @version 1.0.0
 */
@Document(collection = "testEntity")
public class TestEntity implements Serializable {

    @Id
    private Long id;
    private String title;
    private String describe;
    private String byUser;
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getByUser() {
        return byUser;
    }

    public void setByUser(String byUser) {
        this.byUser = byUser;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
