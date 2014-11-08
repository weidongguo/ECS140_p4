public class UsingIteratorPastEndException extends Exception {
  static final long serialVersionUID = 98L;  
   
  UsingIteratorPastEndException() {} ; //a parameterless constructor
  UsingIteratorPastEndException(String msg) {
    super(msg);
  }

}
