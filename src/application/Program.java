package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", 3000.0,"Bob@gmail.com", new Date(), obj);

		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		
		System.out.println(seller);

	}

}
