package homework_02;

public interface MyList<E> extends Iterable<E> {
	
	public boolean add(E element);
	public E add(int index, E element);
	public E remove (int index);

}
