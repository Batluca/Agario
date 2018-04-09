public class Virus implements Cell, CanEat {
  	private int mass;
  	private double radian;
  	private final double x;
  	private final double y;
  	private Node node;
  
  	public Virus(double x, double y) {
      	this.x = x;
      	this.y = y;
    }
}