package sesliHarfler;

public class Main {
	
	public static void main(String[] args) {
		char harf='A';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':	
			System.out.println("Kal�n sesli harfler");
			break;

		default:
			System.out.println("�nce sesli harfler");
			break;
		}
		
		
	}
	
	
}
