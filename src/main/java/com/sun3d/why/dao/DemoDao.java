package com.sun3d.why.dao;

import com.sun3d.why.model.DemoBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by xiech on 2018/1/30 0030.
 */
@Repository
public class DemoDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public DemoBean getById(long id){
        String sql="select * from demo_bean where id=?";
        RowMapper<DemoBean> rowMapper=new BeanPropertyRowMapper<DemoBean>(DemoBean.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
   }
}
