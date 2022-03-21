package com.example.MentalHealthApp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.MentalHealthApp.Journal.Journal;
import com.example.MentalHealthApp.Journal.JournalRepository;




//import com.example.Mentscape.LoginService.LoginService;
//import com.example.Mentscape.Logindomain.Login;
//import com.example.Mentscape.Loginrepository.LoginRepository;


 
@Controller
public class LoginController {
	 @Autowired
	    private LoginRepository repo;
	     
	 @Autowired
	    private JournalRepository journalrepo ;
	    
	    @GetMapping("")
		public String viewLoginpage(Model model) {		
			
			model.addAttribute("login",new Login());
			
			return "LoginPage";
		}

	    
	    
	    @GetMapping("/Homepage")
	    public String ViewHomePage()
	    {
	    	return "Homepagemain";
	    }
	    
	    @GetMapping("/Advice")
	    public String ViewAdvice()
	    {
	    	return "advice";
	    }
	    
	    @GetMapping("/Quiz")
	    public String ViewQuiz()
	    {
	    	return "advice";
	    }
	    
	    @GetMapping("/Map")
	    public String ViewMap()
	    {
	    	return "map";
	    }
	    @GetMapping("/journal")
	    public String ViewJournal(Model journal)
	    {
	    	journal.addAttribute("journal",new Journal());
	    	
	    	return "Journal";
	    }
	    @PostMapping("/journaldetails")
	    public String journal(@ModelAttribute("journal") Journal journal ) {
	    	
	    	journalrepo.save(journal);
	    	 return "Homepagemain";
	        
	    }
	    @GetMapping("/list_thoughts")
	    
	    	public String viewthoughtslist(Model model)
	    	{
	    	   List<Journal>  thoughts = journalrepo.findAll();
	    	   model.addAttribute("thoughts" , thoughts);
	    	   
	    		return "Journal_thoughts";
	    	}
	   
	    
	    @GetMapping("/Calendar")
	    public String ViewCalendar()
	    {
	    	return "Calendar";
	    }
	
	    @GetMapping("/Loginpage")
	    public String ViewLoginPage()
	    {
	    	return "LoginPage";
	    }
	    
	    @Autowired
//    private LoginService LoginService;
//      public void setloginservice(LoginService LoginService) 
//      {
//    	 this.LoginService = LoginService;
//      }
    @GetMapping("/register")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("login", new Login());
        return mav;
    }
      @GetMapping("/Login")
  	public String loginHomePage() {
  		
  		return "Homepagemain";
  		
  	}

    @PostMapping("/process_register")
    public String login(@ModelAttribute("login") Login login ) {
    	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    	String encodedPassword =encoder.encode(login.getPassword());
        login.setPassword(encodedPassword);
    repo.save(login);
    return "Homepagemain";
    
    /* Login oauthUser = LoginService.login(login.getUsername(), login.getEmailid(),login.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/Homepagemain";
    
    
     } else {
     return "redirect:/Login";
    
    
     }*/
 
}
    
    
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/Homepagemain";
    }
}
