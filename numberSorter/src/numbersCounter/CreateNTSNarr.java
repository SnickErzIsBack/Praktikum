package numbersCounter;

public class CreateNTSNarr {

	public int[] createNTSNarr()
	//Erzeugung des Arrays aus der ArrayList zur Weiterverarbeitung in BubbleSort
	{
		int i =0;
		int[] numbersToSort = new int[5];
		
		for (Numbers numbers: Numbers.numberList)
			{
				numbersToSort[i] = Integer.parseInt(numbers.getNumber());
				i++;
			}
		return numbersToSort;
	}
}
//last update 210915 - 2121
