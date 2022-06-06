import java.util.Scanner;

public class HackerChallenge3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,i,c;

        System.out.print("enter number :");
        n= inp.nextInt();
        c=0;

        for(i=1;i<=10;i++){
            c=0;
            c=i*n;

            System.out.println(i+"*"+n+"="+c);

        }
    }
}
