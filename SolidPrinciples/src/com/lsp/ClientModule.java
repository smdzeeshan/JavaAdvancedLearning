package com.lsp;

public class ClientModule {
	public static void main(String[] args) {

		Menu curry = new Menu("101", "veg", "curry", 100);
		System.out.println(curry.getAmount());

		Menu samosa = new Beverage("202", "bev", "samosa", 300);
		System.out.println(samosa.getAmount());
		;

	}
}
