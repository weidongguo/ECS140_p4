// the SeqIt base interface  ==> for make an iterator

public interface SeqIt { 
    // any more elements?
    public boolean hasNext();
    // return the next element and advance iterator to following item.
    public int next() throws UsingIteratorPastEndException;
}
