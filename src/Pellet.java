public class Pellet implements Cell {
  	private static final int MASS = 1;
	private static final double RADIAN = 22.5;
	private final double x;
	private final double y;
  	private final Node node; //may shouldn't be final ._.
  
  	public Pellet(double x, double y) {
      	this.x = x;
      	this.y = y;
    }
  	
  	//getters & setters
	public int getMass() {
      	return MASS;
    }
	public double getRadian() {
      	return RADIAN;
    }
	public double getX() {
      	return x;
    }
	public double getY() {
      	return y;
    }
  	public Node getNode() {
      	return node;
    }
}