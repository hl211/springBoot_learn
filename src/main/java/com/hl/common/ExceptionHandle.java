package com.hl.common;

import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常拦截
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = UnauthorizedException.class)//处理访问方法时权限不足问题
    public String defaultErrorHandler(HttpServletRequest req, Exception e)  {
        return "403";
    }
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof MyException) {
            MyException myException = (MyException) e;
            return ResultUtil.error(myException.getCode(), myException.getMessage());
        }else {
            logger.error("【系统异常】{}", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }

    /**
     * 是否是json请求
     * @param request
     * @return
     */
    private Boolean isJson(HttpServletRequest request){
        String header = request.getHeader("content-type");
        return header != null && header.contains("json");
    }

}