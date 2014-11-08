public class Plus {
  /*add two Constant sequences*/
  public static Seq plus(Constant c1, Constant c2) {
    return new Constant((c1.num < c2.num)?c1.num:c2.num, (c1.value + c2.value));  
  }

  /*add two Delta sequences*/
  public static Seq plus(Delta d1, Delta d2) {
    return new Delta((d1.num < d2 .num)?d1.num:d2.num, (d1.initial + d2.initial),
                      (d1.delta + d2.delta));
                      
  }
  
  /*add two Jumble sequences */
  public static Seq plus(Jumble j1, Jumble j2){
    int new_size = (j1.count < j2.count) ? j1.count : j2.count;
    int new_arr[] = new int[new_size];
    for(int i = 0; i < new_size; i++) {
      new_arr[i]  = j1.values[i] + j2.values[i]; //add each corresponding element
    }
    return new Jumble(new_arr); // the Jumble constructor does copy 
  }

  /* add a Constant and a Delta sequence */
  public static Seq plus(Constant c, Delta d) {
    return new Delta( (c.num < d.num)?c.num:d.num, c.value + d.initial, d.delta); 

  }
  public static Seq plus(Delta d, Constant c) {
    return new Delta( (c.num < d.num)?c.num:d.num, c.value + d.initial, d.delta); 
  }

  
  /* add a Constant and a Jumble sequence */
  public static Seq plus(Constant c, Jumble j) {
    int new_size = (c.num < j.count) ? c.num : j.count;
    int new_array[] = new int[new_size];
    for(int i = 0; i< new_size; i++) 
      new_array[i] = j.values[i] + c.value; // add each element with a const
    return new Jumble(new_array);
  } 
  public static Seq plus(Jumble j, Constant c) {
    int new_size = (c.num < j.count) ? c.num : j.count;
    int new_array[] = new int[new_size];
    for(int i = 0; i< new_size; i++) 
      new_array[i] = j.values[i] + c.value; // add each element with a const
    return new Jumble(new_array);
  }

  /* add a Delta and a Jumble sequence */ 
  public static Seq plus(Delta d, Jumble j) {
    int new_size = (d.num < j.count)?d.num:j.count;
    int []new_arr = new int[new_size]; 
    for(int i = 0; i < new_size; i++) 
      new_arr[i] = j.values[i] + (d.initial + d.delta*i);
    return new Jumble(new_arr);
  }
  public static Seq plus(Jumble j, Delta d) {
    int new_size = (d.num < j.count)?d.num:j.count;
    int []new_arr = new int[new_size]; 
    for(int i = 0; i < new_size; i++) 
      new_arr[i] = j.values[i] + (d.initial + d.delta*i);
    return new Jumble(new_arr);
  }

}
