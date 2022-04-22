package com.example.test1;

public class Point {
    public int x;
    public int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point () {

        this (0, 0);
    }

    public void PrintPoint () {
        System.out.println(x + ", " + y);
    }

    private Point center (Point other) {
        return new Point ((x+other.x)/2, (y+other.y)/2);
    }
}
