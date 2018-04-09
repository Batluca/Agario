public class Player {
  	private int mass;
  	private final String name;
  	private List<PlayerCell> cells = new ArrayList<>();
  
  	public Player(double x, double y, String name) {
      	this.name = name;
      	createCell(x, y);
    }
  	
  	//methods
  	public void split() {
      	for (PlayerCell cell : cells) {
          	cell.split()
        }
    }
  
  	private createCell(double x, double y) {
      	cells.append(new PlayerCell(x, y, createColor()));
    }
  
  	private static Color createColor() {
		List<Integer> values = new ArrayList<>(); 
		values.add(255);
		values.add(7);
		values.add((int)Math.round(Math.random()*255));
		Collections.shuffle(values);

		Color color = Color.rgb(
			values.get(0),
			values.get(1),
			values.get(2));

		return color;
	}
  
  	//getters & setters
  	public int getMass() {
      	return mass;
    }
  	public String getName() {
      	return name;
    }
  	
	private class PlayerCell implements Cell, CanEat {
		private int mass;
		private double radian;
		private double x;
		private double y;
	  	private Node node;
	  	private final Color color;
	  	
	  	public PlayerCell(double x, double y, Color color) {
	      	this.x = x;
	      	this.y = y;
	      	this.color = color;
	      	//create cell body
	      	Circle cellBody = new Circle(getX(), getY(), getRadian(), getColor());
	    }
	  	public PlayerCell(double x, double y) {
	      	this(x, y, Settings.START_MASS);
	    }
	  	
	  	
	  	//methods
	  	public void split();
	  	public void eject();
	  	public void delete
	  
	  	public void eat(Cell cell) {
	      	
	    }
	  
	  	public boolean canEat(Cell cell) {
	      	if (getMass() < Math.round(cell.getMass() * 0.1)) {
	          	double distance = Math.sqrt(Math.abs(getX()-cell.getX()) + Math.abs(getY()-cell.getY()));
	          	if (distance < cell.getRadian()) {
	              	return true;
	            }
	        }
	      	return false;
	    }
	  	
	  	//getters & setters
	  	public int getMass() {
	      	return mass;
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
	  	public String getName() {
	    	return name;
	    }
	  	public Node getNode() {
	      	return node;
	    }
	  	public Color getColor() {
	      	return Color;
	    }
	}
}