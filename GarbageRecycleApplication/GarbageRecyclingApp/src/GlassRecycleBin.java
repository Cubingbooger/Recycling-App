
public class GlassRecycleBin <T> implements IBag <T>{
private	Bag<T> glassRecycleBin;
	
	public GlassRecycleBin(int size) {
		glassRecycleBin = new Bag<T>(size);
	}

	@Override
	public boolean add(T newItem) {
		return glassRecycleBin.add(newItem);
	}

	@Override
	public boolean isEmpty() {
		return glassRecycleBin.isEmpty();
	}

	@Override
	public boolean isFull() {
		return glassRecycleBin.isFull();
	}

	@Override
	public T removeByIndex(int index) {
		return glassRecycleBin.removeByIndex(index);
	}

	@Override
	public T remove() {
		return glassRecycleBin.remove();
	}

	@Override
	public T remove(T item) {
		return glassRecycleBin.remove(item);
	}

	@Override
	public int getItemCount() {
		return glassRecycleBin.getItemCount();
	}

	@Override
	public int getIndexOf(T item) {
		return glassRecycleBin.getIndexOf(item);
	}

	@Override
	public boolean contains(T item) {
		return glassRecycleBin.contains(item);
	}

	@Override
	public void displayItems() {
		glassRecycleBin.displayItems();
		
	}

	@Override
	public void dump() {
		glassRecycleBin.dump();
		
	}

	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		return glassRecycleBin.transferTo(targetBag, item);
	}
	
	public T getItem(int index) {
		return glassRecycleBin.getItem(index);
	}
	
}
