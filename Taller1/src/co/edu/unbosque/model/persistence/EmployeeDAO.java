package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.EmployeeDTO;

public class EmployeeDAO implements CRUDOperation {
	private ArrayList<EmployeeDTO> listOfEmployees;

	public EmployeeDAO() {
		listOfEmployees = new ArrayList<>();
	}

	@Override
	public void create(String... strs) {
		EmployeeDTO temp = new EmployeeDTO();
		temp.setId(Long.parseLong(strs[0]));
		temp.setName(strs[1]);
		temp.setBusinessName(strs[2]);
		temp.setSalaryBase(Float.parseFloat(strs[3]));
	}

	@Override
	public void create(Object o) {
		listOfEmployees.add((EmployeeDTO) o);
	}

	@Override
	public String readAll() {
		String printable = "";
		for (EmployeeDTO ds : listOfEmployees) {
			printable += ds.toString();
		}
		return printable;
	}

	@Override
	public boolean update(int index, String... strs) {
		if (index < 0 || index >= listOfEmployees.size()) {
			return false;
		} else {
			if (!strs[0].isBlank() || strs[0] != null) {
				listOfEmployees.get(index).setId(Long.parseLong(strs[0]));
			}
			if (!strs[1].isBlank() || strs[1] != null) {
				listOfEmployees.get(index).setName(strs[1]);
			}
			if (!strs[2].isBlank() || strs[2] != null) {
				listOfEmployees.get(index).setBusinessName(strs[2]);
			}
			if (!strs[3].isBlank() || strs[3] != null) {
				listOfEmployees.get(index).setSalaryBase(Float.parseFloat(strs[3]));
			}

			return true;
		}

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfEmployees.size()) {
			return false;
		} else {
			listOfEmployees.remove(index);
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		if (o == null) {
			return false;
		} else if (listOfEmployees.remove((EmployeeDTO) o)) {
			return true;
		} else {
			return false;
		}
	}

}
