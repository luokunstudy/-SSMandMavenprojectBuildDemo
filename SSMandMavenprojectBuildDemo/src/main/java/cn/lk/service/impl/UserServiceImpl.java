package cn.lk.service.impl;


import cn.lk.dao.UserDao;
import cn.lk.pojo.User;
import cn.lk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author luokun
 * @date 2019/4/18 14:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> selectUser(Map<String,Object> map) {

        return userDao.selectUser(map);
    }

}
