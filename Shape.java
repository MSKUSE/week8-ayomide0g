public class Shape {
    private String color = "white";

    public Shape(String color) {
        this.color = color;
    }

    private double area() {
        return 0.0;
    }

    private double perimeter() {
        return 0.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void describe(){
        System.out.println();
    }

    public void describe(int sideA, int sideB) {
        System.out.println("Side a is" + sideA + "Side B is " + sideB);
    }

    public void describe(int sideA) {
        System.out.println("Side a is" + sideA);
    }

    public void describe(double sideA) {
        System.out.println("Radius is" + sideA);
    }
}