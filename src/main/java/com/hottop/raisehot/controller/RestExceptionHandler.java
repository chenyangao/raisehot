/**   
 * @Title: RestExceptionHandler.java
 * @Package:com.hottop.raisehot.controller2017年9月7日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年9月7日下午3:52:04 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: RestExceptionHandler
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年9月7日下午3:52:04
 * 
 */

@ControllerAdvice
@RestController
public class RestExceptionHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	private <T> RestResult<T> runtimeExceptionHandler(Exception e) {
		LOGGER.error("---------> huge error!", e);
		return RestResultGenerator.genErrorResult(0);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	private <T> RestResult<T> illegalParamsExceptionHandler(MethodArgumentNotValidException e) {
		return RestResultGenerator.genErrorResult(0);
	}

	// 运行时异常
	@ExceptionHandler(RuntimeException.class)
	public RestResult<?> runtimeExceptionHandler(RuntimeException runtimeException) {
		return RestResultGenerator.genErrorResult(0);
	}

	// 空指针异常
	@ExceptionHandler(NullPointerException.class)
	public RestResult<Object> nullPointerExceptionHandler(NullPointerException ex) {
		return RestResultGenerator.genErrorResult(1001);
	}

	// 类型转换异常
	@ExceptionHandler(ClassCastException.class)
	public RestResult<Object> classCastExceptionHandler(ClassCastException ex) {
		return RestResultGenerator.genErrorResult(1002);
	}

	// IO异常
	@ExceptionHandler(IOException.class)
	public RestResult<Object> iOExceptionHandler(IOException ex) {
		return RestResultGenerator.genErrorResult(1003);
	}

	// 未知方法异常
	@ExceptionHandler(NoSuchMethodException.class)
	public RestResult<Object> noSuchMethodExceptionHandler(NoSuchMethodException ex) {
		return RestResultGenerator.genErrorResult(1004);
	}

	// 数组越界异常
	@ExceptionHandler(IndexOutOfBoundsException.class)
	public RestResult<Object> indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
		return RestResultGenerator.genErrorResult(1005);

	}

	// 400错误
	@ExceptionHandler({ HttpMessageNotReadableException.class })
	public RestResult<Object> requestNotReadable(HttpMessageNotReadableException ex) {
		return RestResultGenerator.genErrorResult(400);
	}

	// 400错误
	@ExceptionHandler({ TypeMismatchException.class })
	public RestResult<Object> requestTypeMismatch(TypeMismatchException ex) {
		return RestResultGenerator.genErrorResult(400);
	}

	@ExceptionHandler({ MissingServletRequestParameterException.class })
	public RestResult<?> requestMissingServletRequest(MissingServletRequestParameterException ex) {
		return RestResultGenerator.genErrorResult(1007);
	}

	// 405错误
	@ExceptionHandler({ HttpRequestMethodNotSupportedException.class })
	public RestResult<Object> request405() {
		return RestResultGenerator.genErrorResult(405);
	}

	// 406错误
	@ExceptionHandler({ HttpMediaTypeNotAcceptableException.class })
	public RestResult<Object> request406() {
		return RestResultGenerator.genErrorResult(406);
	}

	// 500错误
	@ExceptionHandler({ ConversionNotSupportedException.class, HttpMessageNotWritableException.class })
	public RestResult<Object> server500(RuntimeException runtimeException) {
		return RestResultGenerator.genErrorResult(500);
	}
}
