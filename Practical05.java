import java.util.*;

public class Practical05{
	static int factorial1(int number){
		if(number < 0){
			return -1;
		}
		else if(number < 2){
			return 1;
		}
		else{
			int fact = 2;
			for(int i = 3; i <= number; i++){
				fact *= i;
			}
			return fact;
		}
	}

	static int factorial2(int number){
		if(number < 0){
			return -1;
		}
		else if(number < 2){
			return 1;
		}
		else{
			int fact = 2;
			int i = 3;
			while(i <= number){
				fact *= i;
				i++;
			}
			return fact;
		}
	}
	
	static int factorial3(int number){
		if(number < 0){
			return -1;
		}
		else if(number < 2){
			return 1;
		}
		else{
			return number * factorial3(number-1);
		}
	}

	static int getSum(int[] number){
		if(number.length == 1){
			return number[0];
		}
		return number[0] + getSum(Arrays.copyOfRange(number, 1, number.length));
	}
	
	public static void main(String[] args){
		int[] number = {1,2,3,4,5};
		
		System.out.println(getSum(number));
		System.out.println(factorial1(5));
		System.out.println(factorial2(-5));
		System.out.println(factorial3(4));
	}
}

