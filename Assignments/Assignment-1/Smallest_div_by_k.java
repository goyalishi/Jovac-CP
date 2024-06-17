public class Smallest_div_by_k {
    static long findGCD(long n1,long n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0) return n2;
        else return n1;
    }
    public static long findSmallestDiv(long n,long k){

        long n2=(long)(Math.pow(10,k));
        if(n==0 || n2==0){
            return 0;
        }
        if(n==n2){
            return n;
        }
        long gcd=findGCD(n,n2);
        long lcm= (n*n2)/gcd;
        return lcm;

    }

    public static void main(String[] args) {
        long n=1000;
        long k=3;

        //We basically need to find LCM of(10^k and n)
        System.out.println(findSmallestDiv(n,k));
    }
}
