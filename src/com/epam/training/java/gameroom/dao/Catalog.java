package com.epam.training.java.gameroom.dao;

import java.util.ArrayList;

import com.epam.training.java.gameroom.domain.AgeToy;
import com.epam.training.java.gameroom.domain.Ball;
import com.epam.training.java.gameroom.domain.Car;
import com.epam.training.java.gameroom.domain.Constructor;
import com.epam.training.java.gameroom.domain.Doll;
import com.epam.training.java.gameroom.domain.SizeToy;
import com.epam.training.java.gameroom.domain.Toy;

public class Catalog {
	private ArrayList<Toy> catalog = new ArrayList<Toy>();

	public Catalog() {
		catalog.add(new Ball("Basketball ball", SizeToy.MEDIUM, AgeToy.NINE, 34, "basketball"));
		catalog.add(new Ball("Wubble Bubble Ball", SizeToy.LARGE, AgeToy.THREE, 25.32, "no"));
		catalog.add(new Ball("Tennis balls (3 pieces)", SizeToy.SMALL, AgeToy.NINE, 25.7, "tennis"));
		catalog.add(new Ball("Football ball", SizeToy.MEDIUM, AgeToy.SIX, 65, "football"));
		catalog.add(new Ball("Ñhildren's ball", SizeToy.LARGE, AgeToy.THREE, 9.5, "no"));
		catalog.add(new Car("Tractor Don", SizeToy.MEDIUM, AgeToy.SIX, 17.6, "technique", "yellow"));
		catalog.add(new Car("Inertial racing car", SizeToy.SMALL, AgeToy.NINE, 18.9, "race", "red"));
		catalog.add(new Car("Ambulance", SizeToy.MEDIUM, AgeToy.THREE, 35, "helper", "white"));
		catalog.add(new Car("Tank", SizeToy.LARGE, AgeToy.SIX, 32.8, "military equipment", "khaki"));
		catalog.add(new Car("Toy bus", SizeToy.LARGE, AgeToy.THREE, 19.5, "helper", "green"));
		catalog.add(new Constructor("Lego Duplo Kindergarten", SizeToy.MEDIUM, AgeToy.THREE, 38, "Lego"));
		catalog.add(new Constructor("Lego City Van Pizzeria", SizeToy.MEDIUM, AgeToy.SIX, 38.7, "Lego"));
		catalog.add(new Constructor("Lego Technic Motorcycle", SizeToy.SMALL, AgeToy.NINE, 48.8, "Lego"));
		catalog.add(new Constructor("Cubes Alphabet", SizeToy.LARGE, AgeToy.THREE, 12, "Cubes"));
		catalog.add(new Constructor("Math Cubes", SizeToy.LARGE, AgeToy.SIX, 10.6, "Cubes"));
		catalog.add(new Constructor("Magnetic ñonstructor Magformers", SizeToy.MEDIUM, AgeToy.NINE, 10.6,
				"Magnetic ñonstructor"));
		catalog.add(new Doll("Doll Barbie princess", SizeToy.MEDIUM, AgeToy.SIX, 94.6, "Barbie", "without effects"));
		catalog.add(
				new Doll("Doll Baby Born for bathing", SizeToy.LARGE, AgeToy.THREE, 76.8, "Baby Born", "audio effect"));
		catalog.add(new Doll("Doll Monster High Franky Shtein", SizeToy.MEDIUM, AgeToy.NINE, 95.3, "Monster High",
				"sound and light effects"));
		catalog.add(
				new Doll("Doll Ever After High Medellin", SizeToy.MEDIUM, AgeToy.NINE, 84.2, "Ever After High", "no"));
		catalog.add(new Doll("Doll Baby Annabell", SizeToy.MEDIUM, AgeToy.SIX, 73, "Baby Annabell", "sound effects"));
	}

	public ArrayList<Toy> getCatalog() {
		return catalog;
	}

}
