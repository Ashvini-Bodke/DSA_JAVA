// Print Subarrays.
// subarrays means a continuous part of array.
// total subarrays = n(n+1)/2.
public class subArray {

    public static void printSubArr(int[] num) {
        int totalSubArrays = 0;
        int sum = 0;
     int maxSum=0;


        for (int i = 0; i < num.length; i++) {



            for (int j = i; j < num.length; j++) {

                for (int k = i; k <= j; k++) {  //print

                    System.out.print(num[k] + " ");


                }
                sum = sum + num[j];


                System.out.println();


                totalSubArrays++;

                System.out.println("The sum of the subarray is :" + sum);





               if(maxSum<sum){
                  maxSum = sum;
               }


            }

            System.out.println();



            sum = 0;

        }
            System.out.println(" total subarrays = " + totalSubArrays);

        System.out.println("The maxSum = "+maxSum);

    }
    public static void main(String[] args){
        int [] num = {2,4,6,8,10};
        printSubArr(num);

    }

}
