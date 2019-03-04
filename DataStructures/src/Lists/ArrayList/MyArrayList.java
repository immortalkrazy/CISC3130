package Lists.ArrayList;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
	
	private class MyArrayListIterator implements Iterator<E> {
		
		private int index;
		
		public MyArrayListIterator() {
			index = 0;
		}
		
		public boolean hasNext() {
			return index < logicalLength;			
		}
		
		public E next() {
			index++;
			return arr[index - 1];
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}// end of iterator

	private int logicalLength;
	private E[] arr;
	
	public MyArrayList(int initialLength) {
		arr = (E[]) new Object[initialLength];
		logicalLength = 0;
	}
	
	public MyArrayList() {
		this(10);
	}
	
	
	@Override
	public Iterator<E> iterator() {
		return new MyArrayListIterator();
	}

	@Override
	public boolean add(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
