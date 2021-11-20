package eCommerce;

import eCommerce.bussines.abstracts.IUserService;
import eCommerce.bussines.concretes.USerCheckManager;
import eCommerce.bussines.concretes.UserManager;
import eCommerce.bussines.concretes.VerifyMailManager;
import eCommerce.dataAccess.conctrates.UserDao;
import eCommerce.entities.concretes.Users;

public class Main {

	public static void main(String[] args) {
		IUserService iUserService= new UserManager(new VerifyMailManager(), new USerCheckManager(), new UserDao());
		
		Users user= new Users(1,"Uður","Kadýoðlu","ugrkadioglu@gmail.com","1234"); 
		iUserService.singUp(user);
		iUserService.singIn(user);
		

	}

}
