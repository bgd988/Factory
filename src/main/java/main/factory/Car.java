package main.factory;


public class Car {
    
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color = "red";
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    private double mileage;
    private int currentPassengers;
    private int maxPassengers;
    private int passengersOut;
    
   

    
    public Car(){
    this.model = "";
    this.buildYear = 0;
    this.color = "";
    this.currentFuel = 0;
    this.consumption = 0;
    this.maxFuel = 0;
    this.mileage = 0;
    this.currentPassengers = 1;
    this.maxPassengers = 0;
    this.passengersOut = 0;
    
    }
    
    public Car(String customModel, double customMileage, int customConsumption, int customMaxFuel, int customCurrentFuel, int customMaxPassengers){
          this.model = customModel;
          this.maxFuel = customMaxFuel;
          this.currentFuel = customCurrentFuel;
          this.mileage = customMileage;
          this.consumption = customConsumption;
          this.maxPassengers = customMaxPassengers;
          
    }
    
   
//    public Car(String customModel, int customBuildYear, int customCurrentFuel ){
//          this.model = customModel;
//          this.buildYear = customBuildYear;
//          this.currentFuel = customCurrentFuel;
//    }
//    
//    public Car(String customModel, int customBuildYear, int customCurrentFuel, int customMileage ){
//          this.model = customModel;
//          this.buildYear = customBuildYear;
//          this.currentFuel = customCurrentFuel;
//          this.mileage = customMileage;
//    }
    
    
    
    public String getModel() {
        return this.model;
    }
    
    
    public void setModel(String customModel) {
         this.model = customModel;
    }
    
    public int getBuildYear (){
        return this.buildYear;
    }
    
    public void setMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }
    
       public int getMaxSpeed (){
        return this.maxSpeed;
    }
       
    public void setColor(String customColor) {
         this.color = customColor;
    }
    
    public String getColor (){
        return this.color;
    }
    
    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
       public int getMaxFuel (){
        return this.maxFuel;
    }
       
    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
       public int getCurrentFuel (){
        return this.currentFuel;
    }
       
       
       
    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }
    
    public int getConsumption (){
        return this.consumption;
    }
    
    
    
    public void setbuildYear(int customBuildYear) {
        this.buildYear = customBuildYear;
    }
    
    public String getVehicleType(){
        return this.vehicleType;
    }
    
    public void setMileage(int customMileage) {
        this.mileage = customMileage;
    }
    
    public double getMileage () {
        return this.mileage;
    }
    
    public void setCurrentPassengers(int customCurrentPassengers){
      this.currentPassengers = customCurrentPassengers;
    }
    
    public int getCurrentPassengers(){
       return this.currentPassengers;
    }
    
      public void setPassengersOut(int customPassengersOut){
    this.passengersOut = customPassengersOut;
    }
    
        public int getPassengersOut(){
       return this.passengersOut;
    }
    
      public void setMaxPassengers(int customMaxPassengers) {
        this.maxPassengers = customMaxPassengers;
    }
    
       public int getMaxPassengers (){
        return this.maxPassengers;
    }
       
  
    public void showData() {
        System.out.println("Model:" + this.getModel());
        System.out.println("Godina proizvodnje:" + this.getBuildYear());
        System.out.println("Boja:" + this.getColor());
        System.out.println("Potrosnja:" + this.getConsumption());
        System.out.println("Maksimalna brzina:" + this.getMaxSpeed());
        System.out.println("Stanje rezervoara:" + this.getCurrentFuel());
        System.out.println("Maksimum rezervoara:" + this.getMaxFuel());
        System.out.println("Broj predjenih km:" + this.getMileage());
        System.out.println("Broj putika u vozilu:" + this.getCurrentPassengers());
        System.out.println("Broj putika u vozilu:" + this.getCurrentPassengers());
        System.out.println();
    }
    
    public void travel(int distance) {
        
        if (this.getCurrentFuel()> (distance * this.getCurrentFuel()) / 100) {
            this.mileage = this.getMileage() + distance;
            this.currentFuel = this.getCurrentFuel() - (distance * this.getCurrentFuel()) / 100;
            System.out.println("Uspesno ste putovali: " + distance);
        } else {
            System.out.println("nema dovoljno goriva za put" + distance); 
        }
    }
    
      public void fuelUp(int refill) {
            int emptySpace = this.getMaxFuel () - this.getCurrentFuel();
            
            if(refill < emptySpace) {
                this.currentFuel = this.getCurrentFuel() + refill;
                System.out.println("Uspesno ste sipali: " + refill + "Novo stanje je:" + this.getCurrentFuel());
            } else {
                this.currentFuel = this.getMaxFuel();
                System.out.println("Rezervoar je pun. Sipali ste: " + (emptySpace));
            }          
                      
            this.currentFuel = this.getCurrentFuel() + refill;
           
    }      
       public void passengersIn(int passengersUp) {
            int totalPassengers = this.getMaxPassengers() - this.getCurrentPassengers();
            
            if(passengersUp <= totalPassengers) {
                this.currentPassengers = this.getCurrentPassengers() + passengersUp;
                System.out.println("U vozilo je usao/lo: " + passengersUp + " putnik/a" + ", novi broj putnika je: " + this.getCurrentPassengers());
            } else {
                this.currentPassengers = this.getMaxPassengers();
                System.out.println("Vozilo je puno. U vozilu je: " + (maxPassengers) + " Putnika" + ", Potrazite drugo taksi vozilo");
            }
            
            
             
            
          
          //  this.currentPassengers = this.getCurrentPassengers() + passengersUp;
           
    }
       
              public void passengersOut(int passengersDown) {
            int totalPassengers = this.getMaxPassengers() - this.getCurrentPassengers();
            
            if(passengersDown <= totalPassengers || passengersDown >0) {
                this.currentPassengers = this.getCurrentPassengers() - passengersDown;
                System.out.println("Iz vozila je izasao/lo: " + passengersDown + " putnik/a" + ", novi broj putnika je: " + this.getCurrentPassengers());
            } else {
                this.currentPassengers = this.getMaxPassengers();
                System.out.println("Uneli ste pogresnu vrednost: " + (maxPassengers) + " Putnika" + ", Potrazite drugo taksi vozilo");
            }
            
            
             
            
          
          //  this.currentPassengers = this.getCurrentPassengers() + passengersUp;
           
    }
      
      
      
       
      
      //stanje 30, pokusavamo da sipamo 7, uspesno ste sipali 7l, novo stanje je 37
      // stanje 30, pokusavamo da sipamo 40, sipano je 20, rezervoar je pun
    
    
        
        //kolicina goriva da se smanji za onoliko koliko je potroseno
        // kilometraza da se uveca
        
        //opciono: novi atiribut za stanje motora, da li je automobil ukljucen ili ne
    
    
}
