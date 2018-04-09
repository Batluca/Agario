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
  
	public int getMass();
	public double getRadian() {
      	return radian;
    }
	public double getX() {}
	public double getY();
  	public Node getNode();
}

public interface CanEat {
    public void eat(Cell cell);
    public boolean canEat(Cell cell);
}