 package com.example.MentalHealthApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomerUserDetailsService implements UserDetailsService {

	@Autowired
	private LoginRepository repo ;
	@Override
	public UserDetails loadUserByUsername(String emailid) throws UsernameNotFoundException {
		Login login  = repo.findByEmailid(emailid);

		if(login == null )
		{
			throw new UsernameNotFoundException("User not Found") ;
		}
		return new CustomeUserDetails(login);
	}

}
