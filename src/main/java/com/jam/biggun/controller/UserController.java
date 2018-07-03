package com.jam.biggun.controller;


import com.jam.biggun.domain.UserEntity;
import com.jam.biggun.jpa.IUserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserJPA userJPA;


    /**
     * 查询用户列表方法
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserEntity> list() {
        return userJPA.findAll();
    }

    /**
     * 添加更新用户方法
     *
     * @param userEntity 用户对象
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public UserEntity save(UserEntity userEntity) {
        return userJPA.save(userEntity);
    }


    /**
     * 删除用户方法
     *
     * @param id 用户主键ID
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public List<UserEntity> delete(Long id) {
        userJPA.deleteById(id);
        return userJPA.findAll();
    }


}
