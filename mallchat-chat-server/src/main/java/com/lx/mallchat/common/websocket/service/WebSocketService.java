package com.lx.mallchat.common.websocket.service;

import io.netty.channel.Channel;

/**
 * description:
 *
 * @author liuxin
 * @date 2024/07/26
 */
public interface WebSocketService {
    void connect(Channel channel);

    void handleLoginReq(Channel channel);
}
