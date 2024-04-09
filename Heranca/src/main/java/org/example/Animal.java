package org.example;

public class Animal {
    private String type;
    private String size;
    private double height;

    public Animal(String type, String size, double height) {
        this.type = type;
        this.size = size;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", height=" + height +
                '}';
    }
    public void move(String speed){
        System.out.println(type + "se move com " + speed + " de velocidade");
    }
    public void makeNoise(){
        System.out.println(type + " faz barulho");
    }

}
