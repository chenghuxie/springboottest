package com.sun3d.why.test;

import com.sun3d.why.App;
import com.sun3d.why.model.DemoBean;
import com.sun3d.why.service.DemoBeanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by xiech on 2018/2/1 0001.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class HelloTest {
    @Autowired
    private DemoBeanService demoBeanService;

    @Test
    public void testSave(){
        DemoBean demoBean=new DemoBean();
        demoBean.setName("测试用例1");
        demoBeanService.saveBeanBySQL(demoBean);
    }

}
