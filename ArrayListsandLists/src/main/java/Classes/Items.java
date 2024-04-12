package Classes;

public record Items(String name,String type,int count) {
    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
