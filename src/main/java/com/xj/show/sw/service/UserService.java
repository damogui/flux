package com.xj.show.sw.service;

import com.xj.show.sw.arg.FindUserArg;
import com.xj.show.sw.result.FindUserResult;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @ClassName:UserService
 * @Description:
 * @Author: gj
 * @Date: 2021/6/24 15:39
 * @Version: 1.0
 */
@Service
public interface UserService {
    /*获取用户*/
    FindUserResult findUser(FindUserArg arg);
    /*测试下异步*/
    Mono<String> findStr(int i);
}
