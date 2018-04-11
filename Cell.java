import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class Cell {
    private double x;
    private double y;
    private double radian;
    private Node node;
  
	public int getMass() {
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
        this.radian = Math.sqrt(100 * mass);
    }
    public double getRadian() {
        return radian;
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

public interface CanEat {
    public void eat(Cell cell);
    public boolean canEat(Cell cell);
}