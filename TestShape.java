lic class TestShapes {
    public static void main(String[] args)
    {
        Shape square = new Shape( "blue", 3, 4 );
        Rectangle retangle = new Rectangle("white" , 3 , 4 );
        retangle.describe();
        Rectangle r1 = new Rectangle("blue" , 3, 4);
        Rectangle r2 = new Rectangle("blue" , 3, 4);
    }

}