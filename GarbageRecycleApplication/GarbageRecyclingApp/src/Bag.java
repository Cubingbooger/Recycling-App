
public class Bag<T> implements IBag<T> {
	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY= 30;
	
	public Bag() {
		this(DEFAULT_CAPACITY);
	}
	public Bag(int capacity) {
		@SuppressWarnings("unchecked")
		T [] tempBag= (T[]) new Object[capacity];
		bag=tempBag;
		numberOfEntries=0;
	}
	
	@Override
	public boolean add(T newItem) {
		boolean result=true;
		if(isFull()) {
			result=false;
		}
		else {
			bag[numberOfEntries]= newItem;
			numberOfEntries++;
		}
		return result;
		
	}
	
	@Override
	public boolean isEmpty() {
		
		return numberOfEntries==0;
		
	}

	@Override
	public boolean isFull() {
		
		return numberOfEntries >= bag.length;
		
	}

	@Override
	public T removeByIndex(int index) {
		T result = null;
		if (!isEmpty() && (index>= 0)) {
			result= bag[index];
			bag[index]=bag[numberOfEntries-1];
			bag[numberOfEntries-1]= null;
			numberOfEntries--;
						
		}
		return result;
	}

	@Override
	public T remove() {
		T result=null;
		if( numberOfEntries> 0) {
			result=bag[numberOfEntries-1];
			bag[numberOfEntries-1]=null;
			numberOfEntries--;
		}
		return result;
	}

	@Override
	public T remove(T item) {
		int index=getIndexOf(item);
		T result= removeByIndex(index);
		return result;
	}

	@Override
	public int getItemCount() {
		
		return numberOfEntries;
	}

	@Override
	public int getIndexOf(T item) {
		for (int i=0; i<numberOfEntries; i++){
			if (item== bag[i]) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean contains(T item) {
		boolean found=false;
		int index=0;
		while (!found && (index<numberOfEntries)) {
			if(item.equals(bag[index])) {
				found=true;
			}
			index++;
			
		}
		return found;
	}

	@Override
	public void displayItems() {
		
		int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            T item = getItem(i);
            
            // check if the current item has already been written
            boolean alreadyWritten = false;
            for (int j = 0; j < i; j++) {
                T previousItem = getItem(j);
                if (item.equals(previousItem)) {
                    alreadyWritten = true;
                    break;
                }
            }
            
            // write the item if it hasn't already been written
            if (!alreadyWritten) {
            	Garbage garbage = (Garbage) item;
            	int count = getFrequencyOf(item);
                System.out.println(garbage.getGarbageName() + "," + garbage.getGarbageType()
                + "," + count);
            }
        }
		
		
	}

	@Override
	public void dump() {
		while(!isEmpty()) {
			remove();
		}
		
	}
	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		if(targetBag.isFull()) {
			return false;
		}
		targetBag.add(item);
		remove(item);
		return true;
	}
	
	public T getItem(int index) {
		return bag[index];
	}

	
	// getting the number of occurrences of each garbage
	public int getFrequencyOf(T item) {
	    int count = 0;
	    int itemCount = getItemCount();
	    for (int i = 0; i < itemCount; i++) {
	        if (getItem(i).equals(item)) {
	            count++;
	        }
	    }
	    return count;
	}

}
