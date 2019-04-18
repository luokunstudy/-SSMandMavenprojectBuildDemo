package cn.lk.service;

import cn.lk.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author luokun
 * @date 2019/4/18 14:32
 */
public interface UserService {
    List<User> selectUser(Map<String,Object> map);
}
