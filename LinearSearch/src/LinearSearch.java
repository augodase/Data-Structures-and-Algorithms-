public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={3,5,1,55,32,777,11};
        int target=39;

        System.out.println(linearSearch(arr,target));

    }

         static int linearSearch(int[] arr, int target) {
            if(arr.length==0)
            {
                return -1; //if array does not hav any element then return -1 ...dont need to go through for loop
            }
           for(int i=0;i< arr.length;i++)
           {
               if(target==arr[i])
               {

                  return i; //return array index if taget dont found in array
               }


           }
           return -1;  //if target doe not found return -1

    }
}
