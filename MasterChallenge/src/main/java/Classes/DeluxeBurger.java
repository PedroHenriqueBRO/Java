package Classes;

 class DeluxeBurger extends Burger{
    private Item extra4,extra5;
    public DeluxeBurger(String name,double price){
        super(name,price);
    }

    public void addTopping(String extra1,String extra2,String extra3,String extra4,String extra5) {
        super.addTopping(extra1);
        super.addTopping(extra2);
        super.addTopping(extra3);
        if(this.extra4 == null){
            this.extra4= new Item("Topping",extra4,0);
        }
        if(this.extra5 == null){
            this.extra5=new Item("Topping",extra5,0);
        }
    }
    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(this.extra4 != null) {
            printExtra(extra4);
        }
        if(this.extra5 != null) {
            printExtra(extra5);
        }
    }
    @Override
    public double getExtraPrice(String name) {
        return 0;
    }


}
