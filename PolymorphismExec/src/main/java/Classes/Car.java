package Classes;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
        this.engine=true;
        this.wheels=4;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return"Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
    public void setCylinders(int cylinders){
        this.cylinders=cylinders;
    }
    public int getCylinders(){
        return cylinders;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


}
