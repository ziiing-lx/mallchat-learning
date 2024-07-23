package com.lx.mallchat.common.user.dao;

import com.lx.mallchat.common.user.domain.entity.User;
import com.lx.mallchat.common.user.mapper.UserMapper;
import com.lx.mallchat.common.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author <a href="https://github.com/zongzibinbin">lx</a>
 * @since 2024-07-18
 */
@Service
public class UserDao extends ServiceImpl<UserMapper, User> implements IUserService {

}
