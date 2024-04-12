package Classes;

public enum Toppings {
    Chess,
    Bacon,
    Egg,
    Banana;
    public double getPrice(){
        return switch(this){
            case Egg -> 0.50;
            case Bacon -> 1;
            case Banana -> 1;
            case Chess -> 1.50;
        };

    }
}
