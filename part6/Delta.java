public class Delta extends Seq {
  protected int num, initial, delta;
  Delta(int num, int initial, int delta){
    this.num = num;
    if( num == 0) {
      this.initial = 0;
      this.delta = 0;
      return;
    }
    this.initial = initial;
    this.delta = delta;
  }

  public String toString() {
    return ("< " + num + " : " + initial + " &" + delta + " >");
    /* some screen display '&' like  delta sign */
  }

  public int min() {
    if(num == 0)
      return 0;
    if(delta < 0)
      return initial+(delta*(num-1));//num-1 since initial is one of the num too
    return initial;
  }

  public SeqIt createSeqIt() {
    return new DeltaIt(this);
  }


}
