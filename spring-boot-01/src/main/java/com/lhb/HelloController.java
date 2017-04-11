package com.lhb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 等价于 @Controller 和@RequestBody
 * @author Administrator
 *
 */
@RestController
public class HelloController {
	
	
	
	/**
	 * @RequestMapping 建立请求映射
	 * @return
	 */
	@RequestMapping
	public String hello(){
		return "Hello world!!";
	}
}
