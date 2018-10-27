package com.praneeth.web4.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praneeth.web4.model.Jobs;
@Repository("JobsDao")
@Transactional
public class JobsDaoImpl implements JobsDao {
@Autowired
SessionFactory sessionFactory;
	@Override
	public boolean save_jobDetails(Jobs job) {

		Session session=sessionFactory.openSession();
		session.save(job);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return false;
	}

}
