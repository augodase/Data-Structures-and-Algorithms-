public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[] arr={11,22,3433,1211,43,564};
        System.out.println(evenNumberDigit(arr));
    }

    static int evenNumberDigit(int[] arr) {
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            int digit=countDigit(arr[i]);
            if(digit%2==0)
            {
                count++;
            }
        }
        return count;
    }

     static int countDigit(int number) {
        int digitcount=0;
        while (number>0)
        {
            digitcount++;
            number=number/10;
        }

        return digitcount;
    }
}
