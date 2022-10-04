package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator<MenuItem> {
	private final MenuItem[] list;
	private int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	@Override
	public MenuItem next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		return list[position++];
	}

	@Override
	public boolean hasNext() {
		return position < list.length && list[position] != null;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You can't remove an item until you've done at least one next()");
		}
		if (list[position - 1] != null) {
			if (list.length - 1 - (position - 1) >= 0)
				System.arraycopy(
					list,
					position - 1 + 1, list,
					position - 1,
					list.length - 1 - (position - 1)
				);
			list[list.length - 1] = null;
		}
	}
}
