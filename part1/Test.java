public class Test{ 
  public static void main( String [] args) {
    Constant a = new Constant(3, 5);
    System.out.println(a);
    Delta d = new Delta(3, 10, -2);
    System.out.println(d);
    int []values = {10,12,11,18,20};
    for( int i : values) {
      System.out.println(i);
    }
  
    Jumble j = new Jumble(values);
    System.out.println(j);
  }

 



}
