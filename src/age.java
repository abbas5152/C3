import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the no. of employees");
        int e=s1.nextInt();
        int sum=0;
        for(int i=0;i<e;i++){
            sum=sum+s1.nextInt();
        }
        System.out.println(sum/e);
    }
}
