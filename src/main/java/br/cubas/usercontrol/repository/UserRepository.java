package br.cubas.usercontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import br.cubas.usercontrol.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
	
	public User findByUsername(String username);

	
	/*
	List<User> users = new ArrayList<>();
	
	
	UserRepository() {
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		
		User basic = new User("teste", passwordEncoder.encode("123456"));
		basic.getRoles().add(new Role("ROLE_BASIC"));
		users.add(basic);
		
		User admin = new User("admin", passwordEncoder.encode("123456"));
		admin.getRoles().add(new Role("ROLE_BASIC"));
		admin.getRoles().add(new Role("ROLE_ADMIN"));
		users.add(admin);
		
	}

	public User findByUsername(String username) {

		User user = null;

		for (User u : users) {

			if (u.getUsername().equals(username)) {
				user = u;
			}

		}
		
		System.out.println("lido " + user);

		return user;
	}

	public void save(User user) {
		users.add(user);
		System.out.println("adicionado " + user);
	}


	public List<User> findAll(){
		return users;
	}

	*/
}
