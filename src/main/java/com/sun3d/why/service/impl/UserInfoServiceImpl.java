package com.sun3d.why.service.impl;

import com.sun3d.why.dao.UserInfoRepository;
import com.sun3d.why.model.UserInfo;
import com.sun3d.why.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiech on 2018/2/6 0006.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepository userInfoRepository;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
}
