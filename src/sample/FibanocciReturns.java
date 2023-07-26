package sample;

	import java.math.BigInteger;
	import java.util.HashMap;
import java.util.Scanner;

class FibanocciReturns {

	 public static HashMap<BigInteger,BigInteger> hash= new HashMap<BigInteger,BigInteger>();
	    
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        
	        while(scan.hasNextLine())
	        {
	            BigInteger x = scan.nextBigInteger();
	            System.out.println(fibonacci(x));
	        }
	        
	        
	    }
	    public static BigInteger fibonacci(BigInteger i)
	        {
	        if( i.equals(BigInteger.ZERO))
	            {
	            return BigInteger.ZERO;
	        }
	        else if( i.equals(BigInteger.ONE))
	            {
	            return BigInteger.ONE;
	        }
	        else if(i.equals(2))
	            {
	            return BigInteger.ONE;
	        }
	        else
	            {
	            BigInteger a;
	            BigInteger b;
	            
	            if(hash.containsKey(i))
	                {
	                return hash.get(i);
	            }
	            else
	                {
	                a = fibonacci(i.subtract(BigInteger.valueOf(1)));
	                b = fibonacci(i.subtract(BigInteger.valueOf(2)));
	                hash.put(i, a.add(b));
	                return  a.add(b) ;
	            }
	            
	 	            
	        }
	            
	    }
}



