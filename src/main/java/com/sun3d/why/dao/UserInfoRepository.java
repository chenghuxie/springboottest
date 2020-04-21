package com.sun3d.why.dao;

import com.sun3d.why.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by xiech on 2018/2/6 0006.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
