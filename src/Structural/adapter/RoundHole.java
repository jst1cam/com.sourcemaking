package Structural.adapter;

public class RoundHole {
	
	private final int radius;

	
	public RoundHole(int radius) {
		this.radius = radius;
		System.out.println("Roundhole: max SquarePeg is " + radius * Math.sqrt(2));
	}


	public int getRadius() {
		return radius;
	}
	
	
	
	

}
