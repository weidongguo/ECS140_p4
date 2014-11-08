public class Jumble extends Seq {
  protected int values[], count; 
  Jumble(int []values) {
    count = 0; 
    for( int i  : values) //count how many elements is in the array passed in
      count++;

    this.values = new int[count];
    for( int i = 0; i < count; ++i) //doing what System.arraycopy() does
      (this.values)[i] = values[i];
    
    //System.arraycopy(values, 0 , this.values, 0, count);
  }

  public String toString() {
    String str = "{ " + count + " :";
    for( int i = 0 ; i < count; ++i) 
      str = str + " " + values[i];
    str = str + " }"; 

    return str; 
  }

  public int min () {
    if(count == 0)
      return 0;
    int min = values[0]; 
    for(int elem : values) {
      if(elem < min)   
        min = elem;
    }
    return min;
  }

}
