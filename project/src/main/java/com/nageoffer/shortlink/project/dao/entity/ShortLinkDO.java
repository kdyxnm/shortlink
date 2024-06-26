package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.project.common.database.BaseDO;
import lombok.*;
import org.checkerframework.checker.units.qual.A;

import java.util.Date;

/**
 * 短链接实体
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_link")
public class ShortLinkDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 域名
     */
    private String domain;

    /**
     * 短链接
     */
    private String shortUri;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 点击量
     */
    private Integer clickNum;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 启用表示 0:启用 1:未启用
     */
    private Integer enableStatus;

    /**
     * 创建类型 0:接口创建 1:控制台创建
     */
    private Integer createdType;

    /**
     * 有效期类型 0:永久有效 1: 自定义
     */
    private Integer validDateType;

    /**
     * 有效期
     */
    private Date validDate;

    /**
     * 描述
     */
    @TableField("`describe`")
    private String describe;

    /**
     * 网站图标
     */
    private String favicon;

}
