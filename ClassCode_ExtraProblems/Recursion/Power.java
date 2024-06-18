public class Power {
    static int ans=1;
    static int expo(int x,int n){
        if(n==0){
            return ans;
        }
        if(n%2==0){
            return expo(x*x,n/2);
        }
        else{
            ans*=x;
            return expo(x,n-1);
        }
    }
    public static void main(String[] args) {
        int x=4;
        int n=3;
        System.out.println(expo(x,n));
    }
    
}
