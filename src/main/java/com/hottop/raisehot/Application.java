package com.hottop.raisehot;

import java.io.PrintStream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @ClassName: Application
 * @Description:SpringApplication 则是用于从main方法启动Spring应用的类。默认，它会执行以下步骤：
 * 1.创建一个合适的ApplicationContext实例 （取决于classpath）。
 * 2.注册一个CommandLinePropertySource，以便将命令行参数作为Spring properties。
 * 3.刷新application context，加载所有单例beans。
 * 4.激活所有CommandLineRunner beans。
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月28日下午3:18:22
 *
 * 
 */
@SpringBootApplication
@MapperScan("com.hottop.raisehot.dao")
public class Application implements  Banner{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	/* (non-Javadoc)
	 * @see org.springframework.boot.Banner#printBanner(org.springframework.core.env.Environment, java.lang.Class, java.io.PrintStream)
	 */
	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		// TODO Auto-generated method stub
		
	}

}
