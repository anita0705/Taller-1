package co.edu.unbosque.model;

public class AspirantDTO extends User {

	private String university;

	public AspirantDTO() {
		// TODO Auto-generated constructor stub
	}

	public AspirantDTO(String university) {
		super();
		this.university = university;
	}

	public AspirantDTO(long id, String name, String businessName, String university) {
		super(id, name, businessName);
		this.university = university;
	}

	public AspirantDTO(long id, String name, String businessName) {
		super(id, name, businessName);
		// TODO Auto-generated constructor stub
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "AspirantDTO [university=" + university + "]";
	}

}
