package com.gyx.mapper;

import com.gyx.pojo.M_User;
import com.gyx.pojo.S_User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerMapper {

    //根据工号查询管理员信息
    M_User selectByMid(String mid);

    //查询所有管理员账户信息
    List<M_User> selectAllMUsers();

    //根据管理员id和密码查看管理员信息
    M_User selectByMidAndMpassword(@Param("mid") String mid, @Param("mpassword") String mpassword);

    //添加新的管理员
    void addMUser(M_User mUser);

    //修改管理员信息
    void updateMUser(M_User mUser);

    //根据工号删除管理员信息
    void deleteMUserByMid(String mid);
}
