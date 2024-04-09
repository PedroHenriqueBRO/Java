package Classes;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        if (length < 0 ) {
            this.length = 0;
        }
        if (width < 0 ) {
            this.width = 0;
        }
        else if(length>0 && width>0){
            this.length = length;
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getArea(){
        return width*length;
    }

}
