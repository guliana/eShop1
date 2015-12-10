package sk.ima.eShop;


public class Product {
	private int id;
	private String productName;
	private double productPrize;
	
	public Product () {
			}
	public Product(int id, String productName, double productPrize) {
		this.id = id;
		this.productName = productName;
		this.productPrize = productPrize;
	}
	/*	
	public String toString() {
		return "Product :" + getId() + " " + getProductName()+ " " + getProductPrize()+ " ";
	}*/
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrize() {
		return productPrize;
	}
	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}
	@Override
	public String toString() {
		return "Product " + productName +", " +productPrize +"e (id."+ id + ")" ; 
	}
	
	

	
}
