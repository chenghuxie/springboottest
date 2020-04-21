package com.sun3d.why.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xiech on 2018/2/5 0005.
 */
@Entity
public class DemoInfo implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "user-uuid", strategy = "uuid")
    @GeneratedValue(generator = "user-uuid",strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, length = 64)
    private String id;

    private String name;

    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "DemoInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
