package com.sun3d.why.service.impl;


import com.sun3d.why.dao.DemoInfoRepository;
import com.sun3d.why.model.DemoInfo;
import com.sun3d.why.service.DemoInfoService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by xiech on 2018/2/5 0005.
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {
    @Resource
    private DemoInfoRepository demoInfoRepository;

    @Resource
    private RedisTemplate<String,String> redisTemplate;
    @Override
    public void test(){
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("mykey4", "random1="+Math.random());
        System.out.println(valueOperations.get("mykey4"));
    }
    //keyGenerator="myKeyGenerator"
    @Cacheable(value="demoInfo",key = "#id+'findById'",unless = "#result == null ") //缓存,这里没有指定key.
    @Override
    public DemoInfo findById(String id) {
        System.err.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id="+id);
        return demoInfoRepository.findOne(id);
    }
    @CacheEvict(value="demoInfo",key = "#id+'findById'")
    @Override
    public void deleteFromCache(String id) {
        System.out.println("DemoInfoServiceImpl.delete().从缓存中删除.");
    }
}
