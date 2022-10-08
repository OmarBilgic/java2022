package oop1;

public class Main {

	public static void main(String[] args) {
		
		// Set Value (Deðer atama)
		Product product = new Product();
		product.setName("Arzum Kahve Makinesi");
		product.setUnitPrice(6000);
		product.setDiscount(5);
		product.setUnitsInStock(14);
		product.setImageUrl("arzum.jpg");
		//Get Value (Okuma)
		
		Product product1 = new Product();
		product1.setName("Vestel Kahve Makinesi");
		product1.setUnitPrice(6000);
		product1.setDiscount(5);
		product1.setUnitsInStock(14);
		product1.setImageUrl("vestel.jpg");
		
		Product product2 = new Product();
		product2.setName("Arçelik Kahve Makinesi");
		product2.setUnitPrice(6000);
		product2.setDiscount(5);
		product2.setUnitsInStock(14);
		product2.setImageUrl("arçelik.jpg");
		
		Product[] products= {product,product1,product2};
		
		for (Product productName : products) {
			System.out.println(productName.getName());
		}
		System.out.println("-----------------------------------------------");
		
		IniduvalCustomer iniduvalCustomer = new IniduvalCustomer();
		
		iniduvalCustomer.setNumber("100");;
		iniduvalCustomer.setId("1");
		iniduvalCustomer.setPhone("05555555");
		iniduvalCustomer.setCustomerAge(22);
		iniduvalCustomer.setCustomerFirstName("ÖMER");
		iniduvalCustomer.setCustomerLastName("BÝLGÝÇ");
		
		CorparationCustomer corparationCustomer = new CorparationCustomer();
		
		corparationCustomer.setId("2");
		corparationCustomer.setCorparationNumber("101");
		corparationCustomer.setPhone("053333333333");
		corparationCustomer.setCorparationName("Kodlama.ÝO");
		corparationCustomer.setTaxNumber("1246");
		corparationCustomer.setNumber("101");
		
		Customer[] customers= {iniduvalCustomer,corparationCustomer};
		System.out.println(customers.length);

	}

}
