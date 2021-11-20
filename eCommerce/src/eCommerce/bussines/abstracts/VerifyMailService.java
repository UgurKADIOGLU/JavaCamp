package eCommerce.bussines.abstracts;

import eCommerce.entities.concretes.Users;

public interface VerifyMailService {
	public void sendToVerifyMaill(Users users);

	public void VerifyMaill(Users users);

	public boolean checkVerifyMaill(Users users);
}
