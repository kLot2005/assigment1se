package models;

public class Point {

    private double x;
    private double y;

    private double distance;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "models.Point [x=" + x + ", y=" + y + ", distance=" + distance + "]";
    }



    // distance(models.Point dest) - distance from current point to the dest point

    // toString
}
