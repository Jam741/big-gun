package com.jam.biggun.controller;

import com.jam.biggun.domain.UserEntity;
import com.jam.biggun.jpa.IUserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    IUserJPA userJPA;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(UserEntity user, HttpServletRequest request) {

        String result = "登录成功";
        //登录是否成功标志
        boolean flag = true;
        //根据用户名查询用户是否存在
        UserEntity userEntity = userJPA.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"), user.getName()));
                return null;
            }
        }).get();
        if (userEntity == null) {
            flag = false;
            result = "用户不存在，登录失败";
        } else if (!user.getPwd().equals(userEntity.getPwd())) {
            flag = false;
            result = "密码错误，登录失败";
        }
        if (flag) {
            //将用户写入 Session
            request.getSession().setAttribute("_session_user", userEntity);
        }
        return result;
    }
}
