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

        Car fiat = new Car("Fiat punto", 2010, "Black", 10, 5);
        fiat.showData();
        

        Car bmw = new Car("BMW X5", 2016, "White", 20, 5);
        bmw.showData();
//        //fiat.model = "Fiat Punto";
//        fiat.setModel("Fiat Punto");
//        fiat.setbuildYear(2010);
//        fiat.setColor("Black");
//        fiat.setConsumption(6);
//        fiat.setMaxSpeed(180);
//        fiat.setCurrentFuel(20);
//        fiat.setMaxFuel(10);
//
//        fiat.showData();
//
//        System.out.println();
//
//        Car ford = new Car();
//
//        //  ford.model = "Focus";
//        ford.setModel("Ford Fiesta");
//        ford.setbuildYear(2015);
//        ford.setColor("white");
//        ford.setConsumption(10);
//        ford.setMaxSpeed(220);
//        ford.setCurrentFuel(30);
//        ford.setMaxFuel(60);
//
//        ford.showData();
//
//        System.out.println();
//
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
