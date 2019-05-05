package com.parents;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//使用mybatis需要自定义数据源
@MapperScan(basePackages = {"com.parents.*.dao"})
public class ShopApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ShopApplication.class,args);
    }
}
