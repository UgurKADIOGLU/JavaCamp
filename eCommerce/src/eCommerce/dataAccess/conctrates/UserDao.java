package eCommerce.dataAccess.conctrates;

import eCommerce.dataAccess.abstracts.IUserDao;
import eCommerce.entities.concretes.Users;

public class UserDao implements IUserDao {

	@Override
	public void add(Users users) {
		System.out.println("Kullanýcý kayýt edildi : "+users.getFirstName());
		
	}

}
