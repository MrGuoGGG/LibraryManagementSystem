package com.gyx.service;

import com.gyx.mapper.StudentMapper;
import com.gyx.pojo.S_User;
import com.gyx.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    //查看所有读者账户信息
    public List<S_User> selectAllSUser(){
        //调用StudentMapper.selectAllSUser()

        //获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //获取StudentMapper
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //调用方法
        List<S_User> sUsers = mapper.selectAllSUser();
        //释放资源
        sqlSession.close();
        //返回结果
        return sUsers;
    }
    //根据学号查看读者账户信息
    public S_User selectBySid(String sid){
        //调用StudentMapper.selectBySid()

        //获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //获取StudentMapper
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //调用方法
        S_User sUser = mapper.selectBySid(sid);
        //释放资源
        sqlSession.close();
        //返回结果
        return sUser;
    }
    //修改读者信息
    public void updateSUser(S_User sUser){
        //调用StudentMapper.updateSUer()

        //获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //获取StudentMapper
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //调用方法
        mapper.updateSUser(sUser);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
    //添加新读者
    public void addSUser(S_User sUser){
        //调用StudentMapper.addSUer()

        //获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //获取StudentMapper
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //调用方法
        mapper.addSUser(sUser);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
    //删除读者
    public void deleteSUser(String sid){
        //调用StudentMapper.deleteSUserBySid()

        //获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //获取StudentMapper
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //调用方法
        mapper.deleteSUserBySid(sid);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
