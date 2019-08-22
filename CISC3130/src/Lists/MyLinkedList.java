package Lists;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {

      private static class DListNode<E> {
            private E data;
            private DListNode<E> previous;
            private DListNode<E> next;

            public DListNode(E data, DListNode<E> previous, DListNode<E> next) {
                  this.data = data;
                  this.previous = previous;
                  this.next = next;
            }

            public E getData() {
                  return data;
            }

            public DListNode<E> getNext() {
                  return next;
            }

            public DListNode<E> getPrevious() {
                  return previous;
            }

            public void setData(E data) {
                  this.data = data;
            }

            public void setPrevious(DListNode<E> previous) {
                  this.previous = previous;
            }

            public void setNext(DListNode<E> next) {
                  this.next = next;
            }

      }// end of private DListNode class

      private class MyLinkedListIterator implements Iterator<E> {
            private DListNode<E> pointer;

            public MyLinkedListIterator() {
                  pointer = head;
            }

            public E next() {
                  E old = pointer.getData();
                  pointer = pointer.getNext();
                  return old;
            }

            public boolean hasNext() {
                  return pointer != null;
            }

            public void remove() {
                  throw new UnsupportedOperationException();
            }
      }

      private DListNode<E> head;
      private DListNode<E> tail;
      private int numElements;

      public MyLinkedList() {
            head = null;
            tail = null;
            numElements = 0;
      }

      @Override
      public boolean add(E e) {
            // TODO Auto-generated method stub
            return false;
      }

      @Override
      public void add(int index, E elememt) {
            // TODO Auto-generated method stub

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
      public boolean isEmpty() {
            // TODO Auto-generated method stub
            return false;
      }

      @Override
      public Iterator<E> iterator() {
            // TODO Auto-generated method stub
            return null;
      }

      @Override
      public int lastIndexOf(Object obj) {
            // TODO Auto-generated method stub
            return 0;
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
      public int size() {
            // TODO Auto-generated method stub
            return 0;
      }

}
