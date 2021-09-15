package numbersCounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			
			if(e.getSource().equals(mw.btnSaver) )
				{
					fillNumbersSoFar();
					
			}else if (e.getSource().equals(mw.btnSorter))
				{
					mw.taNumbersSoFar.setText("");
					
					CreateNTSNarr obj = new CreateNTSNarr();
					int numbersToSort[] = obj.createNTSNarr();
										
					bubbleSort(numbersToSort);

					for (int j =0; j< numbersToSort.length; j++)
					{
						sortedOutput += String.valueOf(numbersToSort[j]) + "\n";
					}
					mw.taSortedNumbers.setText(sortedOutput);				
				}
		}
	
	
	public void fillNumbersSoFar()
		{
			String numbersSoFar = "";
		
			if(Numbers.numberList.size()<5)
			{
				if( mw.tfEnterNumbersHere.getText().matches("[0-9]+") )
				{
					Numbers.numberList.add(new Numbers(mw.tfEnterNumbersHere.getText()));
					for (Numbers numbers: Numbers.numberList)
						{
							numbersSoFar += numbers.getNumber() + "\n";
						}
					mw.taNumbersSoFar.setText(numbersSoFar);
					switchENSF();
					mw.tfEnterNumbersHere.setText("");
					if(Numbers.numberList.size()>=5)
						{
							mw.btnSaver.setEnabled(false);
							mw.btnSorter.setEnabled(true);
						}
				}else{
					mw.lbl_EnterNumbers.setText("Please enter an ACTUAL number!");
					mw.tfEnterNumbersHere.setText("");
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
	

