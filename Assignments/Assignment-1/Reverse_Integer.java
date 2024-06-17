class Reverse_Integer {
    public int reverse(int x) {
        int num=x;
        int min=(int)-2e31;
        int max=(int)2e31-1;
        if(x%10==0){
            x=x/10;
        }
        if(x<0){
            x=Math.abs(x);
        }
        long rev=0;
        while(x>0 && rev<max){
            int dig=x%10;
            rev=(long)(rev*10+dig);
            x/=10;
            
        }
        if(num<0){
        rev=(long)(rev*-1);
        }
        if(rev>max || rev< min){
            return 0;
        }
        else{
            return (int)rev;
        }

    }
}