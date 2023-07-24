
public class OrganicRecycleBin <T> implements IBag <T>{
	private	Bag<T> organicRecycleBin;
	
	public OrganicRecycleBin(int size) {
		organicRecycleBin = new Bag<T>(size);
	}

	@Override
	public boolean add(T newItem) {
		return organicRecycleBin.add(newItem);
	}

	@Override
	public boolean isEmpty() {
		return organicRecycleBin.isEmpty();
	}

	@Override
	public boolean isFull() {
		return organicRecycleBin.isFull();
	}

	@Override
	public T removeByIndex(int index) {
		return organicRecycleBin.removeByIndex(index);
	}

	@Override
	public T remove() {
		return organicRecycleBin.remove();
	}

	@Override
	public T remove(T item) {
		return organicRecycleBin.remove(item);
	}

	@Override
	public int getItemCount() {
		return organicRecycleBin.getItemCount();
	}

	@Override
	public int getIndexOf(T item) {
		return organicRecycleBin.getIndexOf(item);
	}

	@Override
	public boolean contains(T item) {
		return organicRecycleBin.contains(item);
	}

	@Override
	public void displayItems() {
		organicRecycleBin.displayItems();
		
	}

	@Override
	public void dump() {
		organicRecycleBin.dump();
		
	}

	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		return organicRecycleBin.transferTo(targetBag, item);
	}
	
	public T getItem(int index) {
		return organicRecycleBin.getItem(index);
	}
	

}
