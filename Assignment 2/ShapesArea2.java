import java.util.Scanner;

class Shape {
    double area;

    void computeArea() {
        System.out.println("Compute area based on specific shape");
    };

    void displayShape() {
        System.out.println("Display Shape dimensions with area");
    };
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void computeArea() {
        super.area = Math.PI * r * r;
    }

    void displayShape() {
        System.out.printf("Circle(%.2f) Area: %.2f\n", r, super.area);
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void computeArea() {
        super.area = l * b;
    }

    void displayShape() {
        System.out.printf("Rectangle(%.2f,%.2f) Area: %.2f\n", l, b, super.area);
    }
}

class Triangle extends Shape {
    double h, b;

    Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    void computeArea() {
        super.area = 0.5 * h * b;
    }

    void displayShape() {
        System.out.printf("Triangle(%.2f,%.2f) Area: %.2f\n", h, b, super.area);
    }
}

public class ShapesArea2 {
    public static Shape createShape(int type, Scanner sin) {
        Shape obj;
        double a, b;
        switch (type) {
            case 1: // Circle
                System.out.println("Circle detected");
                obj = new Circle(sin.nextDouble());
                obj.computeArea();
                break;
            case 2: // Rectangle
                System.out.println("Rectangle detected");
                obj = new Rectangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;
            case 3: // Triangle
                System.out.println("Triangle detected");
                obj = new Triangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;
            default:
                System.out.printf("Ignoring wrong type: %d\n", type);
                obj = null;
        }
        return obj;
    }

    public static void main(String[] args) {
        Shape[] Shapes = new Shape[50];
        int n, i = 0, sheetType;
        Shape s;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            sheetType = sc.nextInt();
            s = createShape(sheetType, sc);
            if (s != null)
                Shapes[i++] = s;
        }
        n = i - 1;
        for (i = 0; i <= n; i++) {
            System.out.print(i + ": ");
            Shapes[i].displayShape();
        }
    }
}