package numbersCounter;

import java.util.ArrayList;

public class Numbers {

	//public static ArrayList<Numbers>numberList;
	public static ArrayList<Numbers> numberList = new ArrayList<Numbers>();
	
	private String number;

	/**
	 * @param string
	 */
	public Numbers(String number)
		{
			this.number = number;
		}

	public String getNumber()
		{
			return number;
		}
	
	public void setNumber(String number)
		{
			this.number = number;
		}
	
}	
//last update 210915 - 2121
