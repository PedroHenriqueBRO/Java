package Classes;

class Item {
    protected String name;//contem um nome
    protected String type;//um type
    protected double price;//um preço
    protected String size="Medium";//um tamanho
    public Item(String type,String name, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public double getBasePrice(){//preço base do produto usado para ajustar o preço caso precise
        return price;
    }
    public double getAdjustedPrice(){//retorna o preço base caso não haja mudança no tamanho padrão
        return switch (size) {
            case "Small" -> getBasePrice() - 0.5;
            case "Large" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {//muda o tamanho
        this.size = size;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + getAdjustedPrice() +
                ", size='" + size + '\'' +
                '}';
    }
}
