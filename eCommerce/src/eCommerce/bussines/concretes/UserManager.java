package eCommerce.bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.bussines.abstracts.IUserService;
import eCommerce.bussines.abstracts.UserCheckService;
import eCommerce.bussines.abstracts.VerifyMailService;
import eCommerce.dataAccess.abstracts.IUserDao;
import eCommerce.dataAccess.conctrates.UserDao;
import eCommerce.entities.concretes.Users;

public class UserManager implements IUserService {

	VerifyMailService verifyMailService;
	UserCheckService userCheckService;
	IUserDao iUserDao;
	private List<Users> userList = new ArrayList<Users>();

	public UserManager(VerifyMailService verifyMailService, UserCheckService userCheckService, IUserDao iUserDao) {
		super();
		this.verifyMailService = verifyMailService;
		this.userCheckService = userCheckService;
		this.iUserDao = iUserDao;
		List<Users> user = new ArrayList<Users>();
	}

	@Override
	public void singUp(Users user) {
		if (userList.contains(user) == false) {
			
			if (userCheckService.checkFistName(user) && userCheckService.checkLasttName(user)
					&& userCheckService.checkMail(user) && userCheckService.checkPassword(user)) {
				
				System.out.println("Üyeliðiniz gerçekleþti");
				userList.add(user);
				iUserDao.add(user);
				verifyMailService.sendToVerifyMaill(user);
			}
		}else {
			verifyMailService.checkVerifyMaill(user);
		}
	}

	@Override
	public void singIn(Users user) {
		if (userList.contains(user)==false) {
			System.out.println("Kaydýnýz bulunmamaktadýr. Lütfen kayýt olunuz.");
		}
		
		if(userList.contains(user)== true && user.getPassword() != null) {
			System.out.println("Giriþiniz yapýldý.. Hoþ geldiniz : " +
					  user.getFirstName());
		}

	}

}
