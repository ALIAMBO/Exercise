
import java.util.Scanner;

 class Vehicle{
   private String make;
   private String model;
   private int year;
   private double rentalPricePerday;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void getRentalPricePerDay(){
        this.rentalPricePerday = rentalPricePerday;
       //System.out.println("The rent per day for car is : Rm" + rental);
    }

    public void calculateRentalCostCar(int day){
        double rental = 0; 
        
        if(day < 2&& day>0){
            rental = 2 * day;
        }else if (day < 4) {
            rental = 3 * day ;
        }
        else if(day >=5){
            rental = 5 * day;
        }else{
            System.out.println("Rental is free. ");
            
        }
        System.out.println("The rent per day for car is : Rm" + rental);
        //getRentalPricePerDay();

    }

    public void calculateRentalCostmotor(int day){
        double rental = 0; 
        
        if(day < 3&& day>0){
            rental = 1 * day;
        }else if (day < 5) {
            rental = 2 * day ;
        }
        else{
            rental = 4 * day;
        }

            System.out.println("The rent per day for motor is : Rm" + rental);
    }

} 

class Car extends Vehicle{
       
    public void numSeat(){
            System.out.println("4 seats ");
    }
  
    public void numDoors(){
             System.out.println("4 doors ");
    }
} 

class Motorcycle extends Vehicle{
    public void engineSize(){
        System.out.println("Small. ");
    }
}

public class InheritenceExercise{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        Motorcycle motor = new Motorcycle();

        // car.numSeat();
        // car.numDoors();
        // motor.engineSize();
        System.out.println("Fee rate: ");
        System.out.println("Car : Less than 2 days Rm2 per day ");
        System.out.println("Car : Less than 4 days Rm3 per day");
        System.out.println("Car : More than 4 days Rm5 per day");
        System.out.println("Motor : Less than 3 days Rm1 per day ");
        System.out.println("Motor : Less than 5 days Rm2 per day");
        System.out.println("Motor : More than 6 days Rm4 per day");

        System.out.println("Select car model");
        car.setModel(sc.nextLine());

        System.out.println("Select car year");
        car.setYear(sc.nextInt());

        sc.nextLine();

        System.out.println("Select motor model");
        motor.setModel(sc.nextLine());

        System.out.println("Select motor year");
        motor.setYear(sc.nextInt());
        System.out.println("---------------------------");

        System.err.println("How many days you want to park your car ?");
        car.calculateRentalCostCar(sc.nextInt());

        System.err.println("How many days you want to park your motor ?");
        motor.calculateRentalCostmotor(sc.nextInt());

        System.out.println("---------------------------");

        System.out.println("Car model: " + car.getModel() );
        System.out.println("Year manufactured : "+ car.getYear());
        System.out.println("---------------------------");
        System.out.println("Motorcycle model: " + motor.getModel() );
        System.out.println("Year manufactured : " +  motor.getYear());
             
    }
}