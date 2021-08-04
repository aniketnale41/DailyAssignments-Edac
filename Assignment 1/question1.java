public class Main
{
	public static void main(String[] args) {
	    //input 
	    int n = 7;
	    
	    // fibonacci series using simple recursion method
	    //int result = recursionMethod(n);
	    
	    // fibonacci series using iteration method
	    //int result = iterationMethod(n);
	    
	    // fibonacci series using cahing and memoization
	    int result = usingMemoization(n);
	    
	    //output Statement
        System.out.println("Output: "+ result);
	}
	
	public static int iterationMethod(int n){
	    int returnResult = 1;
	    int first = 0;
	    int second = 1;
	    //using for loop
	    if(n==0){
	        return 0;
	    }
	    for(int i=1; i<n; i++){
	        returnResult = first + second;
	        first = second;
	        second = returnResult;
	    }
	    return returnResult;
	}
	
	public static int recursionMethod(int n){
	    if (n==0) return 0;
	    if (n==1) return 1;
	    return recursionMethod(n-1)+recursionMethod(n-2);
	}
	
}
