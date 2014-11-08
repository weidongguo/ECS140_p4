public class Plus {
  /*optimized Seq plus()*/ 
  public static Seq plus(Seq s1, Seq s2) {
    SeqIt s1It = s1.createSeqIt(); 
    SeqIt s2It = s2.createSeqIt(); //iterator creation takes O(1) space
                                   // since even for jumble is creating reference
    SeqIt sIt = (s1.getSize() < s2.getSize())? s1It:s2It; 
    /* set which iterator to use, the shorter sequence's Iterator wins */

    boolean constant = true, delta = true, jumble = true;
    int previous, current, diff; 
    int size = s1.getSize() < s2.getSize() ? s1.getSize():s2.getSize();
   try{

    if( sIt.hasNext()) {
      previous = s1It.next() + s2It.next(); // prime the pump, get the first
    }
    else
      return new Constant(0,0);//a sequence with no element;

    if( sIt.hasNext() ) { //get the second element
      diff = s1It.next() + s2It.next() - previous; //get the different b/w 1st&2nd
      previous = diff + previous;
      if(diff!=0)
        constant = false;
    }
    else
      return new Constant(1, previous);//a sequence with one element
   
    SeqIt s1It_new = s1.createSeqIt();
    SeqIt s2It_new = s2.createSeqIt();

    while( sIt.hasNext() ) {
      current = s1It.next() + s2It.next();
      if( constant && (previous != current))//if already false, don't bother 
        constant = false;
      if( delta && (current - previous) != diff)
        delta = false;
      
      if( !constant && !delta) { //it's jumble, decision made.
          SeqIt sIt_new = (s1.getSize() < s2.getSize()) ? s1It_new:s2It_new;
          int array[] = new int[size]; 
          for(int i = 0; sIt_new.hasNext(); i++)
            array[i] = s1It_new.next() + s2It_new.next();
          return new Jumble(array); 
      }
      previous = current;
    } 
   
    if(constant) { //the optimized sequence is a constant sequance
      return new Constant(size, s1It_new.next() + s2It_new.next());
    }
    if(delta) { //the optimized sequence is a delt sequence;
      return new Delta(size, s1It_new.next() + s2It_new.next(), diff);
    }
   }catch(Exception e) {} 
  return s1; //suppress warning. compiler doesn't know if it's never reached 
  }
}
