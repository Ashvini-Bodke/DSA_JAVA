// Max Subarray Sum - 3 (Kadane's Algorith).
//  zero is greater than -infinity.

public class SubArrPro4 {

    public static void printSubarrKadans(int [] num) {
        int ms = Integer.MIN_VALUE;  // maxSum
        int cs = 0; // currSum

       // for loop for the all the negative values.
        for (int i = 0; i < num.length; i++) {
            cs = cs += num[i];

             if(cs<0){
                cs = num[i];


             }
        ms
        }
        System.out.println(ms);

    }

// for loop if the value is positive + negative
//        for(int i=0;i<num.length;i++){
//          cs = cs+=num[i];
//
//          if(cs < 0){
//             cs = 0;
//           }
//           ms = Math.max(cs,ms);
//
//       }
//        System.out.println("maxSum " +ms);
//    }


    public static void main (String[] args){
      //  int [] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr = {-2,-3,-1,-4};
        printSubarrKadans(arr);

    }

}
