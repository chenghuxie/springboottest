package com.sun3d.why.redis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

/**
 * Created by xiech on 2018/2/5 0005.
 */
/*@Configuration
@ConditionalOnClass({JedisConnection.class, RedisOperations.class, Jedis.class})
@EnableConfigurationProperties(RedisProperties.class)*/
public class RedisAutoConfiguration {
   /* @Configuration
    protected static class RedisConfiguration{
        @Bean
        @ConditionalOnMissingBean(name="redisTemplate")
        public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
           RedisTemplate<Object,Object> template=new RedisTemplate<Object, Object>();
           template.setConnectionFactory(redisConnectionFactory);
           return template;
        }
        @Bean
        @ConditionalOnMissingBean(StringRedisTemplate.class)
        public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory){
             StringRedisTemplate stringRedisTemplate=new StringRedisTemplate();
             stringRedisTemplate.setConnectionFactory(redisConnectionFactory);
             return stringRedisTemplate;
        }
    }*/
}
