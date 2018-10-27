package com.praneeth.web4.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praneeth.web4.model.Blog;
@Repository("BlogDao")
@Transactional
public class BlogDaoImpl implements BlogDao {
@Autowired
SessionFactory sessionfactory;
	@Override
	public boolean save_blog(Blog blog) {
	
		Session session=sessionfactory.openSession();
		session.save(blog);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return false;
	}
	@Override
	public List getBlogDetails() {
		Session session=sessionfactory.openSession();
	       
	       Query query=session.createQuery("from Blog");
	       
	       List blogList=query.list();
	       session.close();       
		return blogList;
	}

}
