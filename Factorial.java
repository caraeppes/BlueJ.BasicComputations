 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger answer = new BigInteger("1");
        
        for(int i = 1; i <= value; i++){
            answer = answer.multiply(new BigInteger(i + ""));
        }
        
        System.out.println("The factorial of " + value + " is " + answer.toString());
        return answer;
        
    }
    
    
}
