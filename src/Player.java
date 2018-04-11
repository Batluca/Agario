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
    private void deleteCell() {

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
  	
  	//inner class
	private class PlayerCell extends Cell implements CanEat {
		
	  	public PlayerCell(double x, double y, double radian) {
	      	this.x = x;
	      	this.y = y;
	      	this.randian = randian;
	      	//create cell body
	      	Circle node = new Circle(x, y, radian, getColor());
	    }
	    public PlayerCell(double x, double y, int mass) {
	    	setRadian(mass);
	      	this(x, y, getRadian());
	    }
	  	public PlayerCell(double x, double y) {
	      	this(x, y, Settings.START_MASS);
	    }
	  	
	  	
	  	//methods
	  	public void split();
	  	public void eject();
	  	public void delete();
	  
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