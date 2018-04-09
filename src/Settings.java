public class Settings {
  	public static final int PLAYER_START_MASS = 24;
  	public static final int FOOD_MASS = 1;
  	public static final int VIRUS_MIN_AMOUNT = 10;
  	public static final int VIRUS_MAX_AMOUNT = 50;
  	public static final int VIRUS_FEED_AMOUNT = 7;
  	//public static final int 
  	
  	static {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("settings.properties");
			prop.load(input);
			
			PLAYER_START_MASS = prop.getProperty("PLAYER_START_MASS");
			FOOD_MASS = prop.getProperty("FOOD_MASS");
			VIRUS_MIN_AMOUNT = prop.getProperty("VIRUS_MIN_AMOUNT");
			VIRUS_MAX_AMOUNT = prop.getProperty("VIRUS_MAX_AMOUNT");
			VIRUS_FEED_AMOUNT = prop.getProperty("VIRUS_FEED_AMOUNT");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}	
    }
}