import java.io.*;
import java.util.*;
public class FileIO {
	private TrashCan<Garbage> tempTrashCan;
	
	public FileIO() {
		tempTrashCan = new TrashCan<Garbage>();
	}
	
	public IBag<Garbage> readTrashCan(String fileName){
		BufferedReader inputFile = null;
		String line= null; 
		try {			
			inputFile = new BufferedReader(new FileReader(fileName));			
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Not Found");
			System.exit(0);
		}
		
		try {
			line=inputFile.readLine();
			while(line != null) {
				StringTokenizer tokens = new StringTokenizer (line, ","); 
				
				String name=tokens.nextToken();
				String type= tokens.nextToken();
				int amount= Integer.parseInt(tokens.nextToken().strip());
				
				for(int i=0; i<amount; i++) {
					tempTrashCan.add(new Garbage(name, type));
				}
				line = inputFile.readLine();
			}
			inputFile.close();
		}
		
		catch(IOException e) {
			
			e.getMessage();
			System.exit(0);
		}
		return tempTrashCan;
	}
	
	public boolean updateTrashCan() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("updated-garbage.txt"));
            int itemCount = tempTrashCan.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Garbage item = tempTrashCan.getItem(i);
               
                
                // check if the current item has already been written to the file
                boolean alreadyWritten = false;
                for (int j = 0; j < i; j++) {
                    Garbage previousItem = tempTrashCan.getItem(j);
                    if (item.equals(previousItem)) {
                        alreadyWritten = true;
                        break;
                    }
                }
                
                // write the item to the file if it hasn't already been written
                if (!alreadyWritten) {
                	int count = tempTrashCan.getFrequencyOf(item);
                    writer.write(item.getGarbageName() + "," + item.getGarbageType() + "," + count);
                    writer.newLine();
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
        
    }
		
}