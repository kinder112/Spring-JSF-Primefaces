package model;

public class Car {
	
	private String id;
	private String brand;
	private int year;
	private String color;
	private int price;
	private boolean sold;

	public Car(String randomId, String randomBrand, int randomYear,
			String randomColor, int randomPrice, boolean randomSoldState) {
		this.id = randomId;
		this.brand = randomBrand;
		this.year = randomYear;
		this.color = randomColor;
		this.price = randomPrice;
		this.sold = randomSoldState;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

}
