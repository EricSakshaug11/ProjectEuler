/*
 * The text for this problem:
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class ProblemTwo{

    public static void main(String[] args){
	int a = 1;
	int b = 2;
	int temp;
	int result = 0;
	while(b <= 4000000){
	    if(b%2 == 0){
		result += b;
	    }
	    temp = a;
	    a = b;
	    b = temp + a;
	}
	System.out.println(result);
    }
    
}
