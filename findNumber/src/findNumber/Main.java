package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,8,9,0};
		int aranacak= 6;
		boolean isHave=false;
		
		for(int sayi: sayilar) {
			if(sayi ==aranacak) {
				isHave = true;
				break;
			}
		}
		
		if(isHave) {
			System.out.println("Sayý mevcuttur");
		}else {
			System.out.println("Sayý mevcut deðildir");
		}
		
	}

}
