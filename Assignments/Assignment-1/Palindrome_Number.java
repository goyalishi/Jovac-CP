public class Palindrome_Number {
        public boolean isPalindrome(int x) {
            if(x<0)
                return false;
    
            int num=x;
            int pal=0;
            while(x>0){
                int dig=x%10;
                pal=pal*10+dig;
                x/=10;
            }
            if(num==pal)return true;
            else{
                return false;
            }
        }
    }
    

