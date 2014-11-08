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

}
