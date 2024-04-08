package org.example;

public class Costumer {

    private String name;
    private int creditLimit;
    private String emailAdress;

    public Costumer(String name, int creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }
    public Costumer(){
        this("Indefinido",0,"");
    }
    public Costumer(String name,String emailAdress){
        this(name,1000,emailAdress);
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
