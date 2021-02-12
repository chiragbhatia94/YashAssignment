class RectangularSolid {
    private double length;
    private double width;
    private double height;

    public RectangularSolid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}

public class Q3 {
    public static void main(String[] args) {
        RectangularSolid object = new RectangularSolid(4.5, 4.98, 7.89);

        System.out.println("Length : " + object.getLength());
        System.out.println("Width : " + object.getWidth());
    }
}
