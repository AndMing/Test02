/*
package com.andming.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test02 {
    public static void main(String[] args) throws Exception {

        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");


        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = factoryBuilder.build(in);

        SqlSession sqlSession = factory.openSession();

        AccountDao dao = sqlSession.getMapper(AccountDao.class);
//        List<Account> accountList = dao.findAll();
//
//        for (Account account : accountList) {
//            System.out.println(account);
//        }
        Account one = dao.findOne(1);
        System.out.println(one);

        sqlSession.close();
        in.close();

    }
}
*/
