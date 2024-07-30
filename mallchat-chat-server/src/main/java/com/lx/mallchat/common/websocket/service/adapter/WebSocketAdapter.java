package com.lx.mallchat.common.websocket.service.adapter;

import com.lx.mallchat.common.websocket.domain.enums.WSRespTypeEnum;
import com.lx.mallchat.common.websocket.domain.vo.resp.WSBaseResp;
import com.lx.mallchat.common.websocket.domain.vo.resp.WSLoginUrl;
import me.chanjar.weixin.mp.bean.result.WxMpQrCodeTicket;

/**
 * description:
 *
 * @author liuxin
 * @date 2024/07/26
 */
public class WebSocketAdapter {
    public static WSBaseResp<?> buildResp(WxMpQrCodeTicket wxMpQrCodeTicket) {
        //把码推送给前端
        WSBaseResp<WSLoginUrl> resp = new WSBaseResp<>();
        resp.setType(WSRespTypeEnum.LOGIN_URL.getType());
        resp.setData(new WSLoginUrl(wxMpQrCodeTicket.getUrl()));
        return resp;
    }
}
