package com.hl.common;

/**
 * 异常的统一处理
 */

public class MyException extends RuntimeException{

    private Integer code;

    public MyException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.code = resultCode.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}