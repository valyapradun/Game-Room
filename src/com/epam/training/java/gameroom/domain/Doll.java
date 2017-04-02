package com.epam.training.java.gameroom.domain;

public class Doll extends Toy{
	private String line;
	private String effect;
	
	public Doll() {
		super();
	}
	
	public Doll(String title, SizeToy size, AgeToy age, double price, String line, String effect) {
		super(title, size, age, price);
		this.line = line;
		this.effect = effect;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((effect == null) ? 0 : effect.hashCode());
		result = prime * result + ((line == null) ? 0 : line.hashCode());
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
		Doll other = (Doll) obj;
		if (effect == null) {
			if (other.effect != null)
				return false;
		} else if (!effect.equals(other.effect))
			return false;
		if (line == null) {
			if (other.line != null)
				return false;
		} else if (!line.equals(other.line))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", line: " + line + ", effect: " + effect + "]";
	}

}
