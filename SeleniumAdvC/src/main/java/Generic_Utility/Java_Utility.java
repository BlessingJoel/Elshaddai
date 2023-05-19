package Generic_Utility;

import java.util.Random;

public class Java_Utility {
	
	/**
	 * 
	 * @return
	 */
	
	public int getRandomnum() {
		Random ran=new Random();
		int rannum=ran.nextInt(88);
		return rannum;
	}

}
