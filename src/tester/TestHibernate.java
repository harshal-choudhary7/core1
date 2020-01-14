package tester;
import static utils.HibernateUtils.getSf;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojos.Address;
import pojos.Advertise;
import pojos.CarInfo;
import pojos.FuelType;
import pojos.Ownership;
import pojos.ReportAdd;
import pojos.Role;
import pojos.User;
import pojos.Wishlist;

public class TestHibernate {

	public static void main(String[] args) {
		try
		{
			System.out.println("Hibernated booted.....");
			Address address = new Address("qwe", "asd", "Pune", "450112");
			User user = new User("harshal", "h@gmail.com", "harshal", Role.USER, address,false);
			Advertise add1 = new Advertise(new Date(11, 11, 2011), "bpur", 12, user, new CarInfo("aaa", "bbb", 122333.12, 1212, 121, "model", FuelType.BIODIESEL, "decription", Ownership.FIRSTHAND), false, false);
			user.addAdvertisement(add1);
			Advertise add2 = new Advertise(new Date(22, 22, 2222), "ppppur", 112, user, new CarInfo("aaaaaa", "bbbbbb", 1223.12, 1212, 121, "model", FuelType.BIODIESEL, "decription", Ownership.FIRSTHAND), false, false);
			user.addAdvertisement(add1);
			ReportAdd report1 = new ReportAdd();
			user.addReport(add1,report1);
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
