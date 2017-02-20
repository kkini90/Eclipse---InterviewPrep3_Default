
public class IteratorIMPL {

}

/*
 * 
 * final class FluentData implements Iterator<Byte> {
  private final Data data;
  private final Queue<Byte> buffer = new LinkedList<>();
  public FluentData(final Data dat) {
    this.data = dat;
  }
  public boolean hasNext() {
    if (this.buffer.isEmpty()) {
      for (final byte item : this.data.read()) {
        this.buffer.add(item);
      }
    }
    return !this.buffer.isEmpty();
  }
  public Byte next() {
    if (!this.hasNext()) {
      throw new NoSuchElementException("Nothing left");
    }
    return this.buffer.poll();
  }
  public void remove() {
    throw new UnsupportedOperationException("It is read-only");
  }
}
*/