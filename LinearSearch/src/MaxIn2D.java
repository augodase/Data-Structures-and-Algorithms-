import java.util.Arrays;

public class MaxIn2D {

    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,45,66},
                {32,5,06},
                {21,22,90}
        };



        int ans= searchIn2DArray(arr);
        System.out.println(ans);
    }

    static int searchIn2DArray(int[][] arr) {
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {

            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
