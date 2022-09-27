package intro;

public class Main {

	public static void main(String[] args) {
		//HELLO WORLD UYGULAMASI
		
		System.out.println("Hello World");
		
		//DEÐÝÞKEN TÝPLERÝ
		
		int tamsayi= 1;
		System.out.println(tamsayi);
		String karakter ="Karakter";
		double ondalikli_sayi = 2.5;
		char tektip = 'a';
		System.out.println(karakter + " " +  ondalikli_sayi + " " +tektip);
		
		//if else
		int sayi = 21;
		
		if(sayi<20) {
			System.out.println("Sayý yirmiden küçüktür");
		}else if(sayi>20){
			System.out.println("Sayý yirmiden büyüktür.");
		}else {
			System.out.println("Sayý yirmiye eþittir");
		}
		// Switch case
		String name= "Ali";
		switch (name) {
		case "Omar":
			System.out.println("Hoþgeldiniz Patron");
			break;
		case "Ali":
			System.out.println("Hoþgeldin Müdür");
			break;
		default:
			System.out.println("Ýþine bak caným");
			break;
		}
		
		// For Döngüsü
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngümüz bitmiþtirr :)");
		
		//While
		int i=1;
		while (i<5) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngümüzde bitti");
		
		//Do While
		int j=2;
		do {
			System.out.println(j);
			j+=3;
		} while (j<=10);
		System.out.println("Do-While Döngüsü bitti");
		
		// Diziler
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Omar";
		ogrenciler[1]="Yunus";
		ogrenciler[2]="Ali";
		
		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}
		
		// My Demo
		
		double[] myList = {1.5,20,2.4,30,50.7,8};
		double total=0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;
			}
				total = total + number;
				System.out.println(number);
			
		}
		
		System.out.println("Toplam = " + total );
		System.out.println("En Büyük Sayýmýz = " + max );
		
		//ÇOK Boyutlu diziler
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Tekirdað";
		sehirler[1][0] = "Ýzmir";
		sehirler[1][1] = "Uþak";
		sehirler[1][2] = "Muðla";
		sehirler[2][0] = "Mardin";
		sehirler[2][1] = "Diyarbakýr";
		sehirler[2][2] = "Batman";
		
		for(int l = 0 ;l<=2;l++) {
			System.out.println("------------------------------");
			for (int k = 0; k<=2 ; k++) {
				System.out.println(sehirler[l][k]);
			}
		}
		
		// Stringlerle Çalýþmak
		String mesaj= "Bugün hava çok güzel. ";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayýsý: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaþasýn!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("."));
		
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(5,10));
		System.out.println();
		
		for (String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
