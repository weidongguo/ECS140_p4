public class Jumble extends Seq {
  protected int values[] , num; //# of elements in the array Values[];
  Jumble(int []values) {
    num = 0; 
    for( int i  : values) //count how many elements is in the array passed in
      num++;

    this.values = new int[num];
    for( int i = 0; i < num; ++i) //doing what System.arraycopy() does
      (this.values)[i] = values[i];
    
    //System.arraycopy(values, 0 , this.values, 0, num);
  }

  public String toString() {
    String str = "{ " + num + " :";
    for( int i = 0 ; i < num; ++i) 
      str = str + " " + values[i];
    str = str + " }"; 

    return str; 
  }

  public int min () {
    if( num == 0)
      return 0;
    int min = values[0]; 
    for(int elem : values) {
      if(elem < min)   
        min = elem;
    }
    return min;
  }

  public SeqIt createSeqIt() { // it's upcasted right away, still having access
                               // to actual implementation of the abstract methods
                               // from SeqIt
    return new JumbleIt(this);
  }

  public int getSize() { 
    return num;
  }

}
