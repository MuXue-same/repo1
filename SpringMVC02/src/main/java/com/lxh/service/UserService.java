package com.lxh.service;

import com.lxh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserService {
    @Autowired
    private UserDao userDao;

    public void dddd(){
        userDao.sss();
    }

    @Transactional
    public void aaaa(String id){
        System.out.println("ser");
        userDao.addUser(id);
        int a=1/0;
        userDao.deleteUser();
    }
}
