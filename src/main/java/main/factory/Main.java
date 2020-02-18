package main.factory;

/**
 *
 * @author mojme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pocetak");

        String message = "Ovo je poruka";

        System.out.println();



        Car mercedes = new Car("A klasa", 100, 10, 100, 15);
        mercedes.showData();
        
        mercedes.travel(50);
         mercedes.showData();
         
         mercedes.fuelUp(100);
         mercedes.showData();
         
         mercedes.travel(100);
         mercedes.showData();
       

//        Car bmw = new Car("BMW X5", 2016, "White", 20, 5);
//        bmw.showData();
        

//        Car bmw = new Car();
//
//        //bmw.model = "X5";
//        bmw.setModel("X5");
//
//        bmw.setbuildYear(2019);
//        bmw.setColor("blue");
//        bmw.setConsumption(12);
//        bmw.setMaxSpeed(250);
//        bmw.setCurrentFuel(50);
//        bmw.setMaxFuel(100);
//
//        bmw.showData();
    }
    
}
