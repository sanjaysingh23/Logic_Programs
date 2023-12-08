public class ReverseString {

    static String reverseString(String str){
        String newstr="";
        char ch;
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            newstr = ch+newstr;
        }
        return newstr;
    }
    public static void main(String args[]){
        System.out.println(ReverseString.reverseString("arun"));
    }
}
