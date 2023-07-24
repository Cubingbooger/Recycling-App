import java.util.*;
public class TrashCan<T> implements IBag<T>{
	private	Bag<T> trashCan;
	
	private PlasticRecycleBin <Garbage> plastic = null;
	private PaperRecycleBin <Garbage> paper = null;
	private GlassRecycleBin <Garbage> glass = null;
	private FabricRecycleBin <Garbage> fabric = null;
	private MetalRecycleBin <Garbage> metal = null;
	private OrganicRecycleBin <Garbage> organic = null;
	
	public TrashCan() {
		trashCan = new Bag<T>(450); 
		
		plastic = new PlasticRecycleBin<Garbage>(getRandomSize());
		paper = new PaperRecycleBin<Garbage>(getRandomSize());
		glass = new GlassRecycleBin<Garbage>(getRandomSize());
		fabric = new FabricRecycleBin<Garbage>(getRandomSize());
		metal = new MetalRecycleBin<Garbage>(getRandomSize());
		organic = new OrganicRecycleBin<Garbage>(getRandomSize());
	}
	
	//returns random value of 5,10 or 15
	public int getRandomSize() {
		Random rnd = new Random(); 
		int size = rnd.nextInt(1,3);
		size*=5;
		return size;
	}
	
	public int getRandom(int bound) {
		Random rnd = new Random();
		int rndNum = rnd.nextInt(bound);
		return rndNum;
	}
	
	@Override
	public boolean add(T newItem) {
		return trashCan.add(newItem);
	}

	@Override
	public boolean isEmpty() {
		return trashCan.isEmpty();
	}

	@Override
	public boolean isFull() {
		return trashCan.isFull();
	}

	@Override
	public T removeByIndex(int index) {
		return trashCan.removeByIndex(index);
	}

	@Override
	public T remove() {
		return trashCan.remove();
	}

	@Override
	public T remove(T item) {
		return trashCan.remove(item);
	}

	@Override
	public int getItemCount() {
		return trashCan.getItemCount();
	}

	@Override
	public int getIndexOf(T item) {
		return trashCan.getIndexOf(item);
	}

	@Override
	public boolean contains(T item) {
		return trashCan.contains(item);
	}

	@Override
	public void displayItems() {
		trashCan.displayItems();
		
	}

	@Override
	public void dump() {
		trashCan.dump();
		
	}
	
	@SuppressWarnings("unchecked")
	public boolean separate(T item) {
		boolean status = true;

		Garbage tempGarbage = (Garbage)item;
		String type = tempGarbage.getGarbageType();
		switch(type) {
		case "plastic":
			status = transferTo((IBag<T>)plastic, item);
			break;
		case "paper":
			status = transferTo((IBag<T>)paper,item);
			break;
		case "glass":
			status = transferTo((IBag<T>)glass,item);
			break;
		case "fabric":
			status = transferTo((IBag<T>)fabric,item);
			break;
		case "metal":
			status = transferTo((IBag<T>)metal,item);
			break;
		case "organic":
			status = transferTo((IBag<T>)organic,item);
			break;
		}

		if( status == false){
			return false;
		}
		return true;
	}
	
	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		return trashCan.transferTo(targetBag, item);
	}
	
	public T getItem(int index) {
		return trashCan.getItem(index);
	}
	
	
	public void fillBinsRandomly() {
		int i = getItemCount();
		while ((!plastic.isFull() || !paper.isFull() || !glass.isFull() || !fabric.isFull()
				|| !metal.isFull() || !organic.isFull())&& !trashCan.isEmpty()) {
			int itemIndex= getRandom(i);
			T tempGarbage = getItem(itemIndex);
			boolean status = separate(tempGarbage);
			if (status == true ) {
				i--;
				
			}
		}
	}
	public void displayBinContent() {
		System.out.println( " Plastic Recycling Bin:" + plastic.getItemCount() );
		plastic.displayItems();
		System.out.println();
		System.out.println(" Paper Recycling Bin:" + paper.getItemCount());
		paper.displayItems();
		System.out.println();
		System.out.println( " Glass Recycling Bin:" + glass.getItemCount());
		glass.displayItems();
		System.out.println();
		System.out.println( " Fabric Recycling Bin:" + fabric.getItemCount());
		fabric.displayItems();
		System.out.println();
		System.out.println( " Metal Recycling Bin:" + metal.getItemCount());
		metal.displayItems();
		System.out.println();
		System.out.println( " Organic Recycling Bin:" + organic.getItemCount());
		organic.displayItems();
		System.out.println();
		System.out.println(" The Updated Trash Can:" + getItemCount());
		displayItems();
	}
	
	public int getFrequencyOf(T item) {
	    return trashCan.getFrequencyOf(item);
	}
}
