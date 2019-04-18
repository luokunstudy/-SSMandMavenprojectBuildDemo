package cn.lk.controller;

import cn.lk.pojo.User;
import cn.lk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author luokun
 * @date 2019/4/18 13:54
 */
@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "selectUserAsJson")
    public List<User> selectUserAsJson(String id){
        List<User> users = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        users = userService.selectUser(map);
        return users;
    }

    @RequestMapping(value = "selectUserAsJsp")
    public ModelAndView selectUserAsJsp(String id){
        List<User> users = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        users = userService.selectUser(map);
        ModelAndView model = new ModelAndView();
        model.addObject("users",users);
        model.setViewName("index");
        return model;
    }
}
