import java.util.Date;

public class Framework {
	private int id;
	
	private String name;

	private String version;

	private Date deprecationDate;

	private Byte hyperLevel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getDeprecationDate() {
		return deprecationDate;
	}

	public void setDeprecationDate(Date deprecationDate) {
		this.deprecationDate = deprecationDate;
	}

	public Byte getHyperLevel() {
		return hyperLevel;
	}

	public void setHyperLevel(Byte hyperLevel) {
		this.hyperLevel = hyperLevel;
	}
	
	
	public Framework(int ID, String Name , String Version, byte HyperLevel) throws Exception {
		id = ID;
		name = Name;
		version = Version;
		hyperLevel = HyperLevel; 
	}
	
	public void deleteFramework() {
		name = null;
		version = null;
		hyperLevel =null;
		deprecationDate = null; 
		
	}
}

class FrameworkManager{
	/**
	 * array of Framework	
	 */
	
	private Framework frameworks[];
	private int lastID = 0;
	
	public void addNew(String Name, String Version, byte HyperLevel) throws Exception {
		lastID = lastID + 1;
		frameworks[lastID] = new Framework(lastID, Name, Version, HyperLevel);
	}
	
	public void uppdateFramework(int ID, String Name, String Version, Date DeprecationDate, byte HyperLevel) {
		frameworks[ID].setName(Name);
		frameworks[ID].setVersion(Version);			
		frameworks[ID].setDeprecationDate(DeprecationDate);
		frameworks[ID].setHyperLevel(HyperLevel);				
	}
	

	
	public void deleteFrameworks(int ID) {
		frameworks[ID].deleteFramework();
	}
	
	public void searchFrameworks(int ID) {
		frameworks[ID].getName();
		frameworks[ID].getVersion();
		frameworks[ID].getDeprecationDate();
		frameworks[ID].getHyperLevel();
	}
}
