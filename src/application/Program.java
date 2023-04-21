package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.creatSellerDao();

		System.out.println("=== Test 1: Seller findById===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("=== Test 2: Seller findByDepartment===");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=== Test 3: Seller findAll===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
