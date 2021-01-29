/**
 * 
 */
package challenge;

import java.util.Random;

/**
 * @author Daniel McAuley
 *
 */
public class MyController {
	
	// constants
	private static final int NUMBER_OF_SHAPES = 10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// array to hold shapes
		IMyShape[] myShapes = new IMyShape[NUMBER_OF_SHAPES];
		
		// create random number generator
		Random generator = new Random();
		
		int temp =0; 
		
		// randomly create shapes and store in array
		for(int loop=0; loop<NUMBER_OF_SHAPES; loop++) {
			temp = generator.nextInt(3);
			switch (temp) {
			case 0:
				myShapes[loop] = new Circle(generator.nextDouble()*generator.nextInt(10), "Circle");
				break;
			case 1:
				myShapes[loop] = new Square("Square", generator.nextDouble()*generator.nextInt(10));
				break;
			case 2:
				myShapes[loop] = new Rectangle("Rectangle", generator.nextDouble()*generator.nextInt(10), generator.nextDouble()*generator.nextInt(10));
				break;
			}
		}
		
		for(IMyShape shape : myShapes) {
			System.out.println(shape.getShapeName());
			System.out.printf("Area = %.2f\n" , shape.calculateArea());
			System.out.printf("Perimeter = %.2f\n" , shape.calculatePerimeter());
			System.out.println();
		}

	}

}
