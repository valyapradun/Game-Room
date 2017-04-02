package com.epam.training.java.gameroom.domain;

public class Constructor extends Toy {
	private String type;

	public Constructor() {
		super();
	}

	public Constructor(String title, SizeToy size, AgeToy age, double price, String type) {
		super(title, size, age, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Constructor other = (Constructor) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", type: " + type + "]";
	}

}
