public class JumbleUser{
  public static int lengthLongestNDCSS1(Jumble j){
    int max = 0, count = 1; //count = 1 since I will prime the pump
                            // otherwise, return 0 is executed before return max
    JumbleIt ji = new JumbleIt(j);  
    if(!ji.hasNext())// no element in it
      return 0;
   try{
    int current_num = ji.next(); //set the first num, "prime the pump"
    for(; ji.hasNext();){
      int temp;
      if( (temp = ji.next()) >= current_num) {
        count++;
      }
      else { // it's not non-descreasing (~ increasing || equal) anymore
        if(count > max) 
          max = count;
        count = 1; //re-calculating count
      }
      current_num = temp;//update current_num
    }

    /*take care of the last subsequence */
    if(count > max)
      max = count;

   }catch(UsingIteratorPastEndException e) { System.out.println(e); }
    return max;
 }

 public static int lengthLongestNDCSS2(Jumble j){
    int max = 0 , count = 0;
    JumbleIt ji = new JumbleIt(j);  
    try {
      int current_num = ji.next(); //set the first num
      count += 1; 
      for(;;){
        int temp;
        if( (temp = ji.next()) >= current_num) {
          count++;
        }
        else { // it's not non-descreasing anymore
          if(count > max) 
            max = count;
          count = 1; //re-calculating count
        }
        current_num = temp;//update current_num
      }

    }catch(UsingIteratorPastEndException e) {// at the end of the loop
      /*take care of the last subsequence */
      if(count > max)
        max = count;
      return max;
    }
 }
}
