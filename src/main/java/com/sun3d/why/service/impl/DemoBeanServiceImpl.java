package com.sun3d.why.service.impl;

import com.sun3d.why.dao.DemoBeanRepository;
import com.sun3d.why.dao.DemoDao;
import com.sun3d.why.model.DemoBean;
import com.sun3d.why.service.DemoBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiech on 2018/1/29 0029.
 */
@Service
public class DemoBeanServiceImpl implements DemoBeanService {
    @Autowired
    private DemoBeanRepository demoBeanRepository;
    @Resource
    private DemoDao demoDao;


    @Override
    public void saveBeanBySQL(DemoBean demoBean) {

        this.demoBeanRepository.save(demoBean);
    }

    @Override
    public DemoBean getById(long id) {
      return demoDao.getById(id);
    }


}
