/**   
 * @Title: WorkOrderController.java
 * @Package:com.hottop.raisehot.controller2017年8月28日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月28日下午3:44:26 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

/**
 * @ClassName: WorkOrderController
 * @Description: Spring WebMvc框架会将Servlet容器里收到的HTTP请求根据路径分发给对应的@Controller类进行处理，
 * @RestController是一类特殊的@Controller，它的返回值直接作为HTTP Response的Body部分返回给浏览器。
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月28日下午3:44:26
 * 
 * 
 */
@RestController
@EnableAutoConfiguration
public class WorkOrderController extends BaseController {
	 @RequestMapping("/") //http://localhost:8080/raisehot/
	    public String greeting() {
		 PageHelper.startPage(1,2);  
	        return "Hello World!";
	    }
}
