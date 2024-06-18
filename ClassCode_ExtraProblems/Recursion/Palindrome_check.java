public class Palindrome_check {
    static boolean check(String s, int i, int j) {
        if (i==-1){
            return true;
        }

        if(s.charAt(i)==s.charAt(j)){
            return true&&(check(s,i-1,j+1));
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "abba";
        if (s.length() % 2 != 0) {
            System.out.println(check(s, s.length() / 2 , s.length() / 2 ));
        } else {
            System.out.println(check(s, s.length()/2-1,s.length()/2));
        }
    }
}