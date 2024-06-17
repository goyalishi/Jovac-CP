public class CoPrime_Array {
    static boolean isCoPrime(int a,int b){
        int hcf=1;
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            hcf=b;
        }
        else{
            hcf=a;
        }
        
        return (hcf==1)?true:false;
    }
    
    
    int countCoPrime(int a[], int n)
    {
       int insert=0;
       for(int i=0;i<=a.length-2;i++){
           int A=a[i];
           int B=a[i+1];
           if(!isCoPrime(A,B)){
               insert++;
           }
       }
       return insert;
    }    
}
