/**   
 * @Title: BaseController.java
 * @Package:com.hottop.raisehot.controller2017年7月19日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月19日下午3:45:58 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import com.hottop.raisehot.util.ReturnFormat;

/**
 * @ClassName: BaseController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月19日下午3:45:58
 *
 * 
 */
public abstract class BaseController {
    protected String retContent(int status,Object data) {
        return ReturnFormat.retParam(status, data);
    }
}