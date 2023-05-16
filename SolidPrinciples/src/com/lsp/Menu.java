package com.lsp;

public class Menu {
	private String id;
	private String category;
	private String foodName;
	private int price;

	public Menu(String id, String category, String foodName, int price) {
		this.id = id;
		this.category = category;
		this.foodName = foodName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", category=" + category + ", foodName=" + foodName + ", price=" + price + "]";
	}

	public int getAmount() {
		return price - this.getDiscount();
	}

	public int getDiscount() {
		return 0;
	}

}
