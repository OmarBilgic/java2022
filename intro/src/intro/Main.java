package intro;

public class Main {

	public static void main(String[] args) {
		//HELLO WORLD UYGULAMASI
		
		System.out.println("Hello World");
		
		//DE���KEN T�PLER�
		
		int tamsayi= 1;
		System.out.println(tamsayi);
		String karakter ="Karakter";
		double ondalikli_sayi = 2.5;
		char tektip = 'a';
		System.out.println(karakter + " " +  ondalikli_sayi + " " +tektip);
		
		//if else
		int sayi = 21;
		
		if(sayi<20) {
			System.out.println("Say� yirmiden k���kt�r");
		}else if(sayi>20){
			System.out.println("Say� yirmiden b�y�kt�r.");
		}else {
			System.out.println("Say� yirmiye e�ittir");
		}
		// Switch case
		String name= "Ali";
		switch (name) {
		case "Omar":
			System.out.println("Ho�geldiniz Patron");
			break;
		case "Ali":
			System.out.println("Ho�geldin M�d�r");
			break;
		default:
			System.out.println("��ine bak can�m");
			break;
		}
		
		// For D�ng�s�
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("D�ng�m�z bitmi�tirr :)");
		
		//While
		int i=1;
		while (i<5) {
			System.out.println(i);
			i++;
		}
		System.out.println("While D�ng�m�zde bitti");
		
		//Do While
		int j=2;
		do {
			System.out.println(j);
			j+=3;
		} while (j<=10);
		System.out.println("Do-While D�ng�s� bitti");
		
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
		System.out.println("En B�y�k Say�m�z = " + max );
		
		//�OK Boyutlu diziler
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Tekirda�";
		sehirler[1][0] = "�zmir";
		sehirler[1][1] = "U�ak";
		sehirler[1][2] = "Mu�la";
		sehirler[2][0] = "Mardin";
		sehirler[2][1] = "Diyarbak�r";
		sehirler[2][2] = "Batman";
		
		for(int l = 0 ;l<=2;l++) {
			System.out.println("------------------------------");
			for (int k = 0; k<=2 ; k++) {
				System.out.println(sehirler[l][k]);
			}
		}
		
		// Stringlerle �al��mak
		String mesaj= "Bug�n hava �ok g�zel. ";
		System.out.println(mesaj);
		
		System.out.println("Eleman Say�s�: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Ya�as�n!"));
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
