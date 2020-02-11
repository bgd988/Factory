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
    
    public Car(){
    this.model = "";
    this.buildYear = 0;
    this.color = "";
    this.currentFuel = 0;
    this.consumption = 0;
    this.maxFuel = 0;
    }
    
    public Car(String customModel, int customBuildYear, String customColor, int customMaxFuel, int customCurrentFuel ){
          this.model = customModel;
          this.buildYear = customBuildYear;
          this.color = customColor;
          this.maxFuel = customMaxFuel;
          this.currentFuel = customCurrentFuel;
    }
    
    public Car(String customModel, int customBuildYear, int customCurrentFuel ){
          this.model = customModel;
          this.buildYear = customBuildYear;
          this.currentFuel = customCurrentFuel;
    }
    
    
    
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
    
  
    public void showData() {
        System.out.println("Model:" + this.getModel());
        System.out.println("Godina proizvodnje:" + this.getBuildYear());
        System.out.println("Boja:" + this.getColor());
        System.out.println("Potrosnja:" + this.getConsumption());
        System.out.println("Maksimalna brzina:" + this.getMaxSpeed());
        System.out.println("Stanje rezervoara:" + this.getCurrentFuel());
        System.out.println("Maksimum rezervoara:" + this.getMaxFuel());
        System.out.println();
    }
    
    public void travel(int distanceTraveled){
        //1. definisati novi atribut 'mileage'
        //2. napraviti get i set metode
        //3. prosiriti jedan od koknstruktora da moze da se setuje i mileage
        //kolicina goriva da se smanji za onoliko koliko je potroseno
        // kilometraza da se uveca
        
        //opciono: novi atiribut za stanje motora, da li je automobil ukljucen ili ne
    }
    
}
