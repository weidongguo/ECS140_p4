public class JumbleUser{
  public static int lengthLongestNDCSS1(Jumble j){
    int max = 1, count = 1; //count = 1 since i will prime the pump
                            // max = 1 b/c there will be at least 1 element
                            // otherwise, return 0 is executed before return max
    JumbleIt ji = new JumbleIt(j);  
    if(!ji.hasNext())// no element in it
      return 0;

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

    return max;
  }
}
