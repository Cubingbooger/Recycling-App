 public class GarbageRecyclingApp {
	public static void main(String [] args) {
		FileIO garbageFile = new FileIO();
		TrashCan <Garbage> trashCan = (TrashCan<Garbage>) garbageFile.readTrashCan("garbage.txt");

	
		//Printing Trash Can size and content before update
		System.out.println(" The Trash Can:" + trashCan.getItemCount());
		trashCan.displayItems();
		System.out.println();
		
		
		//Filling Recycle Bins randomly with Trash Can content
		trashCan.fillBinsRandomly();
		
		//Printing updated Trash Can and Recycle Bin content
		trashCan.displayBinContent();
		//Writing "updated-garbage.txt" file with content of updated Trash Can
		garbageFile.updateTrashCan();
		
		
	}
}