package com.solvd.projectUniversity.linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements Iterable<T>{
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	private class Node<T> {
		private T value;
		private Node<T> previous;
		private Node<T> next;
		
		public Node() {
			this.value = null;
			previous = null;
			next = null;
		}	
		
		public Node(T obj) {
			this.value = obj;
			previous = null;
			next = null;
		}	
		
	}
	
	private class DoublyLinkedListIterator implements Iterator<T> {
        private Node<T> current      = head.next;  
        private Node<T> lastAccessed = null;      
                                               
        private int index = 0;

        public boolean hasNext()      { return index < size; }
        public boolean hasPrevious()  { return index > 0; }
        public int previousIndex()    { return index - 1; }
        public int nextIndex()        { return index;     }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            lastAccessed = current;
            T item = current.value;
            current = current.next; 
            index++;
            return item;
        }

        public T previous() {
            if (!hasPrevious()) throw new NoSuchElementException();
            current = current.previous;
            index--;
            lastAccessed = current;
            return current.value;
        }

    }
		
	public DoublyLinkedList() {
		head  = new Node<T>();
        tail = new Node<T>();
        head.next = tail;
        tail.previous = head;
        size=0;
	}
	
	//Add in the last position
	
    public boolean add(T item) {
        Node<T> last = tail.previous;
        Node<T> x = new Node<T>();
        x.value = item;
        x.next = tail;
        x.previous = last;
        tail.previous = x;
        last.next = x;
        size++;
        return true;
    }
	
	//Add in the index position
	public void add(Integer index, T obj) {
		if((index<0)||(index>size))throw new IndexOutOfBoundsException();
		int actual=0;
		Node<T> previous=head;
		while(actual<index) {
			previous=previous.next;
			actual++;
		}
		Node<T> newNode= new Node<T>(obj);
		newNode.next=previous.next;
		newNode.previous=previous;
		previous.next.previous=newNode;
		previous.next=newNode;
		size++;
	}
	
	//Get the object in the index position
	public T get(Integer index) {
		int actual=0;
		Node<T> tmp=head.next;
		while(actual<index) {
			if(tmp.next!=null)
				tmp=tmp.next;
			else
				throw new IndexOutOfBoundsException();
			actual++;
		}
		return tmp.value;
	}
	


	//Add all the items in arg0
	
	public boolean addAll(Collection<T> arg0) {
		for (T object : arg0) {
			this.add(object);
		}
		return true;
	}
	
	//Remove all the items
	
	public void clear() {
		head  = new Node<T>();
        tail = new Node<T>();
        head.next = tail;
        tail.previous = head;
        size=0;
	}
	
	//Search the object in the list
	
	public boolean contains(T arg0) {
		Iterator<T> i= this.iterator();
		while(i.hasNext()) {
			if(i.next().equals(arg0)) return true;
		}
		return false;
	}
	
	//Check if the list contains all the items in arg0
	
	public boolean containsAll(Collection<T> arg0) {
		int count=0;
		for (T object : arg0) {
			Iterator<T> i= this.iterator();
			while(i.hasNext()) {
				if(i.next().equals(object)) {
					count++;
					break;
				}
			}
		}
		if(count==arg0.size()) return true;
		return false;
	}

	//Returns true if the list is empty
	
	public boolean isEmpty() {
		return size==0;
	}

	//Returns an iterator of the list
	
	public Iterator<T> iterator() {
		return new DoublyLinkedListIterator();
	}

	//Remove the element to the list
	
	public boolean remove(T arg0) {

		Node<T> tmp=head.next;
		try {
			while(!tmp.value.equals(arg0)) {
				if(tmp.next!=null)
					tmp=tmp.next;
			}
			tmp.previous.next=tmp.next;
			tmp.next.previous=tmp.previous;
			size--;
		}
		catch(NullPointerException e) {
			return false;
		}
		return true;
	}

	//Remove all the elements of arg0 to the list
	
	public boolean removeAll(Collection<T> arg0) {
		for (T object : arg0) {
			this.remove(object);
		}		
		return true;
	}

	//Returns the size of the list
	
	public int size() {
		return size;
	}


}