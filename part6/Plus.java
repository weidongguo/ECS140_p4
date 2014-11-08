public class Plus {
  /*add two Constant sequences*/
  public static Seq plus(Constant c1, Constant c2) {
    return new Constant((c1.num < c2.num)?c1.num:c2.num, (c1.value + c2.value));  
  }

  /*add two delta sequences*/
  public static Seq plus(Delta d1, Delta d2) {
    return new Delta((d1.num < d2 .num)?d1.num:d2.num, (d1.initial + d2.initial),
                      (d1.delta + d2.delta));
                      
  }

  public static Seq plus(Jumble j1, Jumble j2){
    int new_size = (j1.count < j2.count) ? j1.count : j2.count;
    int new_arr[] = new int[new_size];
    for(int i = 0; i < new_size; i++) {
      new_arr[i]  = j1.values[i] + j2.values[i]; //add each corresponding element
    }
    return new Jumble(new_arr); // the Jumble constructor does copy 
  }
}
