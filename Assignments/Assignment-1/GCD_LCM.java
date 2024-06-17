public class GCD_LCM {
       static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[]ans=new Long [2];
        Long n1=A;
        Long n2=B;
        while(A>0 && B>0){
            if(A>B)
                A=A%B;
            else
                B=B%A;
        }
        if(A==0)
            ans[1]=B;
        else
            ans[1]=A;
        long lcm=(long)((n1*n2)/ans[1]);
        ans[0]=lcm;
        return ans;
    }
    }

