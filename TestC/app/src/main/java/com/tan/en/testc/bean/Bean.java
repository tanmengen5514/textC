package com.tan.en.testc.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by en on 2019/9/18.
 */

@Entity
public class Bean {
    @Id(autoincrement = true) //表示是表中的主键自动增长
    private Long id; //一定是Long型
    private String name;
    private String pass;
    private String imagePath;
    @Generated(hash = 2074427160)
    public Bean(Long id, String name, String pass, String imagePath) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.imagePath = imagePath;
    }
    @Generated(hash = 80546095)
    public Bean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return this.pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getImagePath() {
        return this.imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
}
