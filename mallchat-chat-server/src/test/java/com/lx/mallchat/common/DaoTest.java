package com.lx.mallchat.common;

import com.lx.mallchat.common.user.dao.UserDao;
import com.lx.mallchat.common.user.domain.entity.User;
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
    private UserDao userDao;

    @Test
    public void test() {
        User byId = userDao.getById(1);
        System.out.println(byId);

        User insert = new User();
        insert.setName("11");
        insert.setOpenId("123");
        boolean save = userDao.save(insert);
        System.out.println(save);
    }
}
