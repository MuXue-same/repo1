package com.lxh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void sss(){
        System.out.println("aaaaaaaaaaaaaaaa");
    }
    public void addUser(String id){
        jdbcTemplate.update("delete from user where id=?",id);

    }

    public void deleteUser(){
        jdbcTemplate.update("delete from user where id=5");
    }
}
