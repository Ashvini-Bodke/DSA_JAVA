
// time complexity = O(n^3) ... not a good complexity it is basic .
// Max SubArray Sum - 1 (Brute Force).
public class SubArrPro2 {

    public static void printMaxSum(int[] arr){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){           //print
                   System.out.print(+arr[k]+" ");
                    // subArr sum
                    currSum+=arr[k];


                }
                System.out.println();
                System.out.println("The currSum = "+currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }


            }

            System.out.println();

        }
        System.out.println( "MaxSum = "+maxSum);

    }


    public static void main(String[] args){
        int [] arr = {1,-2,6,-1,3};
        printMaxSum(arr);


    }
}
