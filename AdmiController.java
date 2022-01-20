package org.capgemini.Controller;

import java.util.List;

import org.capgemini.model.Customer;
import org.capgemini.model.Dabbawala;
import org.capgemini.model.FeedBack;
import org.capgemini.repository.CustomerRepository;
import org.capgemini.repository.DabbawalaRepository;
import org.capgemini.repository.FeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//controller is used to control the statements
@RestController
// requesting for the server to map the application
@RequestMapping("/api/v1")
public class AdmiController {


		@Autowired
		private  CustomerRepository customerRepository;
		
		//get customer information
		@GetMapping("Customer")
		public List<Customer> getCustomer(){
			return this.customerRepository.findAll();
		}
		
		@PostMapping("Customer")
		public Customer createCustomer(@RequestBody Customer Customerinfo) {
			return this.customerRepository.save (Customerinfo);
		}
		
		
		    @Autowired	
			private DabbawalaRepository dabbawalaRepository;
			
			//get information from Dabbawala
			@GetMapping("Dabbawala")
			public List<Dabbawala> getDabbawala(){
				return this.dabbawalaRepository.findAll();
			}
			
			@PostMapping("Dabawala")
			public Dabbawala createDabbawala(@RequestBody Dabbawala dabbawala) {
				return this.dabbawalaRepository.save(dabbawala);
		    }
		
			
			
			@Autowired
		    private FeedBackRepository feedBackRepository;
			// get the information for the feedback
			@GetMapping("Feedback_form")
			public List<FeedBack> getFeedBack(){
			   return this.feedBackRepository.findAll();
			}
		
		//get the feedback information
		    @PostMapping("Feedback_form")
		     public  FeedBack createdFeedBack(@RequestBody FeedBack feedBack) {
			     return this.feedBackRepository.save(feedBack);
		      }
		
	}
