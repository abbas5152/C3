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
        
        OLA o1=new OLA();
       if(o1.bookCar(car.getNumberOfPassenger(),car.getNumberOfKms()) instanceof HatchBack){
           return car.getNumberOfKms()* 15;


        }
       else{
          return car.getNumberOfKms()*20;
       }
      
    }


}
