public class Jumble extends Seq {
  protected int values[], count; 
  Jumble(int []values) {
    count = 0; 
    for( int i  : values)
      count++;

    this.values = new int[count];
    for( int i = 0; i < count; ++i) 
      (this.values)[i] = values[i];

  }

  public String toString() {
    String str = "{ " + count + " :";
    for( int i = 0 ; i < count; ++i) 
      str = str + " " + values[i];
    str = str + " }"; 

    return str; 
  }

}
