public class Third_Maximum {
        public int thirdMax(int[] a) {
            int n=a.length;
           int max=Integer.MIN_VALUE;
            int Scnd_max=Integer.MIN_VALUE;
            int thrd=Integer.MIN_VALUE;
            boolean prsnt=false;
            
            for(int i=0;i<n;i++){
                if(a[i]>max){
                    thrd=Scnd_max;
                    Scnd_max=max;
                    max=a[i];
                    
                }
                
                if(a[i]>Scnd_max && a[i]<max){
                    thrd=Scnd_max;
                    Scnd_max=a[i];
                    
                }
                
                if(a[i]>thrd && a[i]<Scnd_max && a[i]<max){
                    thrd=a[i];
                    
                }
                if(a[i]==Integer.MIN_VALUE){
                        prsnt=true;
                    }
            }
    
            if(thrd!=Integer.MIN_VALUE){
                return thrd;
            }
            else if(prsnt && max!=thrd && Scnd_max!=thrd){
                return thrd;
            }
            
            else{
                return max;
            }
    
        }
    }

