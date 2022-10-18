package com.six.ms.exception;

import com.six.ms.ResultCode;
import com.six.ms.util.RequestUtil;
import com.six.ms.vo.ResponseVO;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("com.six.ms.controller")
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseVO common(Exception e) {
        String body = RequestUtil.getRequestBody();
        new ExceptionLog(e, body).logging();
        return new ResponseVO(ResultCode.ERROR_CODE, "에러");
    }

    @Order(Ordered.HIGHEST_PRECEDENCE)
    @ExceptionHandler(MissingRequestHeaderException.class)
    @ResponseBody
    public ResponseVO missingHeader(Exception e) {
        String body = RequestUtil.getRequestBody();
        new ExceptionLog(e, body).logging();
        return new ResponseVO(ResultCode.NULL_ERROR_CODE, "헤더값 누락");
    }
}
