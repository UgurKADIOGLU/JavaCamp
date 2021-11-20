package eCommerce.bussines.concretes;

import eCommerce.bussines.abstracts.UserCheckService;
import eCommerce.entities.concretes.Users;

public class USerCheckManager implements UserCheckService {

	@Override
	public boolean checkMail(Users users) {
		String pattern ="^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
		
		if (users.geteMail().matches(pattern) == false) {
			System.out.println("L�tfen ge�erli bir mail adresi giriniz : "+users.geteMail());
			users.geteMail();
		}
		
		return users.geteMail().matches(pattern);
	}

	@Override
	public boolean checkPassword(Users users) {
		if (users.getPassword().length()<7) {
			System.out.println("L�tfen ge�erli bir parola giriniz. Girilen parola minumum 6 karakter olmal�");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean checkFistName(Users users) {
		if (users.getFirstName().length()<3) {
			System.out.println("L�tfen ge�erli bir isim giriniz. Girilen isim minumum 2 karakter olmal�");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean checkLasttName(Users users) {
		if (users.getLastName().length()<3) {
			System.out.println("L�tfen ge�erli bir isim giriniz. Girilen Soyisim minumum 2 karakter olmal�");
			return false;
		}else {
			return true;
		}
	}

}
