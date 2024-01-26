package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SupplierDTO;

public class SupplierDAO implements CRUDOperation {
	private ArrayList<SupplierDTO> listOfSuppliers;

	public SupplierDAO() {
		listOfSuppliers = new ArrayList<>();
	}

	@Override
	public void create(String... strs) {
		SupplierDTO temp = new SupplierDTO();
		temp.setName(strs[0]);
		temp.setBusinessName(strs[1]);
		temp.setRol(strs[2]);
		temp.setId(Long.parseLong(strs[3]));

		listOfSuppliers.add(temp);
	}

	@Override
	public void create(Object o) {
		listOfSuppliers.add((SupplierDTO) o);
	}

	@Override
	public String readAll() {
		String printable = "";
		for (SupplierDTO in : listOfSuppliers) {
			printable += in.toString();
		}
		return printable;
	}

	@Override
	public boolean update(int index, String... strs) {
		if (index < 0 || index >= listOfSuppliers.size()) {
			return false;
		} else {
			if (!strs[0].isBlank() || strs[0] != null) {
				listOfSuppliers.get(index).setName(strs[0]);
			}
			if (!strs[1].isBlank() || strs[1] != null) {
				listOfSuppliers.get(index).setBusinessName(strs[1]);
			}
			if (!strs[2].isBlank() || strs[2] != null) {
				listOfSuppliers.get(index).setRol(strs[2]);
			}
			if (!strs[3].isBlank() || strs[3] != null) {
				listOfSuppliers.get(index).setId(Long.parseLong(strs[3]));
			}

			return true;
		}

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfSuppliers.size()) {
			return false;
		} else {
			listOfSuppliers.remove(index);
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		if (o == null) {
			return false;
		} else if (listOfSuppliers.remove((SupplierDTO) o)) {
			return true;
		} else {
			return false;
		}
	}
}
