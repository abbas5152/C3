import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Car car=new Car();
        System.out.println("Enter kms");
        int n=s1.nextInt();
        car.setNumberOfKms(n);
        System.out.println("Enter passenger");
        int p=s1.nextInt();
        car.setNumberOfPassenger(p);
        System.out.println(n);
        System.out.println(p);
        OLA myOla = new OLA();
        Car myCar = myOla.bookCar(p, n);
        System.out.println(myCar);
        myCar.setNumberOfKms(n);
        int res = myOla.calculateBill(myCar);
        System.out.println("The total fare amount is "+ res);
    }

}

