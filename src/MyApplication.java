import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        shape.distance();
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Cамая длинная сторона: " +shape.getLongest());
        System.out.println("Средняя длинна: " + shape.getAverageSide());
    }

}
