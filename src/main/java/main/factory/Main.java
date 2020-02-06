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
        
        Car fiat = new Car();
        
        fiat.model = "Fiat Punto";
        fiat.buildYear = 2010;
        fiat.color = "black";
        fiat.consumption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        System.out.println("Model:" + fiat.model);
        System.out.println("Godina proizvodnje:" + fiat.buildYear);
        System.out.println("Boja:" + fiat.color);
        System.out.println("Potrosnja:" + fiat.consumption);
        System.out.println("Maksimalna brzina:" + fiat.maxSpeed);
        System.out.println("Stanje rezervoara:" + fiat.currentFuel);
        System.out.println("Maksimum rezervoara:" + fiat.maxFuel);
        
        System.out.println();
        
        Car ford = new Car();
        
        ford.model = "Focus";
        ford.buildYear = 2015;
        ford.color = "white";
        ford.consumption = 10;
        ford.maxSpeed = 220;
        ford.currentFuel = 30;
        ford.maxFuel = 60;
       
        System.out.println("Model:" + ford.model);
        System.out.println("Godina proizvodnje:" + ford.buildYear);
        System.out.println("Boja:" + ford.color);
        System.out.println("Potrosnja:" + ford.consumption);
        System.out.println("Maksimalna brzina:" + ford.maxSpeed);
        System.out.println("Stanje rezervoara:" + ford.currentFuel);
        System.out.println("Maksimum rezervoara:" + ford.maxFuel);
        
        System.out.println();
        
        Car bmw = new Car();
        
        bmw.model = "X5";
        bmw.buildYear = 2019;
        bmw.color = "blue";
        bmw.consumption = 12;
        bmw.maxSpeed = 250;
        bmw.currentFuel = 50;
        bmw.maxFuel = 100;
       
        System.out.println("Model:" + bmw.model);
        System.out.println("Godina proizvodnje:" + bmw.buildYear);
        System.out.println("Boja:" + bmw.color);
        System.out.println("Potrosnja:" + bmw.consumption);
        System.out.println("Maksimalna brzina:" + bmw.maxSpeed);
        System.out.println("Stanje rezervoara:" + bmw.currentFuel);
        System.out.println("Maksimum rezervoara:" + bmw.maxFuel);
    }
    
}
