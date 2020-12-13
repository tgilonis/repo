package iterator;

public class ShapeStorage {
  private Shape[] shapeStorage = new Shape[10]; //what if there are more than 10 elements? - could change to be arraylist
  private int count =  0;
  public void addShape(String polygon) {
      Shape s = new Shape(count, polygon);
      shapeStorage[count] = s;
      count++;
  }

  public Shape[] getShapes() {
    return shapeStorage;
  }
}