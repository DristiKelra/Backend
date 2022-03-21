package com.example.MentalHealthApp.Journal;

import java.util.List;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.Mentscape.Logindomain.Login;

public interface JournalRepository extends JpaRepository<Journal, Long>
{
	Journal findByuserid(Long userid);

	Journal findBytitle(String title);
//
//	void deleteBytitle(String title);
//	
//	void deleteById (Long id);

//	List<Journal> getAll();

	

 
}