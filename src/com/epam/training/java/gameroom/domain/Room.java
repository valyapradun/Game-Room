package com.epam.training.java.gameroom.domain;

import java.util.ArrayList;

public class Room {
	private ArrayList<Toy> toys;
	private int count;
	private double cost;

	public Room() {
	}

	public Room(int count, double cost) {
		this.count = count;
		this.cost = cost;
		this.toys = new ArrayList<Toy>();
	}

	public ArrayList<Toy> getToys() {
		return toys;
	}
	
	public Toy getToy(int index) {
		return toys.get(index);
	}
	
	public void setToys(ArrayList<Toy> toys) {
		this.toys = toys;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + count;
		result = prime * result + ((toys == null) ? 0 : toys.hashCode());
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
		Room other = (Room) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (count != other.count)
			return false;
		if (toys == null) {
			if (other.toys != null)
				return false;
		} else if (!toys.equals(other.toys))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GameRoom [toys=" + toys + ", count=" + count + ", cost=" + cost + "]";
	}

	public void addToy(Toy toy) {
		toys.add(toy);
	}

	public void deleteToy(Toy toy) {
		toys.remove(toy);
	}
}
