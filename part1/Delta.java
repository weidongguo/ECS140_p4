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


}
