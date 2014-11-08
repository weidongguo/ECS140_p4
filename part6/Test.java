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
  try{ 
    for( ; ci.hasNext(); ) {
      System.out.println(ci.next());

    } 
   
    ci.next();
  } catch(Exception e) {
    System.out.println(e + " >>Outside" );
    }
    System.out.println("----------DeltaIt----------------"); 
    DeltaIt di = new DeltaIt(d);
   try{
    for(; di.hasNext(); ){
      System.out.println(di.next());

    }
   }catch(Exception e) {}
    System.out.println("-----------JumbleIt--------"); 
    
    JumbleIt ji = new JumbleIt(j);
   try{ 
    for(; ji.hasNext() ;){
      System.out.println(ji.next());
    }
   } catch(Exception e) {}
    
    System.out.println("-----------JumbleUser----------"); 
    System.out.println(JumbleUser.lengthLongestNDCSS1(j));

    try{
      throw new UsingIteratorPastEndException("Out of Bound");
    }
    catch(Exception e) { //UsingIteratorPastEndException e) {
      System.out.println(e);
    }
    
    System.out.println("----------createSeqIt() for Constant---");
    SeqIt ci2 = c.createSeqIt();
    try {
      while(ci2.hasNext()) {
        System.out.println(ci2.next());
      }
    } catch(Exception e) {}
    
    System.out.println("-----------Plus()------------");
    Constant cc = new Constant(4, 88);
    System.out.println( Plus.plus(c, cc) ); 
    
    Delta dd = new Delta(9, 8, 12);
    System.out.println( Plus.plus(d, dd) );
     
    Jumble jj = new Jumble( new int[] {} );
    System.out.println( Plus.plus(j, jj) );
  }
}
