package hu.helixlab;

import hu.helixlab.domain.User;
import hu.helixlab.service.UserService;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserService();

		for(int i = 0; i < 10; ++i){
			User user = new User();
			user.setEmail("example" + i + "@gmail.com");

			userService.save(user);
		}

		for(User u : userService.findAll()){
			System.out.println(u.toString());
		}

		User user = userService.findById(2);
	}
}

























//	List<User> users = manager.createQuery("SELECT u FROM User u", User.class).getResultList();
//			for(User us : users){
//					System.out.println(us);
//					}
//

//	// Create User object
//	User u = new User();
//			u.setEmail("sadas@gmail.com");
//					u.setUsername("béla");
//
//					Role r = new Role();
//					r.setRoleName("admin");
//					manager.persist(r);
//					u.addRole(r);
//
//					SalaryInformation si = new SalaryInformation();
//					si.setBaseSalary(100000);
//					si.setNote("Tfdvvxvc");
//					manager.persist(si);
//					u.setSalaryInformation(si);
//
//					Note n1 = new Note();
//					n1.setNoteTtext("dsfddsf1");
//					manager.persist(n1);
//
//					Note n2 = new Note();
//					n2.setNoteTtext("dsfddsf2");
//					manager.persist(n2);
//
//					u.addNote(n1);
//					u.addNote(n2);
//
//					// Save the xy object
//					manager.persist(u);