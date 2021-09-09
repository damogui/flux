package com.xj.show.sw.controller;

import com.xj.show.sw.arg.FindUserArg;
import com.xj.show.sw.result.ApiReturn;
import com.xj.show.sw.result.FindUserResult;
import com.xj.show.sw.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:UserController
 * @Description:
 * @Author: gj
 * @Date: 2021/6/24 15:39
 * @Version: 1.0
 */
@RestController
@Api(value = "用户接口",description = "用户接口实现")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户信息",notes = "标记信息")
    @PostMapping("/findUser")
    public Mono<ApiReturn<FindUserResult>> findUser(@RequestBody  FindUserArg arg){
        ApiReturn apiReturn=ApiReturn.findSuccess();
        FindUserResult result=userService.findUser(arg);
        apiReturn.setData(result);
//        return apiReturn;
        return  Mono.just(apiReturn);

    }

    @ApiOperation(value = "获取用户信息2",notes = "标记信息2")
    @PostMapping("/findUser2")
    public Flux<FindUserResult> findUser2(@RequestBody  FindUserArg arg){
        ApiReturn apiReturn=ApiReturn.findSuccess();
        FindUserResult result=userService.findUser(arg);
        apiReturn.setData(result);
        List<FindUserResult>list=new ArrayList<>();
        FindUserResult findUserResult2=new FindUserResult();
        findUserResult2.setAge(11);
        findUserResult2.setName("66");
        list.add(result);
        list.add(findUserResult2);
//        return apiReturn;
        //  Mono.just(apiReturn);
        return  Flux.fromIterable(list);


    }
}
