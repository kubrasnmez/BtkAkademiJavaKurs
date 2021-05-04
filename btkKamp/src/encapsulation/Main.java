package encapsulation;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Lenovo Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(7);
		
		Product product = new Product(1,"Laptop","Lenova Laptop", 5000,7,"Siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		}

}
