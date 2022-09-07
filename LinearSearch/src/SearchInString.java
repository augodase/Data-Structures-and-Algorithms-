public class SearchInString {
    public static void main(String[] args) {
        String str="abcduhxdshkf";
        char ch= 'z';

        System.out.println(searchInString(str,ch));

    }

     static boolean searchInString(String str, char ch) {

        if(str.length()==0)
            return false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                return true;
            }
        }
        return false;
    }
}
