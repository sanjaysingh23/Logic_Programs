public class ReverseNumber {
    static int reverseNumber (int num){
        int rev = 0,temp;
        while(num>0){
            temp = num%10;
            rev = rev*10+temp;
            num = num /10;
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.println(ReverseNumber.reverseNumber(123));
    }
}
