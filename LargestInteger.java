 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        
        int max1 = (integers[0] > integers[1]) ? integers[0] : integers[1];
        int max2 = (max1 > integers[2]) ? max1 : integers[2];
        
        return max2;
        
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max1 = Math.max(integers[0], integers[1]);
        int max2 = Math.max(max1, integers[2]);
        
        return max2;
    }
}
