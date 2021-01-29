/**
 * 
 */
package challenge;

/**
 * @author Daniel McAuley
 *
 */
public class Circle implements IMyShape {
	
	private double radius;
	private String name;

	/**
	 * Creates circle with no arguments
	 */
	public Circle() {
	}

	/**
	 * Creates circle with all arguments
	 * @param radius
	 */
	public Circle(double radius, String name) {
		this.radius = radius;
		this.name = name;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double calculatePerimeter() {
		return Math.PI*(radius*2);
	}

	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String getShapeName() {
		return this.name;
	}

}
