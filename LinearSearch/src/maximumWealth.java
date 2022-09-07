import java.util.Arrays;

public class maximumWealth {
    public static void main(String[] args) {
        //https://leetcode.com/problems/richest-customer-wealth/
        int[][] accounts={{1,5},{7,3},{3,5}};
       int ans= maximumWealth(accounts);
       System.out.println(ans);
    }

     static int maximumWealth(int[][] accounts) {
        int[] arr=new int[accounts.length];
        for(int row=0;row<accounts.length;row++)
        {
            int total=0;
            for (int col=0;col<accounts[row].length;col++)
            {

                total=total+accounts[row][col];



            }
            arr[row]=total;
        }

        System.out.println(Arrays.toString(arr));


         int max=arr[0];
         for(int i=0;i< arr.length;i++)
         {
             if(arr[i]>max)
                 max = arr[i];
         }
         return max;
    }
}
