package com.website1.java;

public class ProductDetails {

	private String productName;
	private String productDesc;
	private int productPrice;
	private String productImageUrl;
	private String productCtg;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public String getProductCtg() {
		return productCtg;
	}
	public void setProductCtg(String productCtg) {
		this.productCtg = productCtg;
	}
	
	@Override
	public String toString() {
		return "ProductDetails [productName=" + productName + ", productDesc=" + productDesc + ", productPrice="
				+ productPrice + ", productImageUrl=" + productImageUrl + ", productCtg=" + productCtg + "]";
		
	}
}
