package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.data.School;


@Repository

public class LoginDao  {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<School> getSchoolNames(){
		/*Session session = dataSource.getCurrentSession();
		List<School> listSchool = (List<School>) session.get(School.class,"");
		session.close();*/
		//List listSchool = getHibernateTemplate().find("from School");
		List<School> listSchool = getSession().createCriteria(School.class).list();
		//List<School> listSchool = (List<School>) getSession().get(School.class, "");
		return listSchool;
		
	}
	
	 private Session getSession() {
         Session sess = getSessionFactory().getCurrentSession();
         if (sess == null) {
                sess = getSessionFactory().openSession();
         }
         //Transaction tx = sess.beginTransaction();
         return sess;
  }

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
