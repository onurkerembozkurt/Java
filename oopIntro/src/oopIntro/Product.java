package oopIntro;

public class Product {


	//Encapsulation
	
	private String name;
	private int id;	
	private double unitPrice;
	private String details;
	private double discount;
	
	

	public Product(int id, String Name, double unitPrice,String detail,double discount) {
		this.id=id;
		this.name=Name;
		this.unitPrice=unitPrice;
		this.details=detail;
		this.discount=discount;
		
		
		
		
		
	}

 
	public Product() {
		// TODO Auto-generated constructor stub
	}


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


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPriceAfterDiscount() {
		
		
		return this.unitPrice-(this.unitPrice*this.discount/100);// bunu okumak istiyoruz
		
		
	
	
	
	
	}
	

	

}
