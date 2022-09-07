import com.sun.xml.internal.ws.message.ByteArrayAttachment;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,45,66},
                {32,5,06},
                {21,22,90}
        };

        int target=66;

       int[] ans= searchIn2DArray(arr,target);
       System.out.println(Arrays.toString(ans));
    }

     static int[] searchIn2DArray(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(target==arr[i][j])
                {
                    return new int[]{i,j};
                }
            }
        }
         return new int[]{-1,-1};
     }
}
