public class SearchInRange {
        public static void main(String[] args) {
            int arr[]={3,5,1,55,32,777,11};
            int target=55;

            System.out.println(linearSearch(arr,target , 2,5));

        }

        static int linearSearch(int[] arr, int target , int start,int end) {
            if(arr.length==0)
            {
                return -1; //if array does not hav any element then return -1 ...dont need to go through for loop
            }
            for(int i=start;i<=end;i++)
            {
                if(target==arr[i])
                {

                    return i; //return array index if taget dont found in array
                }


            }
            return -1;  //if target doe not found return -1

        }
    }
