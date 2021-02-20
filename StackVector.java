import java.util.Vector;

/**
 * @author moise
 *
 */
public class StackVector<E> extends Stack<E> {

	protected Vector<E> core;
	protected int tail;
	
	public StackVector(int size) {
		core = new Vector<E>(size);
		tail = 0;
	}
	
	@Override
	public boolean push(E element) {
		if (this.count() < core.size()) {
			tail++;
			core.insertElementAt(element, tail);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public E peek() {
		return core.get(tail);
	}

	@Override
	public E pop() {
		if (this.isEmpty()) {
			return null;
		} else {
			E temp = core.get(tail);
			tail--;
			return temp;
		}
	}

	@Override
	public int count() {
		return (tail + 1);
	}

	@Override
	public boolean isEmpty() {
		return (tail == -1);
	}

}
