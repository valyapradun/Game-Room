package com.epam.training.java.gameroom.domain;

public class Ball extends Toy {
	private String sport;

	public Ball() {
		super();
	}

	public Ball(String title, SizeToy size, AgeToy age, double price, String sport) {
		super(title, size, age, price);
		this.sport = sport;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sport == null) ? 0 : sport.hashCode());
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
		Ball other = (Ball) obj;
		if (sport == null) {
			if (other.sport != null)
				return false;
		} else if (!sport.equals(other.sport))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", sport: " + sport + "]";
	}

}
