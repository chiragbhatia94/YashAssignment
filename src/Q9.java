class CircleClass {
    protected double radius;

    public CircleClass(double r) {
        radius = r;
    }

    public void display() {
        System.out.println(".....");
    }

}

class CircleAreaClass extends CircleClass {
    private double area;

    public CircleAreaClass(double r) {
        super(r);

        this.area = 4 * Math.PI * Math.pow(this.radius, 2);
    }

    public void display() {

        System.out.println("Area of circle : " + this.area);
    }
}

class CirclePerimeterClass extends CircleClass {
    private double perimeter;

    public CirclePerimeterClass(double r) {
        super(r);

        this.perimeter = 2 * Math.PI * this.radius;
    }

    public void display() {
        System.out.println("Perimeter of Circle : " + this.perimeter);
    }
}

class FencingClass extends CircleClass {
    private double cost;

    public FencingClass(double r, double price) {
        super(r);

        this.cost = 2 * Math.PI * this.radius * price;
    }

    public void display() {
        System.out.println("Fencing Cost : " + this.cost);
    }
}

public class Q9 {
    public static void main(String[] args) {
        CircleAreaClass area = new CircleAreaClass(4.5);
        area.display();

        CirclePerimeterClass perimeter = new CirclePerimeterClass(6.8);
        perimeter.display();

        FencingClass fencing = new FencingClass(4.6, 9.3);
        fencing.display();
    }
}
