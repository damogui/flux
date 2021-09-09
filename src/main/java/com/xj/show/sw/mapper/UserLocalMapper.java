package com.xj.show.sw.mapper;

import com.xj.show.sw.result.FindUserResult;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:UserLocalMapper
 * @Description:
 * @Author: gj
 * @Date: 2021/6/29 10:38
 * @Version: 1.0
 */
public interface UserLocalMapper {
    /*获取用户*/
    FindUserResult findUserById(@Param("id") int id);
}
