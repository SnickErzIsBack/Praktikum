package inputOutput;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import businessLogic.BubbleSort;
import fileAccess.SaveText;
import numbersCounter.NumbersTSNArrayCreator;
import numbersCounter.MainWindow;
import numbersCounter.Numbers;

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
			NumbersTSNArrayCreator obj = new NumbersTSNArrayCreator();
			int numbersToSort[] = obj.createNTSNarr();
						
			if (e.getSource().equals(mw.getBtnSaver())) {
		
				fillNumbersSoFar();
				// nach Prüfung Übergabe jeder Eingabe einzeln in "taNumbersSoFar"
					
			}else if (e.getSource().equals(mw.getBtnSorter())) {

				mw.getTaNumbersSoFar().setText("");
				
				mw.getTaSortedNumbers().setText(BubbleSort.algorithm(numbersToSort));
				// Ausgabe im Ausgabefeld "taSortedNumbers"
				
				mw.getBtnSorter().setEnabled(false);
				mw.getBtnSSNtofile().setEnabled(true);
				mw.getLblSortedNumbers().setText("Your numbers are sorted now");
				// Switchen der Aktivität der Buttons 
			
			}else if (e.getSource().equals(mw.getBtnSSNtofile())) { 
				
				SaveText.saveText(BubbleSort.algorithm(numbersToSort));
				// Speichern in TextFeld, statischer Speicherort
			}
		}
	
	public void fillNumbersSoFar()
		{
			String numbersSoFar = "";
		
			if(Numbers.numberList.size()<5)
			{
				if( mw.getTfEnterNumbersHere().getText().matches("[0-9]+") )
					// Prüfung des eingegebenen Wertes
				{
					Numbers.numberList.add(new Numbers(mw.getTfEnterNumbersHere().getText()));
					for (Numbers numbers: Numbers.numberList)
						{
							numbersSoFar += numbers.getNumber() + "\n";
						}
					mw.getTaNumbersSoFar().setText(numbersSoFar);
					// Ausgabe aller bisherigen Werte in "taNumbersSoFar"
					switchENSF();
					// Änderung des Anweisungstextes in "lbl_EnterNumbers"
					mw.getTfEnterNumbersHere().setText("");
					// Leeren des Eingabefeldes
					if(Numbers.numberList.size()>=5)
						{
							mw.getBtnSaver().setEnabled(false);
							mw.getBtnSorter().setEnabled(true);
							// Switchen der Aktivität der Buttons
						}
				}else{
					mw.getLbl_EnterNumbers().setText("Please enter an ACTUAL number!");
					// Ausgabe bei Falscheingabe
					mw.getTfEnterNumbersHere().setText("");
					// Leeren des Eingabefeldes
				}
			}
		}
	
	public void switchENSF()
		{
			switch (Numbers.numberList.size())
				{
					case 1:
						{mw.getLbl_EnterNumbers().setText("Please enter your second number!");
						mw.getTfEnterNumbersHere().requestFocus();
							break;}
					case 2:
						{mw.getLbl_EnterNumbers().setText("Please enter your third number!");
						mw.getTfEnterNumbersHere().requestFocus();
							break;}
					case 3:
						{mw.getLbl_EnterNumbers().setText("Please enter your fourth number!");
						mw.getTfEnterNumbersHere().requestFocus();
							break;}
					case 4:
						{mw.getLbl_EnterNumbers().setText("Please enter your last number!");
						mw.getTfEnterNumbersHere().requestFocus();
							break;}
					case 5:
						{mw.getLbl_EnterNumbers().setText("You have entered 5 numbers!");
						mw.getLblNumbersSoFar().setText("You can sort them now!");
						break;}
					default:
							break;
				}
		}
	
}
//last update 210915 - 2121
