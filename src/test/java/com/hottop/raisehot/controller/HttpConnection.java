/**   
 * @Title: dd.java
 * @Package:com.hottop.raisehot.mockmvc2017年8月24日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月24日上午10:41:13 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

/**
 * @ClassName: dd
 * @Description: 多线程模拟测试网站并发性
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月24日上午10:41:13
 *
 * 
 */
import java.io.IOException;  
import java.io.InputStream;  
import java.net.URL;  
import java.net.URLConnection;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
  
public class HttpConnection {  
  
    /** 
     * @param args 
     * @throws Exception  
     */  
    public static void main(String[] args) throws Exception {  
        //测试的网站URL  
        final URL url=new URL("http://www.baidu.com");  
        //并发数量  
        final int concurrentNum=100;  
        ExecutorService pool=  Executors.newCachedThreadPool();  
        for (int i = 0; i < concurrentNum; i++) {  
            pool.execute(new Runnable() {  
                  
                @Override  
                public void run() {  
                    try {  
                        while(true){  
                            URLConnection connection= url.openConnection();  
                            InputStream inStream= connection.getInputStream();  
                            byte [] buff=new byte[1024];  
                            int len=-1;  
                            while((len=inStream.read(buff))!=-1){  
                                try {  
                                    Thread.sleep(10);  
                                    System.out.println(new String(buff));  
                                } catch (InterruptedException e) {  
                                    e.printStackTrace();  
                                }  
                                  
                            }  
                        }  
                          
                    } catch (IOException e) {  
                        e.printStackTrace();  
                    }  
                      
                }  
            });  
              
        }  
    }  
  
}  

