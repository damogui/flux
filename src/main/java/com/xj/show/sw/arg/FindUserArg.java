package com.xj.show.sw.arg;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName:FindUserArg
 * @Description:
 * @Author: gj
 * @Date: 2021/6/24 15:41
 * @Version: 1.0
 */
@Data
public class FindUserArg implements Serializable {
    @ApiModelProperty("参数id")
    private int id;
}
