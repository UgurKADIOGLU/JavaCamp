package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "Ýnternet Þubesi";
		int vade = 9;
		double dolarDun = 8.18;
		double dolarBugun = 8.18;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþmüþ");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar çýkmýþ");
		} else {
			System.out.println("Dolar ayný");
		}

		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu emekli kredi";
		String kredi3 = "Mutlu emekli kredi";
		String kredi4 = "Çiftçi kredi";
		String kredi5 = "Msb kredi";

		String[] krediler = { "Hýzlý kredi", "Mutlu emekli kredi", "Mutlu emekli kredi", "Çiftçi kredi", "Msb kredi",
				"Uður kredisi" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++ ) {
			System.out.println(krediler[i]);
		}
	}

}
