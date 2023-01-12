package com.xworkz.collections;

	//package com.xworkz.collections;

	import java.io.Serializable;

	public class SanitizerDTO implements Serializable 
	{
		private String id;
		private String brand;
		private Double price;
		private String color;

		public SanitizerDTO() {
		}

		public SanitizerDTO(String id, String brand, Double price, String color) {
			super();
			this.id = id;
			this.brand = brand;
			this.price = price;
			this.color = color;
		}

		@Override
		public String toString() {
			return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
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

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

	}

