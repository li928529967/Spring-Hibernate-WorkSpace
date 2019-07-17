package com.lpit;

import com.lpit.bean.StuBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestHibernate {
    @Test
    public void Demo01(){
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        StuBean stu = new StuBean();
        stu.setName("漳州");
        session.save(stu);
        transaction.commit();
        session.close();
    
    }
}
