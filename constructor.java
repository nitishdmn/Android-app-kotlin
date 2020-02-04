import java.util.*;


public class Main
{
  int x;
  static int y, i;
    Main (int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  public static void main (String[]args)
  {
    Main obj1 = new Main (10, 20);
    Main obj2 = new Main (30, 40);
    Main obj3 = new Main ();
    System.out.println (obj1.x);
    System.out.println (obj1.y);
    System.out.println (obj2.x);
    System.out.println (obj2.y);
    System.out.println (obj3.x);
    System.out.println (obj3.y);
  }
}
