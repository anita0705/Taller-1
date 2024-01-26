package co.edu.unbosque.model;

public class SupplierDTO extends User {

	private String rol;

	public SupplierDTO() {
		// TODO Auto-generated constructor stub
	}

	public SupplierDTO(String rol) {
		super();
		this.rol = rol;
	}

	public SupplierDTO(long id, String name, String businessName, String rol) {
		super(id, name, businessName);
		this.rol = rol;
	}

	public SupplierDTO(long id, String name, String businessName) {
		super(id, name, businessName);
		// TODO Auto-generated constructor stub
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "SupplierDTO [rol=" + rol + "]";
	}

}
