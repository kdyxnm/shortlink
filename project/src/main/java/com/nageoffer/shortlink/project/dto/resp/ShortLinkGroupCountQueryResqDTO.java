package com.nageoffer.shortlink.project.dto.resp;

import lombok.Data;

/**
 * 短链接分组数量查询返回DTO
 */
@Data
public class ShortLinkGroupCountQueryResqDTO {

    /**
     * 短链接标识
     */
    private String gid;

    /**
     * 短链接数量
     */
    private Integer shortLinkCount;
}
