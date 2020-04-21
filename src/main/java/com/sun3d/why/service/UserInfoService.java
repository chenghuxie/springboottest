package com.sun3d.why.service;

import com.sun3d.why.model.UserInfo;

/**
 * Created by xiech on 2018/2/6 0006.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
