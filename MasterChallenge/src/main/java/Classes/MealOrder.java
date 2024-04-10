package Classes;

public class MealOrder {
    private Burger burger;//contém um hamburguer
    private Item drink;//contem um item drink
    private Item side;//contem um item side(batata frita)
    public MealOrder() {
        this("regular","coke","fries");
    }
    public MealOrder(String burgerType,String drinkType,String sideType) {
        this.burger= new Burger(burgerType,4);
        this.drink= new Item("Drink",drinkType,1.00);
        this.side= new Item("Side",sideType,1.50);
    }
    public double getTotalPrice(){
        return burger.getAdjustedPrice()+drink.getAdjustedPrice()+side.getAdjustedPrice();
    }
    public void printItemizedList(){
        burger.printItemizedList();
        System.out.println(drink.toString());
        System.out.println(side.toString());
        System.out.println("-".repeat(30));
        System.out.println("Total Price : "+getTotalPrice());
    }
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
    public void setSizeDrink(String size){
        drink.setSize(size);
    }

}
