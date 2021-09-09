package com.xj.show.sw.service.impl;

import com.xj.show.sw.arg.FindUserArg;
import com.xj.show.sw.mapper.UserLocalMapper;
import com.xj.show.sw.result.FindUserResult;
import com.xj.show.sw.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @ClassName:UserServiceImpl
 * @Description:
 * @Author: gj
 * @Date: 2021/6/24 15:40
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserLocalMapper userLocalMapper;

    /*获取用户*/
    @Override
    public FindUserResult findUser(FindUserArg arg) {
        FindUserResult result = userLocalMapper.findUserById(arg.getId());
        return result;
    }

    @Override
    public Mono<String> findStr(int i) {
        return Mono.just(i + "666");

    }
}
