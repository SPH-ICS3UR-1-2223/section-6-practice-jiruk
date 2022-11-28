package LoopShape;

public class LoopShape {

	static void createRectangle(int width, int height) {
		// Draw a Rectangle
		// Draw the top
		for (int i = 0; i < width; i++) {
			System.out.print("#");
		}
		System.out.println();
		// Draw the middle
		for (int j = 0; j < height - 2; j++) {
			System.out.print("#");
			for (int i = 0; i < width - 2; i++) {
				System.out.print(" ");
			}
			if (width > 1) {
				System.out.println("#");
			} else {

			}
		}
		// draw bottom
		for (int i = 0; i < width; i++) {
			System.out.print("#");
		}

		System.out.println();

	}

	static void createTriangle(int leg) {
		// Draw an Isosceles Right Triangle
		if (leg>0) {
			System.out.println("*");
		}
		for (int x=1;x<leg-1;x++) {
			System.out.print("*");
			for (int y=0;y<x-1;y++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int y=0;y<leg;y++) {
			System.out.print("*");
		}
		System.out.println();

	}
}




