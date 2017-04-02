package com.epam.training.java.gameroom.domain;

abstract public class Toy {
	private String title;
	private SizeToy size;
	private AgeToy age;
	private double price;

	public Toy() {

	}

	public Toy(String title, SizeToy size, AgeToy age, double price) {
		this.title = title;
		this.size = size;
		this.age = age;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SizeToy getSize() {
		return size;
	}

	public void setSize(SizeToy size) {
		this.size = size;
	}

	public AgeToy getAge() {
		return age;
	}

	public void setAge(AgeToy age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (size != other.size)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Toy [title: " + title + ", size: " + size + ", age: " + age + ", price: " + price;
	}

}
