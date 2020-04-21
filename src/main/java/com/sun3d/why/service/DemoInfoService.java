package com.sun3d.why.service;

import com.sun3d.why.model.DemoInfo;

/**
 * Created by xiech on 2018/2/5 0005.
 */
public interface DemoInfoService {
    DemoInfo findById(String id);

    public void deleteFromCache(String id);

    void test();
}
