// Prefix Sum  : it is another technique to calculate the sum of an subarray.
//formula to calculate prefix of sum = prefix[end]-prefix[start-1]
// time complexity = O(n^2).
public class SubArrPro3 {

    public static void printSubArrPrefix(int [] num){

        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int []prefix = new int [num.length];

        prefix[0]= num[0];

        // calculate prefix array

        for(int i=1;i<prefix.length;i++){

            prefix[i] = prefix[i-1] + num[i];    // to calculate the prefix we use the formula

        }
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currSum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];    // currSum


                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maxSum = "+maxSum);


    }


    public static void main (String[] args){
       int [] num = {1,-2,6,-1,3};
       printSubArrPrefix(num);

    }

}
