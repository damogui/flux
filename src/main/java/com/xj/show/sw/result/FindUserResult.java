package com.xj.show.sw.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName:FindUserResult
 * @Description:
 * @Author: gj
 * @Date: 2021/6/24 15:42
 * @Version: 1.0
 */
@Data
public class FindUserResult {
    @ApiModelProperty("年龄")
    private int age;
    @ApiModelProperty("姓名")
    private String name;
    private Dog dog;
}
