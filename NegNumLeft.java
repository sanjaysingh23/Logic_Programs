// An array contains both positive and negative numbers in random order. Rearrange the array elements so that
// all negative numbers appear before all positive numbers.
// Examples : 

// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5
public class NegNumLeft {
    public static int [] arrange(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]<0 && arr[end]<0){
                start++;
            }
            else if(arr[start]>0 && arr[end]<0 ){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(arr[start]>0 && arr[end]>0){
                end--;
            }
            else{
                end--;
                start++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int ans[] = arrange(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+"  ");
        }
    }
}
