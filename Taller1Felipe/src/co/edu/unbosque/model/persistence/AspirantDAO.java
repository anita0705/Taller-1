package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AspirantDTO;

public class AspirantDAO implements CRUDOperation {
	private ArrayList<AspirantDTO> listOfAspirants;

	public AspirantDAO() {
		listOfAspirants = new ArrayList<>();
	}

	@Override
	public void create(String... strs) {
		AspirantDTO temp = new AspirantDTO();
		temp.setName(strs[0]);
		temp.setBusinessName(strs[1]);
		temp.setUniversity(strs[2]);
		temp.setId(Long.parseLong(strs[3]));

		listOfAspirants.add(temp);
	}

	@Override
	public void create(Object o) {
		listOfAspirants.add((AspirantDTO) o);
	}

	@Override
	public String readAll() {
		String printable = "";
		for (AspirantDTO in : listOfAspirants) {
			printable += in.toString();
		}
		return printable;
	}

	@Override
	public boolean update(int index, String... strs) {
		if (index < 0 || index >= listOfAspirants.size()) {
			return false;
		} else {
			if (!strs[0].isBlank() || strs[0] != null) {
				listOfAspirants.get(index).setName(strs[0]);
			}
			if (!strs[1].isBlank() || strs[1] != null) {
				listOfAspirants.get(index).setBusinessName(strs[1]);
			}
			if (!strs[2].isBlank() || strs[2] != null) {
				listOfAspirants.get(index).setUniversity(strs[2]);
			}
			if (!strs[3].isBlank() || strs[3] != null) {
				listOfAspirants.get(index).setId(Long.parseLong(strs[3]));
			}

			return true;
		}

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfAspirants.size()) {
			return false;
		} else {
			listOfAspirants.remove(index);
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		if (o == null) {
			return false;
		} else if (listOfAspirants.remove((AspirantDTO) o)) {
			return true;
		} else {
			return false;
		}
	}

}
