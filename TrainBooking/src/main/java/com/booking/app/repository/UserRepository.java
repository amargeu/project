package com.booking.app.repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.booking.app.dto.User;

@Repository
public class UserRepository 
{
	@Autowired
	private SessionFactory sessionFactory;
	User user=null;
	
	public User findUserByEmailOrMobileNoOrUserName(String loginData)
	{
		
		try(Session session=sessionFactory.openSession())
		{
     Query<User>hql=  session.createQuery("from User where email=:loginData or mobileNo=:loginData or userName=:loginData");
			hql.setParameter("loginData",loginData);
			user = hql.uniqueResult();
			System.out.println(user);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return user;
		
	}
	
	

}
