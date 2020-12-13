package test.iterator;

import iterator.ShapeIterator;
import iterator.ShapeStorage;

public class TestIteratorPattern {
  public static void main(String[] args) {
    ShapeStorage storage = new ShapeStorage();
    storage.addShape("Polygon");
    storage.addShape("Hexagon");
    storage.addShape("Circle");
    storage.addShape("Rectangle");
    storage.addShape("Square");

    ShapeIterator iterator = new ShapeIterator(storage.getShapes());
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }


    System.out.println("Apply removing while iterating...");
    iterator = new ShapeIterator(storage.getShapes());
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      iterator.remove();
    }
  }
}

/*
        ID: 0 Shape: Polygon
        ID: 1 Shape: Hexagon
        ID: 2 Shape: Circle
        ID: 3 Shape: Rectangle
        ID: 4 Shape: Square
        Apply removing while iterating...
        ID: 0 Shape: Polygon
        ID: 2 Shape: Circle
        ID: 4 Shape: Square
*/
