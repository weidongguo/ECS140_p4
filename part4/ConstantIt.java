public class ConstantIt implements SeqIt{
  protected int num, value, count; 
  ConstantIt(Constant s) { //all fiends in Constant protected, so an access w/i same directory
     this.num = s.num; 
     this.value = s.value;
     this.count = 0;
  }
  public boolean hasNext() {
    return count < num; 
  }
  
  /*return the next element and advance to the iterator to the following item*/
  public int next() throws UsingIteratorPastEndException { 
    if(hasNext()){
      count++;
      return value;
    } 
    throw new UsingIteratorPastEndException("ConstantIt called past end");
    //System.err.println("ConstantIt called past end");
    //System.exit(1);
    //return 0;
  }


}
