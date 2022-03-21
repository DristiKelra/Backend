package com.example.MentalHealthApp;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import com.example.Mentscape.Logindomain.Login;

public interface LoginRepository extends JpaRepository<Login, String>
{
	@Query("SELECT l FROM Login l WHERE l.emailid = ?1")
	
//	Login findByEmailid(String emailid);
	Login findByEmailid(String emailid);
	Login findByEmailidAndPassword(String emailid,String Password);

	
	

	




 
}



