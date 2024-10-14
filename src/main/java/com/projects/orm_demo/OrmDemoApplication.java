package com.projects.orm_demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projects.orm_demo.entities.Category;
import com.projects.orm_demo.entities.Product;
import com.projects.orm_demo.repos.CategoryRepo;
import com.projects.orm_demo.repos.ProductRepo;

@SpringBootApplication
public class OrmDemoApplication implements CommandLineRunner {


	private Logger logger = LoggerFactory.getLogger(OrmDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OrmDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Student student = new Student(11, "name1", "about1");

		// Laptop laptop = new Laptop(111, "12345", "Dell");

		// Address address1 = new Address(1111, "street1", "city1", "country1");
		// Address address2 = new Address(1112, "street2", "city2", "country2");

		// List<Address> addresses = List.of(address1, address2);

		// laptop.setStudent(student);
		// address1.setStudent(student);
		// address2.setStudent(student);

		// student.setLaptop(laptop);
		// student.setAddressList(addresses);

		// Student save = studentRepository.save(student);
		// logger.info("Student saved with id: {}", save.getStudentId());

		// Student find = studentRepository.findById(save.getStudentId()).orElse(null);
		// logger.info("Student found with id: {}", find.getStudentId());
		// Laptop laptop1 = find.getLaptop();
		// logger.info("Laptop found with id: {}", laptop1.getLaptopId());
		// List<Address> addresses1 = find.getAddressList();
		// logger.info("Addresses found with id: {}", addresses1);

		// student.setLaptop(laptop);

		// Student save = studentRepository.save(student);

		// logger.info("saved student : {}", save.getStudentName());f

		// Student byId = studentRepository.findById(11).get();
		// logger.info("student by id : {}", byId.getStudentName());
		// List<Address> addresses = byId.getAddressList();
		// logger.info("addresses : {}", addresses);

		// Laptop laptop = byId.getLaptop();
		// logger.info("laptop : {}", laptop.getBrand());

		// Category category1 = new Category("cid2", "category1");
		// Category category2 = new Category("cid3", "category1");

		// Product  product1 = new Product("pid1", "product1");
		// Product  product2 = new Product("pid2", "product2");
		// Product  product3 = new Product("pid3", "product3");

		// List<Product> category1Products = category1.getProducts();
		// category1Products.add(product1);
		// category1Products.add(product2);
		// category1Products.add(product3);

		// List<Product> category2Products =  category2.getProducts();
		// category2Products.add(product1);
		// category2Products.add(product2);

		// categoryRepository.save(category1);
		// categoryRepository.save(category2);

		// Category category = categoryRepository.findById("cid2").get();
		// System.out.println(category.getProducts().size());
		// Category category1 = categoryRepository.findById("cid3").get();
		// System.out.println(category1.getProducts().size());

	}

	@Autowired
	private CategoryRepo  categoryRepository;

}
