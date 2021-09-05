import java.io.*;

class Recursion{
	public static void nDigitNums(int n, int sum, char out[], int index){
		if(index > n || sum<0)
			return;
		
		if (index == n){
			if ( sum == 0){
				out[index]='\0' ;
				System.out.print(out);
				System.out.println(" ");
			}
			return;
		}

		for (int i=0; i<=9; i++){
			out[index] =(char) (i + '0');

			nDigitNums(n, sum - i, out, index+1);
		}
	}

	static void nDigitNums(int n, int sum){

		char[] out = new char[n+1];

		for (int i=1; i<=9; i++){
			out[0] = (char) (i + '0');
			nDigitNums(n, sum-i, out, 1);
		}
	}

}
	
