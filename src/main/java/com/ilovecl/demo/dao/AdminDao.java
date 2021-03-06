package com.ilovecl.demo.dao;

import com.ilovecl.demo.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:fly
 * @Description:管理员DAO层
 * @Date:16:50 2018/9/14
 */
@Mapper
public interface AdminDao {
    //    根据ID查询
    Admin queryById(int id);

    //    根据用户名查询
    Admin queryByName(String userName);

    //    查询所有管理员
    List<Admin> queryAll();

    Admin queryByEmail(String email);
}
