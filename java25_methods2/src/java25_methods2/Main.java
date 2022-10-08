package java25_methods2;

public class Main {

	public static void main(String[] args) {
		int sayi=gather(10, 20);
			System.out.println(sayi);
		String isim;
		isim=addString("Ali");
		System.out.println(isim);
		int toplam;
		toplam=totalInt(12,12,12,1,4,6,7,0);
		System.out.println(toplam);
		
	}

	
	public static void add() {}
	
	public static void delete() {}
	
	public static void update() {}
	
	public static int gather(int number1, int number2) {
		return number1+number2;
	}
	
	public static String addString(String name) {
		return name+"Tebrikler";
	}
	
	public static int totalInt(int... theNumbers) {
		int total=0;
		for(int number: theNumbers) {
			total+=number;
		}
		
		return total;
	}
	
}
