package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		boolean result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong("43771598666"), "UÐUR", "KADIOÐLU", 1983);
		if(result) {
			System.out.println("Giriþ baþarýlý");
		}else {
			System.out.println("Giriþ baþarýsýz");
		}

	}

}
