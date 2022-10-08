package java27_classes;

public class Main {

	public static void main(String[] args) {
		//reference type
		CustomerManager customerManager;
		CustomerManager customerManager1 = new CustomerManager();
		customerManager=customerManager1;
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();
	}

}
