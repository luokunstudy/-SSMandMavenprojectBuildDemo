package cn.lk.dao;

import cn.lk.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author luokun
 * @date 2019/4/18 14:31
 */
public interface UserDao {
    List<User> selectUser(Map<String,Object> map);
}
