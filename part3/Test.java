public class Test {
  public static void main(String args[] ) {
    Constant c = new Constant(3, 2);

    System.out.println(c + "\n" + c.min() );
    
    Delta d = new Delta(3, 0, 2);
    System.out.println(d + "\n" + d.min());
    
    int []ref = {5, 6, 7, 1, 2, 2, 3, 2, 4, 5, 6, 9, 0, 0, 3};

    Jumble j = new Jumble( ref);
    
    System.out.println(j);
    System.out.println(j.min());
   System.out.println("-----------ConstantIt----------------"); 
    ConstantIt ci = new ConstantIt(c);
    for( ; ci.hasNext(); ) {
      System.out.println(ci.next());

    } 
    System.out.println("----------DeltaIt----------------"); 
    DeltaIt di = new DeltaIt(d);
    for(; di.hasNext(); ){
      System.out.println(di.next());

    }
    System.out.println("-----------JumbleIt--------"); 
    
    JumbleIt ji = new JumbleIt(j);
    for(; ji.hasNext() ;){
      System.out.println(ji.next());
    }
    
    System.out.println("-----------JumbleUser----------"); 
    System.out.println(JumbleUser.lengthLongestNDCSS1(j));

  }
}
