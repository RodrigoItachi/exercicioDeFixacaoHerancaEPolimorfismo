package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.CANADA);
		Scanner read = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int number = read.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			Character condition = read.next().charAt(0);

			System.out.print("Color (BLACK, BLUE, RED): ");
			Color color = Color.valueOf(read.next());

			if (condition == 'r') {
				System.out.print("Width: ");
				Double width = read.nextDouble();
				
				System.out.print("Height: ");
				Double height = read.nextDouble();

				shapes.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				Double radius = read.nextDouble();

				shapes.add(new Circle(color, radius));
			}

		}

		System.out.println();
		System.out.println("SHAPES AREAS: ");
		for (Shape shape : shapes) {
			System.out.println(shape);
		}

		read.close();
	}

}