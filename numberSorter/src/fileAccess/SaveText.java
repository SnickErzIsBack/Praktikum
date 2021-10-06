package fileAccess;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveText {

	public static void saveText(String a) {
		BufferedWriter bw = null;
		
		try {
			FileWriter fw = new FileWriter("sortedNumbers.txt", true);
			// Datenstrom erzeugen, Datei öffnen
			bw = new BufferedWriter(fw);
			bw.write(a);
			bw.flush();
			// Schreibvorgang erzwingen
			System.out.println("sortedNumbers.txt saved");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("File wasn't saved");
		
		}finally {
			//wird immer ausgeführt
			try {
				bw.close();
				// Datei schließen
				System.out.println("File closed");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
