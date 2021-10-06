package businessLogic;

public class BubbleSort {
	
	public static String algorithm(int[] arr) {
		boolean sorted = false;
		int momentary;
		
		// BubbleSort-Algorithmus						    
		while(!sorted)
			{
				sorted = true;
			        for (int i = 0; i < arr.length - 1; i++)
				        {
				            if (arr[i] > arr[i+1])
				            	{
					                momentary	=	arr[i];
					                arr[i]		=	arr[i+1];
					                arr[i+1]	=	momentary;
					                sorted		=	false;
				            	}
				        }
			}
		
		String sortedOutput = "";
		
		// Array zu String
		for (int j =0; j< arr.length; j++)
		{
			sortedOutput += String.valueOf(arr[j]) + "\n";
		}
		return sortedOutput;
	}


}
