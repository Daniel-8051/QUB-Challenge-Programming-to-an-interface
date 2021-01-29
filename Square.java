/**
 * 
 */
package challenge;

/**
 * @author Daniel McAuley
 *
 */
public class Square implements IMyShape {
	
	// instance vars
	private String name;
	private double length;

	/**
	 * Creates square with no arguments
	 */
	public Square() {
	}

	/**
	 * Creates square with all arguments
	 * @param name
	 * @param length
	 */
	public Square(String name, double length) {
		this.name = name;
		this.length = length;
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

	@Override
	public double calculatePerimeter() {
		return this.length*4;
	}

	@Override
	public double calculateArea() {
		return this.length*this.length;
	}

	@Override
	public String getShapeName() {
		return this.name;
	}

}
