//package com.example.MentalHealthApp.Journal;
//
//
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.stereotype.Service;
//	 
//	import java.util.List;
//
//	import javax.transaction.Transactional;
//
//	//import com.example.Mentscape.Logindomain.Login;
//	//import com.example.Mentscape.Loginrepository.LoginRepository;
//	// 
//	 
//	 
//	@Service
//	@Transactional
//	public class JournalService {
//	@Autowired
//	private JournalRepository repo;
//	  
////	public List<Journal> listAll() {
////	    return repo.findAll();
////	}
//	 
//	public void save(Journal journal) {
//	    repo.save(journal);
//	}
//	 
//	public Login get(Long id) {
//	    return repo.findById(id).get();
//	}
//	 
//	public void delete(Long id) {
//	    repo.deleteById(id);
//	}
//
//	public Login get(String Username) {
//	    return repo.findByUsername(Username).get();
//	}
//	 
//	public void delete(String Username) {
//	    repo.deleteByUsername(Username);
//	}
//
//
//	  public Login login(String Username,String Emailid, String Password) {
//	  Login user = repo.findByUsernameAndPassword(Username,Password);
//	   return user;
//	  }
//	 
//	}
//
//
//}
