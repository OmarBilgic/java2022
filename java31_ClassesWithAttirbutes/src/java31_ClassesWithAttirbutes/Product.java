package java31_ClassesWithAttirbutes;

public class Product {
	
	private String name;
	private int id;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	
	public Product(String name, int id, String description, double price, int stockAmount) {
		System.out.println("Yapýcý blok çalýþtý");
		this.name=name;
		this.id=id;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	public Product() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	public String getKod() {
		return this.name.substring(0,1) + this.id;
	}

}
