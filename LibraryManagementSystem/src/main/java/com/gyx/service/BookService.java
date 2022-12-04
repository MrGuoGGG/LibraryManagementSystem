package com.gyx.service;

import com.gyx.mapper.BookMapper;
import com.gyx.pojo.Book;
import com.gyx.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BookService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    //查询所有书籍
    public List<Book> selectAllBooks() {
        //调用UserMapper.selectAllBooks()

        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        //调用方法
        List<Book> books = mapper.selectAll();
        //释放资源
        sqlSession.close();
        //返回结果
        return books;
    }

    //添加新书
    public void addBook(Book book) {
        //调用UserMapper.addBook()

        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        //调用方法
        mapper.addBook(book);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //根据索书号查询书籍信息
    public Book selectByBid(String bid) {
        //调用UserMapper.selectByBid()

        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        //调用方法
        Book book = mapper.selectByBid(bid);
        //释放资源
        sqlSession.close();
        //返回结果
        return book;
    }

    //修改书籍信息
    public void updateBook(Book book){
        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        //调用方法
        mapper.updateBook(book);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //删除书籍
    public void deleteBook(String bid){
        //获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //获取BookMapper
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        //调用方法
        mapper.deleteByBid(bid);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }


}
