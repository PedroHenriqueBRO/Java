package org.example;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog(String type,double height){
        this(type,"Medium",height,"","");//chama o construtor da própria classe Dog que tem 5 parametros
    }

    public Dog(String type, String size, double height, String earShape, String tailShape) {
        super(type, size, height);//usado para chamar o construtor da classe mãe
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        System.out.println("Velocidade : "+speed);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Barulho do tipo latido");
    }
}
