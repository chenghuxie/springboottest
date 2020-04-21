package com.sun3d.why.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xiech on 2018/1/29 0029.
 */
@Entity
@Table(name="demo_bean")
public class DemoBean implements Serializable{
    @Id
    @GenericGenerator(name = "user-uuid", strategy = "uuid")
    @GeneratedValue(generator = "user-uuid",strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, length = 64)
    private String  id;

    private String name;

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
}
