// import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {

    Boolean anagram(String str1, String str2){
        char arr1 [] = str1.toCharArray();
        char arr2 [] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean ans = Arrays.equals(arr1,arr2);
        if(ans == true){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String args[]){
        Anagrams obj = new Anagrams();
        System.out.println(obj.anagram("race", "care"));
    }
}
