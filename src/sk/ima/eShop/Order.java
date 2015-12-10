package sk.ima.eShop;

public class Order {
	private int id;
	private int productCount;
	private double totalPrize;
	
	Product prod = new Product();
	
	public Order (Product prod) {
		prod= new Product();
	}
	
	public Order (int id, int productCount, double totalPrize) {
		this.id = id;
		this.productCount = productCount;
		this.totalPrize = totalPrize;
		}
	
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public double getTotalPrize() {
		return totalPrize;
	}

	public void setTotalPrize(double totalPrize) {
		this.totalPrize = totalPrize;
	}
	public String toString() {
		return "";
		
	}
}