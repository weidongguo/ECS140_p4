public class Test {
  public static void main(String args[] ) {
    Constant c = new Constant(3, 2);

    System.out.println(c + "\n" + c.min() );
    
    Delta d = new Delta(3, 0, 2);
    System.out.println(d + "\n" + d.min());
    
    int []ref = {-9,3,-3,5,7,19,-2, 1, 2, 3 , 4};

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
    ji.next();
  }


}
