public class Rectangle extends Shape{
    private int sideA = 0, sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public void describe(){
        System.out.println("side A is" + this.sideA + "," + "side B is " + this.sideB);
    }
    @Override
    public boolean equals( Object obj) {
        Rectangle r = (Rectangle) obj;
        if(this.sideA == r.sideA && this.sideB && this.getColor() == r.getColor()){
            return true;
        }
        else {
            return false;
        }
    }
}
