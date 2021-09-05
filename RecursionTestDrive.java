public class RecursionTestDrive{
public static void main(String[] args){
	Recursion rev = new Recursion();		
	System.out.println("The 5-digit numbers with sum 42 are ");
	int n=5, sum =42;
	rev.nDigitNums(n, sum);
	}
}

