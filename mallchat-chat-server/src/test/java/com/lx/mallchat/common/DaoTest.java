package com.lx.mallchat.common;

import com.lx.mallchat.common.user.dao.UserDao;
import com.lx.mallchat.common.user.domain.entity.User;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpQrCodeTicket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * description:
 *
 * @author liuxin
 * @date 2024/07/18
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DaoTest {
    @Resource
    private WxMpService wxMpService;

    @Test
    public void test() throws WxErrorException {
        WxMpQrCodeTicket wxMpQrCodeTicket = wxMpService.getQrcodeService().qrCodeCreateTmpTicket(1, 10000);
        String url = wxMpQrCodeTicket.getUrl();
        System.out.println(url);

    }
}
