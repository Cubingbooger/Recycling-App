
public class PlasticRecycleBin <T> implements IBag<T> {
	private	Bag<T> plasticRecycleBin;
	
	public PlasticRecycleBin(int size) {
		plasticRecycleBin = new Bag<T>(size);
	}
	
	@Override
	public boolean add(T newItem) {
		return plasticRecycleBin.add(newItem);
	}

	@Override
	public boolean isEmpty() {
		return plasticRecycleBin.isEmpty();
	}

	@Override
	public boolean isFull() {
		return plasticRecycleBin.isFull();
	}

	@Override
	public T removeByIndex(int index) {
		return plasticRecycleBin.removeByIndex(index);
	}

	@Override
	public T remove() {
		return plasticRecycleBin.remove();
	}

	@Override
	public T remove(T item) {
		return plasticRecycleBin.remove(item);
	}

	@Override
	public int getItemCount() {
		return plasticRecycleBin.getItemCount();
	}

	@Override
	public int getIndexOf(T item) {
		return plasticRecycleBin.getIndexOf(item);
	}

	@Override
	public boolean contains(T item) {
		return plasticRecycleBin.contains(item);
	}

	@Override
	public void displayItems() {
		plasticRecycleBin.displayItems();
		
	}

	@Override
	public void dump() {
		plasticRecycleBin.dump();
		
	}

	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		return plasticRecycleBin.transferTo(targetBag, item);
	}
	
	public T getItem(int index) {
		return plasticRecycleBin.getItem(index);
	}

}
