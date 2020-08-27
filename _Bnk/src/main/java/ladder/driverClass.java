package ladder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class driverClass {
	
	final Logger log2 = LogManager.getLogger(driverClass.class);
	

	public static void main(String[] args) {
		bankApp bA = new bankApp();
		bA.run();

	}

}
