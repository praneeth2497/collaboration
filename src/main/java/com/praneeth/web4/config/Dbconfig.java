package com.praneeth.web4.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.praneeth.web4.model.Blog;
import com.praneeth.web4.model.Jobs;
import com.praneeth.web4.model.UserDetails;

@Configuration
@ComponentScan("com.praneeth.web4")
@EnableTransactionManagement
public class Dbconfig
{
    @Bean(name = "dataSource")
    public DataSource getDatasource(){
        DriverManagerDataSource dmd=new DriverManagerDataSource();
        dmd.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dmd.setUrl("jdbc:oracle:thin:@//localhost:1521/XE");
        dmd.setUsername("dt12");
       dmd.setPassword("dt12");
       System.out.println("datasource");
        return dmd;        
        
        
    }
    
    public Properties getHibernateProperties(){
       
        Properties p=new Properties();
        
    p.setProperty("hibernate.hbm2ddl.auto", "update");
        

        p.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");

        
        
       System.out.println("properties of hibernate");

        return p;
    }
    @Autowired
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory(DataSource source){
        
        LocalSessionFactoryBuilder session=new LocalSessionFactoryBuilder(source);
        
        session.addProperties(getHibernateProperties());
        session.addAnnotatedClass(UserDetails.class);
        session.addAnnotatedClass(Blog.class);
        session.addAnnotatedClass(Jobs.class);
        System.out.println("session factory ");

       return session.buildSessionFactory();
        
    }
    @Autowired
    @Bean(name = "transactionManager")
    public HibernateTransactionManager getHibernateTransaction(SessionFactory s) {
        HibernateTransactionManager hbm = new HibernateTransactionManager(s);
       System.out.println("transaction test");

        return hbm;
    }
}
