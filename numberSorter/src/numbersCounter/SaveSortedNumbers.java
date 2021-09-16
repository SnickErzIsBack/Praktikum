package numbersCounter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SaveSortedNumbers{
	
	public static void saveText(File file) {
		
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String text = "";
			for(Numbers numberlist : Numbers.numberList)
				{
					text += numberlist + ",";
				}
			bw.write(text);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
