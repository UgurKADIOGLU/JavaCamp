package eCommerce.bussines.abstracts;

import eCommerce.entities.concretes.Users;

public interface UserCheckService {
	public boolean checkMail(Users users);

	public boolean checkPassword(Users users);

	public boolean checkFistName(Users users);

	public boolean checkLasttName(Users users);
}
