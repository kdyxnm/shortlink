package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.common.enums.UserErrorCodeEnum;
import com.nageoffer.shortlink.admin.convention.result.Result;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.jdbc.Null;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO result = userService.getUserByUsername(username);
        if(result == null) {
            return new Result<UserRespDTO>().setCode(UserErrorCodeEnum.USER_NOT_EXIST.code()).setMessage(UserErrorCodeEnum.USER_NOT_EXIST.message());
        } else {
            return new Result<UserRespDTO>().setCode("0").setData(result);
        }
    }
}
