package algorithms;

import java.util.Scanner;

//A recursive nth root finder for any real number up to desired accuracy.
public class nrootfinder {
	
	private static double newtonRaphson(int nthroot, double number, double guess, double accuracy){
		
		
		double output, newguess; 
		
		if( number - nthpower(guess, nthroot) > accuracy || nthpower(guess, nthroot) - number > accuracy  ){
			newguess = guess - ( fx(guess,nthroot, number) / fprimex(guess, nthroot));
			return newtonRaphson(nthroot, number, newguess, accuracy);
		}
		
		else		
			return guess;
		
	}

	private static double nthpower(double number, int poweredto) {
		// TODO Auto-generated method stub
		if(poweredto - 1 == 0)
			return number;
		
		else
			return number*nthpower(number, poweredto-1);
	}

	private static double fprimex(double number, int nthroot) {
		// TODO Auto-generated method stub
		
		return ((double)(nthroot))*nthpower(number,nthroot-1) ;
	}

	private static double fx(double guess, int nthroot, double number) {
		// TODO Auto-generated method stub
		
		
		return nthpower(guess, nthroot) - number;
	}
	
	public static void main(String[] args){
		
		double answer, number, guess, accuracy;
		int nthroot;
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("Enter number: ");		
		number = in1.nextDouble();
		
		System.out.println("Enter n: ");		
		nthroot = in1.nextInt();
		
		guess = Math.max(number, (double)1);
		
		answer = newtonRaphson(nthroot, number, guess, 0.00001);
		
		System.out.println(nthroot+"th root is: "+answer);
//		runtests();
	}

	private static void runtests() {
		// TODO Auto-generated method stub
		
	}

}
