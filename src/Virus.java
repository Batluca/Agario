
public class Virus extends Cell implements CanEat {
  	private int mass;
  	private double radian;
  	private final double x;
  	private final double y;
  	private Node node;
  
  	public Virus(double x, double y) {
      	this.x = x;
      	this.y = y;
    }

    private void split(double angle) {
    	Virus virusClone = new Virus(getX(), getY());
    	//add new Virus to game-object-list
    	//split animation
    }
    
    public void eat(EjectedMass cell) {
    	setMass(getMass()+cell.getMass());
    	cell.delete();
    }

    public void delete() {
    	//remove from game-object-list
    }
}
