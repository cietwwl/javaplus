package cn.javaplus.collections.list;

import java.util.Iterator;

public class ReadOnlyIterator<T> implements Iterator<T> {

	private Iterator<T>	iterator;

	public ReadOnlyIterator(Iterator<T> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public T next() {
		return iterator.next();
	}

	@Override
	public void remove() {
		throw new ReadOnlyException();
	}


}
