package com.wystu.vueblog.common.exception;

import com.wystu.vueblog.common.lang.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author WY
 * @description: GlobalExceptionHandler
 * @date 2021/8/9 20:20
 */


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = ShiroException.class)
    public Result hanler(ShiroException s) {
        log.error("运行时异常：-------------{}", s);
        return Result.fail(401, s.getMessage(), null);
    }

    @ResponseStatus
    @ExceptionHandler(value = RuntimeException.class)
    public Result hanler(RuntimeException r) {
        log.error("运行时异常：-------------{}", r);
        return Result.fail(r.getMessage());
    }
}
