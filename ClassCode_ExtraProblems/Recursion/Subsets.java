public class Subsets {
    static void subsets(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;

        }
        subsets(s.substring(1),ans+s.charAt(0));
        subsets(s.substring(1),ans);

    }
    public static void main(String[] args) {
        String s="abc";
        subsets(s,"");
    }
    
}
