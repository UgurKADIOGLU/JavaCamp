package eCommerce.bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.bussines.abstracts.VerifyMailService;
import eCommerce.entities.concretes.Users;

public class VerifyMailManager implements VerifyMailService {

	
	List<String> emailList = new ArrayList<String>();
	
	@Override
	public void sendToVerifyMaill(Users users) {
		System.out.println("Do�rulama linki "+users.geteMail()+" adresine g�nderildi.");
		
	}

	@Override
	public void VerifyMaill(Users users) {
		System.out.println("Do�rulama "+users.geteMail()+" adresi i�inn yap�ld�.");
		
	}

	@Override
	public boolean checkVerifyMaill(Users users) {
		if (emailList.contains(users.geteMail())) {
			System.out.println("Bu e mail adresi daha �nce kay�tl�.");
			return false;
		}else {
			return true;
		}
		
	}

}
