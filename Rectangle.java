/**
 * 
 */
package challenge;

/**
 * @author Daniel McAuley
 *
 */
public class Rectangle implements IMyShape {
	
	// instance vars
	private String name;
	private double length;
	private double height;
	
	/**
	 * Creates rectangle with no arguments 
	 */
	public Rectangle() {
	}

	/**
	 * Creates rectangle with arguments
	 * @param name
	 * @param length
	 * @param height
	 */
	public Rectangle(String name, double length, double height) {
		this.name = name;
		this.length = length;
		this.height = height;
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

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculatePerimeter() {
		return (this.length*2)+(this.height*2);
	}

	@Override
	public double calculateArea() {
		return this.length*this.height;
	}

	@Override
	public String getShapeName() {
		return this.name;
	}

}
