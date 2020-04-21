package com.sun3d.why.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 设置session 共享
 * Created by xiech on 2018/2/6 0006.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)//1分钟失效
public class RedisSessionConfig {

}
