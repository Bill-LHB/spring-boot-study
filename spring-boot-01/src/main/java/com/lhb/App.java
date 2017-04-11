package com.lhb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 表示为这个是Spring boot 的启动类 
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	/**
    	 * 在mian 方法中启动应用程序
    	 */
       SpringApplication.run(App.class, args);
    }
}
