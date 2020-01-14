package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.User;

import static utils.HibernateUtils.*;

public class UserDao 
{
	public void addUser(User u)
	{
		Session hs = getSf().getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			hs.save(u);
			tx.commit();
		}
		catch (RuntimeException e) 
		{
			if (tx != null) {
				tx.rollback();
			e.printStackTrace();
			}
		}
	}
}
