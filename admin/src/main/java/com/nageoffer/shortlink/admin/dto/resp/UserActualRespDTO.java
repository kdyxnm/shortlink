package com.nageoffer.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nageoffer.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;
/**
 * 用户返回响应参数
 */
@Data
public class UserActualRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String mail;

}
