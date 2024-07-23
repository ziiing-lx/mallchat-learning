package com.lx.mallchat.common.websocket.domain.vo.req;

import lombok.Data;

/**
 * description:
 *
 * @author liuxin
 * @date 2024/07/18
 */
@Data
public class WsBaseReq {
    /**
     * 请求类型 1.请求登录二维码，2心跳检测
     *
     * @see com.lx.mallchat.common.websocket.domain.enums.WSReqTypeEnum
     */
    private Integer type;
    private String data;
}
