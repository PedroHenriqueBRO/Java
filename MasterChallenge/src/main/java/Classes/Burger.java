package Classes;

class Burger extends Item{
    private Item extra1,extra2,extra3;
    public Burger(String name,double price){
        super("Burger",name,price);
    }
    public double getExtraPrice(String name) {
        return switch (name) {
            case "Bacon", "Burger" -> 1.50;
            case "Egg", "Banana","Cheese" -> 1;
            default -> 0;
        };
    }
    public void addTopping(String topping){
        if(extra1==null){
            extra1 = new Item("Topping",topping,getExtraPrice(topping));
        }else if(extra2==null){
            extra2 =new Item("Topping",topping,getExtraPrice(topping));
        }else if(extra3==null){
            extra3 =new Item("Topping",topping,getExtraPrice(topping));
        }
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice()+(extra1==null?0:extra1.getAdjustedPrice())+(extra2==null?0:extra2.getAdjustedPrice())+(extra3==null?0:extra3.getAdjustedPrice());
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + getAdjustedPrice() +
                "} " ;
    }

    public void printExtra(Item extra){
        System.out.println(extra);
    }


    public void printItemizedList(){
        System.out.println(toString());
        System.out.println("Toppings :");
        if(extra1!=null){
            printExtra(extra1);
        }if(extra2!=null){
            printExtra(extra2);
        }if(extra3!=null){
            printExtra(extra3);
        }


    }
}
