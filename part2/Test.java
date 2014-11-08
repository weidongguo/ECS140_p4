public class Test {
  public static void main(String args[] ) {
    Constant c = new Constant(2, -2);

    System.out.println(c + "\n" + c.min() );
    
    Delta d = new Delta(3, 0, -1);
    System.out.println(d + "\n" + d.min());
    
    int []ref = {-9,3,-3,5,7,19,-2};

    Jumble j = new Jumble( ref);
    
    System.out.println(j);
    System.out.println(j.min());
    
    
  }


}
