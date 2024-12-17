package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }



    public void distance() {

        for (int i = 0; i < points.size(); i++) {

            double distance = 0;
            double x = 0;
            double y = 0;

            if (points.size() == i + 1){
                x = points.get(i).getX() + points.get(points.size() -  i - 1).getX();
                y = points.get(i).getY() + points.get(points.size() - i - 1).getY();
                distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

                points.get(i).setDistance(distance);
            } else {
                x = points.get(i).getX() + points.get(i + 1 ).getX();
                y = points.get(i).getY() + points.get(i + 1).getY();
                distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

                points.get(i).setDistance(distance);
            }


        }

    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (Point point : points) {
            perimeter += point.getDistance();
        }
        return perimeter;
    }


   public double getAverageSide(){
        return calculatePerimeter() / points.size();
   }

   public double getLongest(){
        double longestSide = 0;
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).getDistance() > longestSide) {
                longestSide = points.get(i).getDistance();
            }
        }
        return longestSide;
   }

    // calculatePerimeter()

    // getAverageSide()

    // getLongestSide()
}
