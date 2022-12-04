package com.gyx.mapper;

import com.gyx.pojo.S_User;

import java.util.List;

public interface StudentMapper {
    //查看所有读者信息
    List<S_User> selectAllSUser();
    //根据学号查看读者信息
    S_User selectBySid(String sid);
    //修改读者信息
    void updateSUser(S_User sUser);
    //添加新读者
    void addSUser(S_User sUser);
    //删除读者账户
    void deleteSUserBySid(String sid);
}
