package Classes;

public class MealOrder {
    private final Burger burger;//contém um hamburguer
    private final Item drink;//contem um item drink
    private final Item side;//contem um item side(batata frita)
    public MealOrder() {
        this("regular","coke","fries");
    }
    public MealOrder(String burgerType,String drinkType,String sideType) {
        if(burgerType.equals("Deluxe")) {
            this.burger= new DeluxeBurger(burgerType,8.50);
            this.drink= new Item("Drink",drinkType,0);
            this.side= new Item("Side",sideType,0);

        }else{
        this.burger= new Burger(burgerType,4);
            this.drink= new Item("Drink",drinkType,1.00);
            this.side= new Item("Side",sideType,1.50);
        }

    }
    public double getTotalPrice(){
        if(burger instanceof DeluxeBurger dx){
            return dx.getAdjustedPrice();
        }
        return burger.getAdjustedPrice()+drink.getAdjustedPrice()+side.getAdjustedPrice();
    }
    public void printItemizedList(){
        burger.printItemizedList();
        System.out.println(drink.toString());
        System.out.println(side.toString());
        System.out.println("-".repeat(60));
        System.out.println("Total Price : "+getTotalPrice());
    }
    //hamburguer normal
    public void addBurgerToppings(String extra1, String extra2, String extra3){//add extras no hamburguer
        if(extra1!=null) {
            burger.addTopping(extra1);
        }
        if(extra2!=null){
        burger.addTopping(extra2);
        }
        if(extra3!=null) {
            burger.addTopping(extra3);
        }
    }
    //deluxe burguer
    public void addBurgerToppings(String extra1, String extra2, String extra3,String extra4,String extra5){//add extras no hamburguer
        if(burger instanceof DeluxeBurger dx){
            dx.addTopping(extra1,extra2,extra3,extra4,extra5);
        }else{
            burger.addTopping(extra1);
            burger.addTopping(extra2);
            burger.addTopping(extra3);
        }
    }
    public void setSizeDrink(String size){
        drink.setSize(size);
    }

}
