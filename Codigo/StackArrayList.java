/**
 * Implementa el stack con un ArrayList
 * @author Luis Santos
 * @author Diego Cordova
 */

import java.util.ArrayList;

public class StackArrayList<E> extends Stack<E> {
    protected ArrayList<E> core;
	
	public StackArrayList() {
		core = new ArrayList<E>();
	}
	
	@Override
	public boolean push(E element) {
		return core.add(element);
	}

	@Override
	public E peek() {
		return core.get(core.size() - 1);
	}

	@Override
	public E pop() {
		return core.remove(core.size() - 1);
	}

	@Override
	public int count() {
		return core.size();
	}

	@Override
	public boolean isEmpty() {
		return core.isEmpty();
	}
}
