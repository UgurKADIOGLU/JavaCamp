package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "�nternet �ubesi";
		int vade = 9;
		double dolarDun = 8.18;
		double dolarBugun = 8.18;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��m��");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar ��km��");
		} else {
			System.out.println("Dolar ayn�");
		}

		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredi";
		String kredi3 = "Mutlu emekli kredi";
		String kredi4 = "�ift�i kredi";
		String kredi5 = "Msb kredi";

		String[] krediler = { "H�zl� kredi", "Mutlu emekli kredi", "Mutlu emekli kredi", "�ift�i kredi", "Msb kredi",
				"U�ur kredisi" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++ ) {
			System.out.println(krediler[i]);
		}
	}

}
