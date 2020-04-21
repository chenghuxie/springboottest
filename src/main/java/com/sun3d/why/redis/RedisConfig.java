package com.sun3d.why.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by xiech on 2018/2/5 0005.
 * SpringBoot提供了对Redis的自动配置功能，在RedisAutoConfiguration中默认为我们配置了JedisConnectionFactory（客户端连接）、RedisTemplate以及StringRedisTemplate（数据操作模板），其中StringRedisTemplate模板只针对键值对都是字符型的数据进行操作，本示例采用RedisTemplate作为数据操作模板，该模板默认采用JdkSerializationRedisSerializer的二进制数据序列化方式，为了方便演示本示例采用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值，使用StringRedisSerializer来序列化和反序列化redis的key值。
 */
/*@Configuration*/
public class RedisConfig {
  /*  @Bean
    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory connectionFactory){
     RedisTemplate<Object,Object> template=new RedisTemplate<Object, Object>();
     template.setConnectionFactory(connectionFactory);

     //使用jackson2jsonRedisSerializer
        Jackson2JsonRedisSerializer serializer=new Jackson2JsonRedisSerializer(Object.class);

        ObjectMapper mapper=new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        serializer.setObjectMapper(mapper);

        template.setValueSerializer(serializer);
        //使用stringRedisSerializer来序列化和反序列化redis的key值
        template.setKeySerializer(new StringRedisSerializer());
        template.afterPropertiesSet();
        return template;
    }*/
}
