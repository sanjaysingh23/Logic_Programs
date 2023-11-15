public class Palindrome {
    
    boolean palindrome(String str){
        char arr[] = str.toCharArray();
        int i=0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[]){
        Palindrome ob = new Palindrome();
        System.out.println(ob.palindrome("civic"));
    }
}
