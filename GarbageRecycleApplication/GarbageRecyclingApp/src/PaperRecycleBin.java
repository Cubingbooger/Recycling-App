
public class PaperRecycleBin <T> implements IBag <T>{
	private	Bag<T> paperRecycleBin;
	
	public PaperRecycleBin(int size) {
		paperRecycleBin = new Bag<T>(size);
	}

	@Override
	public boolean add(T newItem) {
		return paperRecycleBin.add(newItem);
	}

	@Override
	public boolean isEmpty() {
		return paperRecycleBin.isEmpty();
	}

	@Override
	public boolean isFull() {
		return paperRecycleBin.isFull();
	}

	@Override
	public T removeByIndex(int index) {
		return paperRecycleBin.removeByIndex(index);
	}

	@Override
	public T remove() {
		return paperRecycleBin.remove();
	}

	@Override
	public T remove(T item) {
		return paperRecycleBin.remove(item);
	}

	@Override
	public int getItemCount() {
		return paperRecycleBin.getItemCount();
	}

	@Override
	public int getIndexOf(T item) {
		return paperRecycleBin.getIndexOf(item);
	}

	@Override
	public boolean contains(T item) {
		return paperRecycleBin.contains(item);
	}

	@Override
	public void displayItems() {
		paperRecycleBin.displayItems();
		
	}

	@Override
	public void dump() {
		paperRecycleBin.dump();
		
	}

	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		return paperRecycleBin.transferTo(targetBag, item);
	}
	
	public T getItem(int index) {
		return paperRecycleBin.getItem(index);
	}
}
