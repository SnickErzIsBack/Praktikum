package numbersCounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

// HIER: Logik basierend auf einzelnen ButtonKlicks

public class ButtonKlick implements ActionListener {

	MainWindow mw;

	public ButtonKlick(MainWindow window)
		{
			this.mw = window;
		};

	@Override
	public void actionPerformed(ActionEvent e)
		{
			String sortedOutput = "";
			
			if (e.getSource().equals(mw.btnSaver)) {
		
				fillNumbersSoFar();
				// Übergabe jeder Eingabe einzeln nach Prüfung in TextArea "taNumbersSoFar"
					
			}else if (e.getSource().equals(mw.btnSorter)) {

				mw.taNumbersSoFar.setText("");
					
				CreateNTSNarr obj = new CreateNTSNarr();
				int numbersToSort[] = obj.createNTSNarr();
				// Übergabe ArrayList in Objekt zur Bildung eines Arrays
				
				bubbleSort(numbersToSort);
				// Ausgabe Array über Methode BubbleSort mit gleichnamigen Sortieralgorithmus sortiert
				
				for (int j =0; j< numbersToSort.length; j++)
					{
						sortedOutput += String.valueOf(numbersToSort[j]) + "\n";
					}
				
				mw.taSortedNumbers.setText(sortedOutput);
				//Ausgabe im Ausgabefeld TextArea "taSortedNumbers"
				mw.btnSorter.setEnabled(false);
				mw.btnSSNtofile.setEnabled(true);
				//Switchen der Aktivität der Buttons nach Ablauf der Arbeitsschritte 
			
			}else if (e.getSource().equals(mw.btnSSNtofile)) { 
				//WORK IN PROGRESS
				
				File file = new File( new File("sortedNumbers.txt").getAbsolutePath() );
				
				JFileChooser exportDialog = new JFileChooser();
				exportDialog.setSelectedFile(file);
				int result = exportDialog.showSaveDialog(mw);				
				if(result == JFileChooser.APPROVE_OPTION){
					file = exportDialog.getSelectedFile();
					SaveSortedNumbers.saveText(file); // funktioniert noch nicht 
				}
			}
		}
	
	
	public void fillNumbersSoFar()
		{
			String numbersSoFar = "";
		
			if(Numbers.numberList.size()<5)
			{
				if( mw.tfEnterNumbersHere.getText().matches("[0-9]+") )
					//Prüfung des eingegebenen Wertes
				{
					Numbers.numberList.add(new Numbers(mw.tfEnterNumbersHere.getText()));
					for (Numbers numbers: Numbers.numberList)
						{
							numbersSoFar += numbers.getNumber() + "\n";
						}
					mw.taNumbersSoFar.setText(numbersSoFar);
					//Ausgabe der bisher eingebenen Werte ins Zwischenschritt-Ausgabefenster "taNumbersSoFar"
					switchENSF();
					//Änderung des Anweisungstextes in "lbl_EnterNumbers" für die Zahleneingabe
					mw.tfEnterNumbersHere.setText("");
					//Leeren des Eingabefeldes
					if(Numbers.numberList.size()>=5)
						{
							mw.btnSaver.setEnabled(false);
							mw.btnSorter.setEnabled(true);
							//Switchen der Aktivität der Buttons nach Ablauf der Arbeitsschritte
						}
				}else{
					mw.lbl_EnterNumbers.setText("Please enter an ACTUAL number!");
					mw.tfEnterNumbersHere.setText("");
					//Ausgabe bei Falscheingabe & Leeren des Eingabefeldes
				}
			}
		}
	
	public void switchENSF()
		{
			switch (Numbers.numberList.size())
				{
					case 1:
						{mw.lbl_EnterNumbers.setText("Please enter your second number!");
							break;}
					case 2:
						{mw.lbl_EnterNumbers.setText("Please enter your third number!");
							break;}
					case 3:
						{mw.lbl_EnterNumbers.setText("Please enter your fourth number!");
							break;}
					case 4:
						{mw.lbl_EnterNumbers.setText("Please enter your last number!");
							break;}
					case 5:
						{mw.lbl_EnterNumbers.setText("You have entered 5 numbers!");
						break;}
					default:
							break;
				}
		}
		
	public static void bubbleSort(int[] arr)
	//BubbleSort-Algorithmus
		{
			boolean sorted = false;
			int momentary;
						    
			while(!sorted)
				{
					sorted = true;
				        for (int i = 0; i < arr.length - 1; i++)
					        {
					            if (arr[i] > arr[i+1])
					            	{
						                momentary	= arr[i];
						                arr[i]	= arr[i+1];
						                arr[i+1]	= momentary;
						                sorted	= false;
					            	}
					        }
				}
			return;
		}
	
}
//last update 210915 - 2121
