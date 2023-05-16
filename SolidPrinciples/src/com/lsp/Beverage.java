package com.lsp;

public class Beverage extends Menu {

	private String id;
	private String category;
	private String foodName;
	private int price;

	public Beverage(String id, String category, String foodName, int price) {
		super(id, category, foodName, price);
		this.price = price;
	}

	public int getAmount() {
		return price - this.getDiscount();
	}

	public int getDiscount() {
		return 50;
	}
}
