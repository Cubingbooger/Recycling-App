
public class FabricRecycleBin <T> implements IBag<T> {
	private	Bag<T> fabricRecycleBin;
	
	public FabricRecycleBin(int size) {
		fabricRecycleBin = new Bag<T>(size);
	}

	@Override
	public boolean add(T newItem) {
		return fabricRecycleBin.add(newItem);
	}

	@Override
	public boolean isEmpty() {
		return fabricRecycleBin.isEmpty();
	}

	@Override
	public boolean isFull() {
		return fabricRecycleBin.isFull();
	}

	@Override
	public T removeByIndex(int index) {
		return fabricRecycleBin.removeByIndex(index);
	}

	@Override
	public T remove() {
		return fabricRecycleBin.remove();
	}

	@Override
	public T remove(T item) {
		return fabricRecycleBin.remove(item);
	}

	@Override
	public int getItemCount() {
		return fabricRecycleBin.getItemCount();
	}

	@Override
	public int getIndexOf(T item) {
		return fabricRecycleBin.getIndexOf(item);
	}

	@Override
	public boolean contains(T item) {
		return fabricRecycleBin.contains(item);
	}

	@Override
	public void displayItems() {
		fabricRecycleBin.displayItems();
		
	}

	@Override
	public void dump() {
		fabricRecycleBin.dump();
		
	}

	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		return fabricRecycleBin.transferTo(targetBag, item);
	}
	
	public T getItem(int index) {
		return fabricRecycleBin.getItem(index);
	}

}
