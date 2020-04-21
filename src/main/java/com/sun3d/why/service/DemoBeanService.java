package com.sun3d.why.service;

import com.sun3d.why.model.DemoBean;

/**
 * Created by xiech on 2018/1/29 0029.
 */
public interface DemoBeanService {

    void saveBeanBySQL(DemoBean demoBean);

    DemoBean getById(long id);
}
