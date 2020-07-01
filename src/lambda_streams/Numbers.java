package lambda_streams;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Numbers {
    static List<Integer> nums = Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.
    	//Use streams to compute the results wheever possible.
        System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions.
        //You can put the lambda functions directly inside the method calls, or defined them first,
        //then pass them into the methods. give them the same names as the static methods,
        //but add the word 'lambda' in front of every lambda function:
        /* e.g.

        added(() -> {});

        OR

        lambdaAdd = () -> {};
        added(lambdaAdd);

        isOdd(() -> {});

        OR

        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...

        */
  NumbersInterface isOdd = (a)-> {
    		  if(nums.get(a)%2 != 0) {
    			  
    			  return true;
    		  }
    		  else {
    			  return false;
    		  }
       };
       System.out.println(isOdd.methods(1));
       
       
   NumbersInterface isEven = (a)-> {
 		  if(nums.get(a)%2 == 0) {
 			  return true;
 		  }
 		  else {
 			  return false;
 		  }
    };
    System.out.println(isEven.methods(1));
    
    
    NumbersInterface isPrime = (a)->{
    	if(nums.get(a)<=1) {
    		return false;
    	}
    	for(int i = 2; i<a; i ++) {
    		if(nums.get(a)%i == 0 ) {
    			return false;
	    	}
	    	
    	}
    	return true;
    };
    System.out.println(isPrime.methods(7));
       
    
    IntNumbersInterface added = () ->{
    	return nums.stream().mapToInt(num -> num).sum();
    };
    System.out.println(added.methods());
    
    IntNumbersInterface subtracted = () ->{
    	return nums.stream().mapToInt(num -> -num).sum();
    };
    System.out.println(subtracted.methods());
    
    BigInt multiply = () -> {
    	return nums.stream().map(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);
    };
    System.out.println(multiply.multiply());
    
    BigInt divided = () ->{
    	return nums.stream().map(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::divide);
    };
    System.out.println(divided.multiply());
    
    IntNumbersInterface findMax = () ->{
    	return nums.stream().max(Integer::compare).get();
    };
    
    System.out.println(findMax.methods());
    
    IntNumbersInterface findMin = () ->{
    	return nums.stream().min(Integer::compare).get();
    };
    System.out.println(findMin.methods());
    
    Compare compare = (i,j)->Integer.compare(nums.get(i),nums.get(j));
    
    System.out.println(compare.compare(0,13));
    
    Append append = (i) -> {
    	nums = new ArrayList<>(nums);
    	nums.add(i);
    	return nums.get(nums.size()-1);
    };
    System.out.println(append.append(5));
    	
    	
    
}
    
    
//    NumbersInterface isPrime = (a) ->{
//    	
//    }
    

    static boolean isOdd(int i) {
		return false;
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
    	
    }
    

    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        return false;
    }

    static boolean isPrime(int i) {
         //determine if the value at the index i is a prime number.  return true if yes, return false if no.
         return false;
    }

    static int added() {
        //add all the elements in the list.  return the sum.  
        return 0;
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        return 0;
    }

    static int multiply() {
        //multiply all the elements in the list. and return the product.
        return 0;
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
        return 0;
    }

    static int findMax() {
         //return the maximum value in the list.
        return 0;
    }

    static int findMin() {
        //return the minimum value in the list.
        return 0;
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater,
    	//return -1.  if the two values are equal, return 0.
        return 0;
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        return 0;
    }

}
