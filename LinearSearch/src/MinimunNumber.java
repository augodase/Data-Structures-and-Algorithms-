public class MinimunNumber {
    public static void main(String[] args) {
        int arr[]={22,7,31,-5,-1,33};
       System.out.println( minimumNumber(arr));
    }

     static int minimumNumber(int[] arr) {
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
                min = arr[i];
        }


       return min;
     }
}
