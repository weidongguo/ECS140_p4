public class JumbleIt implements SeqIt {
  protected int ref[]; //reference to the actual sequnce (array)
  protected int length, count;

  JumbleIt(Jumble s) {
    ref = s.values;//set the reference to values;
    length =  s.count; // s.count is the length of the array values[]
    count = 0;
  }

  public boolean hasNext() {
    return count < length; 
  }

  public int next() {
    if( hasNext() ) {
      count++;
      return ref[count-1];//-1 because i increment is done first
    }
    System.err.println("Jumble out of bound");
    System.exit(1);
    return 0;
  }



}
