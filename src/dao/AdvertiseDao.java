package dao;

import static utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Advertise;
import pojos.User;

public class AdvertiseDao 
{
	public void addAdvertise(Advertise a)
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
