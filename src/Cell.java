import javafx.scene.Node;

public class Cell {
    private int mass;
    private double x;
    private double y;
    private double radian;
    private Node node;
    
    abstract public void drawCell();
	public int getMass() {
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
        setRadian(Math.sqrt(100 * mass);
    }
    public double getRadian() {
        return radian;
    }
    public void setRadian(double radian) {
        this.radian = randian;
        setMass(Math.round(Math.pow(radian, 2) / 100));
    } 
	public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
	public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
  	public Node getNode() {
        return node;
    }
    public void setNode(Node node) {
        this.node = node;
    }
}

/*
public interface CanEat {
    public void eat(Cell cell);
    public boolean canEat(Cell cell);
}
*/

public class HungryCell extends Cell {
    public void eat(Cell cell) {
        mass += cell.getMass();
    }
    public boolean canEat(Cell cell) {
        if (getMass() > Math.round(cell.getMass() * 1.1)) {
            double distance = Math.sqrt(Math.abs(getX()-cell.getX()) + Math.abs(getY()-cell.getY()));
            if (distance < cell.getRadian()) {
                return true;
            }
        }
        return false;
    }
}