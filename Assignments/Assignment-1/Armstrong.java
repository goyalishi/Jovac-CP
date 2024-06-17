public class Armstrong {
    static String armstrongNumber(int n){
       int arms=0;
       int num=n;
       int dig=0;
       while(n>0){
           dig=n%10;
           arms+=(int)(Math.pow(dig,3));
           n/=10;
       }
       if(arms==num){
           return "Yes";
       }
       else{
           return "No";
       }
    }
}

