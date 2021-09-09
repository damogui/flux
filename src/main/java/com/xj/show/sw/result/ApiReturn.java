package com.xj.show.sw.result;

import io.swagger.annotations.ApiModelProperty;

/**
 * 统一返回实体类 zgy
 *
 * @param <T>
 */
public class ApiReturn<T> {

    /**
     * 返回的数据
     */
    @ApiModelProperty(value = "返回的数据", name = "data", dataType = "t")
    private T data;

    /**
     * 返回的状态码 0000:成功
     */
    @ApiModelProperty("返回的状态码 0000:成功")
    private String code;

    /**
     * 返回的提示信息
     */
    @ApiModelProperty("返回的提示信息")
    private String msg;

    public ApiReturn addData(T data) {
        this.data = data;
        return this;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static ApiReturn findSuccess() {
        ApiReturn apiReturn = new ApiReturn();
        apiReturn.setCode("0");
        apiReturn.setMsg("ok");
        return apiReturn;
    }
}
