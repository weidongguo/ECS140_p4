public class DeltaIt implements SeqIt {
  protected int initial, num, delta, count; 
  DeltaIt(Delta s){
    initial = s.initial;
    num = s.num;
    delta = s.delta;
    count = 0; // number of elements that have been visited
  }

  public boolean hasNext() {
    return count < num; //count must be less than the # of things in the sequence
  }

  public int next() throws UsingIteratorPastEndException {
    if(hasNext()) {
      count++; //visited one element in the sequence
      return initial + (delta * (count - 1)); //-1 since initial is the first ele 
    }
    throw new UsingIteratorPastEndException(); 
  }


}
