package eCommerce.bussines.abstracts;

import eCommerce.entities.concretes.Users;

public interface IUserService {
	public void singUp(Users user);
	public void singIn(Users user);
}
