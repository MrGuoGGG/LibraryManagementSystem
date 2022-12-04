package com.gyx.service;

import com.gyx.mapper.BookMapper;
import com.gyx.mapper.ManagerMapper;
import com.gyx.pojo.Book;
import com.gyx.pojo.M_User;
import com.gyx.pojo.S_User;
import com.gyx.util.SqlSessionFactoryUtils;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ManagerService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    //查询所有管理员账户信息
    public List<M_User> selectAllMUsers(){
        //调用ManagerMapper.selectAllMUsers()

        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        //调用方法
        List<M_User> mUsers = mapper.selectAllMUsers();
        //释放资源
        sqlSession.close();
        //返回结果
        return mUsers;
    }

    //根据管理员id和密码查看管理员信息-----登录使用
    public M_User selectByMidAndMpassword(String mid,String mpassword){
        //调用ManagerMapper.selectByMidAndMpassword()

        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        //调用方法
        M_User mUser = mapper.selectByMidAndMpassword(mid, mpassword);
        //释放资源
        sqlSession.close();
        //返回查询结果
        return mUser;
    }

    //添加新的管理员
    public void addMUser(M_User mUser){
        //调用ManagerMapper.addMUser()

        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        //调用方法
        mapper.addMUser(mUser);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //根据管理员id查询管理员信息
    public M_User selectByMid(String mid){
        //调用ManagerMapper.selectByMid()

        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        //调用方法
        M_User mUser = mapper.selectByMid(mid);
        //释放资源
        sqlSession.close();
        //返回查询结果
        return mUser;
    }

    //修改管理员信息
    public void updateMUser(M_User mUser){
        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取ManagerMapper
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        //调用方法
        mapper.updateMUser(mUser);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //根据工号删除员工信息
    public void deleteMUser(String mid){
        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取ManagerMapper
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        //调用方法
        mapper.deleteMUserByMid(mid);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
