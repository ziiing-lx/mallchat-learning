package com.lx.mallchat.common.websocket;

import cn.hutool.json.JSONUtil;
import com.lx.mallchat.common.websocket.domain.enums.WSReqTypeEnum;
import com.lx.mallchat.common.websocket.domain.vo.req.WsBaseReq;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * description:
 *
 * @author liuxin
 * @date 2024/07/17
 */
@ChannelHandler.Sharable
public class NettyWebSocketServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof WebSocketServerProtocolHandler.HandshakeComplete) {
            System.out.println("握手完成");
        } else if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            if (event.state() == IdleState.READER_IDLE) {
                System.out.println("读空闲");
                //todo 用户下线
            }
        }

    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        String text = msg.text();
        WsBaseReq wsBaseReq = JSONUtil.toBean(text, WsBaseReq.class);
        switch (WSReqTypeEnum.of(wsBaseReq.getType())) {
            case AUTHORIZE:
                break;
            case HEARTBEAT:
                break;
            case LOGIN:
                System.out.println("请求二维码");
                ctx.channel().writeAndFlush(new TextWebSocketFrame("123"));
        }
    }
}
