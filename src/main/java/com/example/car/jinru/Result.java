package com.example.car.jinru;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import java.io.Serializable;

public class Result<T> implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 成功信息
     */
    public static final String SUCCESS_MSG = "操作成功";
    /**
     * 成功code
     */
    public static final Integer SUCCESS_CODE = 1;

    /**
     * 返回主数据
     */
    private T data;

    /**
     * 返回状态代码
     * 默认200为成功
     */
    private Integer code = SUCCESS_CODE;
    /**
     * 提示信息
     * 额外的提示信息
     */
    private String msg = SUCCESS_MSG;

    /**
     * 构建返回结果
     * @param msg
     * @param code
     * @param data
     * @return
     */
    public static Result build( String msg, Integer code,Object data){
        return new Result(msg,code,data);
    }

    /**
     *构建成功结果
     * @param msg
     * @param data
     * @return
     */
    public static Result buildSuccess(String msg,Object data) {
        if(StringUtils.isBlank(msg)){
            msg=SUCCESS_MSG;
        }
        return build(msg,SUCCESS_CODE,data );
    }

    /**
     * 构建成功结果带信息
     * @param msg
     * @return
     */
    public static Result buildSuccess(String msg){
        return buildSuccess(msg,null);
    }
    /**
     * 构建成功结果带信息
     * @return
     */
    public static Result buildSuccess(){
        return buildSuccess(SUCCESS_MSG,null);
    }

    /**
     * 构建成功结果带数据
     * @param data
     * @return
     */
    public static Result buildSuccess(Object data){
        return buildSuccess(null,data);
    }

    public Result() {
    }
    private Result( String msg, Integer code, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }

}
