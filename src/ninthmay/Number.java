package ninthmay;

import java.util.ArrayList;
import java.util.Scanner;

public class Number {
	
	private double n;
	
	
	public Number(double n) {
		
		this.n = n;
	}


//	To include the following methods (include respective
//			constructors) isZero( ), isPositive(), isNegative( ),
//			isOdd( ), isEven( ), isPrime(), 
//			isAmstrong() the above methods return boolean primitive type.
//			getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above
//			methods return double primitive type. 
//			void listFactor(), void dispBinary()
	
	boolean isZero() {
		return (n==0)?true: false;
		}
	
	boolean isPositive() {
		return (n>0)? true:false;
	}
	
	
	
	boolean isNegative( ) {
		return !isPositive();
	}
	
	boolean isOdd( ){
		return (n%2==1)?true:false;
	}
	
	boolean isEven( ) {
		return !isOdd();
	}
	
	boolean isPrime() {
		if(n!=Math.abs(n)) return false;
		int sum=(int) n;
		boolean isPrime = true;
		for(int p = 2; p < sum; p++) {
		    if(sum % p == 0){
		        isPrime = false;
		        break;
		    }
		}
		
		return isPrime;
	}	
	
	

	boolean isAmstrong() {
		String num = Integer.toString((int)n);
        double f = 0;
		for (int i = 0; i < num.length(); i++){
			String y="";
			y+=num.charAt(i);
		    double x=Integer.parseInt(y);
		    f+=x*x*x; 
		}
		if(f==n) {
			return true;
		}
		else
			return false;
		    
	}
	
	double getFactorial(){
		double d=1,nn=Math.floor(n);
		
		while(nn>0) {
		//	System.out.println(d);
			d=d*nn;
			nn-=1;
			
			
		}
		
		return d;
		     
 }
	 
    double getSqrt() {
    	return Math.sqrt(n);
    }
	 
    double getSqr() {
    	return n*n;
    }
    
    double sumDigits() {
    	String num = Integer.toString((int)n);
        double f = 0;
		for (int i = 0; i < num.length(); i++){
			String y="";
			y+=num.charAt(i);
		    double x=Integer.parseInt(y);
		    f+=x; 
		}
		return f;
    }
    
    String getReverse() {
    	String num = Integer.toString((int)n);
    	String y="";
		for (int i = 0; i < num.length(); i++){
			y=num.charAt(i)+y; 
		}
		return y;
    }

    void listFactor() {
    	ArrayList<Integer> fact = new ArrayList<>();
    	for(int i=1; i<=n ; i++) {
    		if(n%i==0) {
    			fact.add(i);
    		}
    	}
    	System.out.println(fact);
    }
    
    void dispBinary() {
    	System.out.println(Integer.toBinaryString((int)n));
    }
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:  ");
		double num = sc.nextDouble();
		Number o = new Number(num);
	
		
		
		System.out.println("---------------------------------------\n\n");
		System.out.println("isZero( ):\t "+o.isZero( ));
		System.out.println("isPositive(): \t"+o.isPositive());
		System.out.println("isNegative( ): \t"+o.isNegative( ));
		System.out.println("isOdd( ):\t "+o.isOdd( ));
		System.out.println("isEven( ): \t"+o.isEven( ));
		System.out.println("isPrime(): \t"+o.isPrime());
		System.out.println("isAmstrong():\t "+o.isAmstrong());
	
		System.out.println("Factorial():\t "+o.getFactorial());
		System.out.println("getSqrt():\t "+o.getSqrt());
		System.out.println("getSqr(): \t"+o.getSqr());
		System.out.println("sumDigits():\t "+o.sumDigits());
		System.out.println("getReverse(): \t"+o.getReverse());
		System.out.print("listFactor(): \t");o.listFactor();
		System.out.print("dispBinary(): \t");o.dispBinary();
		System.out.println("\n\n\n---------------------------------------");
	
		
		
		
		}

	}
		

	
	
	
	
	


