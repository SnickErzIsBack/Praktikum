package numberSorterCons;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)
     {  
    	int a;
    	double number;
    	    	
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        System.out.println("This app sorts 5 Numbers by your choosing.");

        for(int i=0; i<5;i++)
	        {
        		a= i+1;
        		switch(a)
        			{
	        			case 1:
	        				System.out.println("Please enter your 1st number: ");
	        				break;
	        			case 2:	
	        				System.out.println("Please enter your 2nd number: ");
	        				break;
	        			case 3:
	        				System.out.println("Please enter your 3rd number: ");
	        				break;
	        			case 4:
	        				System.out.println("Please enter your 4th number: ");
	        				break;
	        			case 5:
	        				System.out.println("Please enter your 5th number: ");
	        				break;
	        			default:
	        				System.out.println("Please enter a correct number!");
        			}
        		number = new Scanner(System.in).nextInt();
	        	numberList.add((int) number);
			}
        
        Collections.sort(numberList);
        
        for(int i=0;i<numberList.size();++i)
            {
        		System.out.println(numberList.get(i));
            };   
    }
}