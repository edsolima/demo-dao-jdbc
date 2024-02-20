package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void intert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller fingById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	
}
