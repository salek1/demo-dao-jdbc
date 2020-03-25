package application;

import java.util.Date;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
	
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}
}