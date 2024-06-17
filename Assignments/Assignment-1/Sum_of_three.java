import java.util.*;

public class Sum_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            boolean found = false;
 
            for (int i = 1; i < n; i++) {
                if (i % 3 != 0 ) {
                    if(found) break;
                    for (int j = i + 1; j < n; j++) {
                        if ( j % 3 != 0 ) {
                            int c=n-i-j;
                            if (c % 3 != 0 && c != i && c != j && c>0) {
                                found = true;
                                System.out.println("YES");
                                System.out.println(i + " " + j + " " + c);
                                if(found) break;
                            }
                        }
                    }
                }
            }
            if (!found) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

