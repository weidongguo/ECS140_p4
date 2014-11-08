public class Constant extends Seq {
  protected int num, value;

  Constant(int num, int value) {
    this.num = num;
    if( num == 0 ) {
      this.value = 0;
      return;
    }
    this.value = value;
  }

  public String toString() {
    return("[ " +  num + " : " + value + " ]");

  }
  
  /* returns the minimum value of the sequence */
  public int min() {
    return ( num == 0 ? 0:value);
    /* since all values are the same, all of them are min */ 
  }

  public SeqIt createSeqIt() {
    return new ConstantIt(this); 
  }


}
