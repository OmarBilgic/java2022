package java31_ClassesWithAttirbutes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product("Msi", 1, "S�per bi�i yav", 7000, 5);
		product.setName("Msi");
		product.setId(1);
		product.setPrice(7000);
		product.setStockAmount(5);
		product.setDescription("S�per bi�i yavv");
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());

	}

}
