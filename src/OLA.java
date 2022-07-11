public class OLA {
    public Car bookCar(int numberOfPassenger, int numberOfKMs){
        Car c1;
        if(numberOfPassenger<=3){
            c1 = new HatchBack();


        }
        else{
           c1=new Sedan();
        }

        return  c1;
    }
    public int calculateBill(Car car){
        int fare;
        OLA o1=new OLA();
       if(o1.bookCar(car.getNumberOfPassenger(),car.getNumberOfKms()) instanceof HatchBack){
           fare= car.getNumberOfKms()* 15;


        }
       else{
           fare= car.getNumberOfKms()*20;
       }
       return fare;
    }


}
