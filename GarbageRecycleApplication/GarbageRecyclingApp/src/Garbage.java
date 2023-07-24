
public class Garbage {
	private String name;
	private String type;
	
	public Garbage() {
		this("", "");
	}
	public Garbage(String name, String type) {
		this.name=name;
		this.type=type;
	}
	public Garbage(Garbage garbage) {
		this.name=garbage.name;
		this.type=garbage.type;
		
	}
	
	public String getGarbageName() {
		return name;
	}
	public String getGarbageType() {
		return type;
	}
	public String toString() {
		return name + "," + type;
	}
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Garbage other=(Garbage) obj;
		return name.equals(other.name) && type.equals(other.type);
		
	}
		
}
