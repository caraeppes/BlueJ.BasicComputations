 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){

        String answer = "";
       
        while (value >= 1){
            answer = (value % 2) + answer;
            value = value / 2;
        }
        
        return answer;
    }

    public String printIntegerAsOctal(int value){
        String answer = "";
       
        while (value >= 1){
            answer = (value % 8) + answer;
            value = value / 8;
        }
        
        return answer;
    }

    public String printIntegerAsHexadecimal(int value){
        String answer = "";
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
            'a', 'b', 'c', 'd', 'e', 'f'};
       
        while (value >= 1){
            answer = hex[value % 16] + answer;
            value = value / 16;
        }
        
        return answer;
    }

    public static void main(String[] args){

    }
}
