
public class MetalRecycleBin <T> implements IBag <T> {
	private	Bag<T> metalRecycleBin;
	
	public MetalRecycleBin(int size) {
		metalRecycleBin = new Bag<T>(size);
	}

	@Override
	public boolean add(T newItem) {
		return metalRecycleBin.add(newItem);
	}

	@Override
	public boolean isEmpty() {
		return metalRecycleBin.isEmpty();
	}

	@Override
	public boolean isFull() {
		return metalRecycleBin.isFull();
	}

	@Override
	public T removeByIndex(int index) {
		return metalRecycleBin.removeByIndex(index);
	}

	@Override
	public T remove() {
		return metalRecycleBin.remove();
	}

	@Override
	public T remove(T item) {
		return metalRecycleBin.remove(item);
	}

	@Override
	public int getItemCount() {
		return metalRecycleBin.getItemCount();
	}

	@Override
	public int getIndexOf(T item) {
		return metalRecycleBin.getIndexOf(item);
	}

	@Override
	public boolean contains(T item) {
		return metalRecycleBin.contains(item);
	}

	@Override
	public void displayItems() {
		metalRecycleBin.displayItems();
		
	}

	@Override
	public void dump() {
		metalRecycleBin.dump();
		
	}

	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		return metalRecycleBin.transferTo(targetBag, item);
	}
	
	public T getItem(int index) {
		return metalRecycleBin.getItem(index);
	}
}
