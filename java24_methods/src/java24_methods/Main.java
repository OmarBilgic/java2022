package java24_methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
		
	}
	
	
	public static void findNumber() {
		
		int[] sayilar = new int[] {1,2,5,7,8,9,0};
		int aranacak= 12;
		boolean isHave=false;
		
		for(int sayi: sayilar) {
			if(sayi ==aranacak) {
				isHave = true;
				break;
			}
		}
		
		if(isHave) {
			mesajVer("Sayý mevcuttur: " + aranacak);
		}else {
			mesajVer("Sayý mevcut deðildir: " + aranacak);
		}
		 
	 }
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}

 