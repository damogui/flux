package com.xj.show.sw.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName:Dog
 * @Description:
 * @Author: gj
 * @Date: 2021/6/24 16:24
 * @Version: 1.0
 */
@Data
@ApiModel(description ="小狗的描述" )
public class Dog {
    @ApiModelProperty("狗的颜色")
    private String color;
}
