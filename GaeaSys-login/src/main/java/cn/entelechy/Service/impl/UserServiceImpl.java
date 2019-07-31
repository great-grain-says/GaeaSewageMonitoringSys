package cn.entelechy.Service.impl;

import cn.entelechy.Service.UserService;
import cn.entelechy.dao.UserMapper;
import cn.entelechy.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    //注入Mapper接口
    @Autowired
    private UserMapper userMapper;
    @Override
    public Account findByname(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public Account findById(Integer id) {
        return userMapper.findById(id);
    }
}
