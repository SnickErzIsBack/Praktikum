package numbersCounter;

public class CreateNTSNarr {

	public int[] createNTSNarr()
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
