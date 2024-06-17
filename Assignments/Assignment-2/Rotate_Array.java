public class Rotate_Array {
    static void rotateArr(int arr[], int d, int n) {
        
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
    }
    
    static void reverse(int[]arr,int st,int end){
        
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }    
}
